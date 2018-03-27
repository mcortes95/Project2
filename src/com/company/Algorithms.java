package com.company;

public class Algorithms {
    private int[][] W;
    private int[][] D;
    private int[][] P;

    public Algorithms(int[][] Win){
        W=Win.clone();
        for(int x=0;x<W.length;x++){
            W[x]=W[x].clone();
        }
    }

    public void printW(){
        print2dArray(W);
        System.out.println("W");
    }

    public void floyd(){
        int n=W.length;
        D=W.clone();
        for(int x=0;x<W.length;x++)
            D[x]=D[x].clone();
        for(int k=0;k<n;k++)
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(D[i][k]+D[k][j]<D[i][j])
                        D[i][j]=D[i][k]+D[k][j];
        print2dArray(D);
        System.out.println("D");
    }

    public void floyd2(){
        int n=W.length;
        P=new int[n][n];
        D=W.clone();
        for(int x=0;x<W.length;x++)
            D[x]=D[x].clone();
        for(int k=0; k<n;k++)
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(D[i][k]+D[k][j]<D[i][j]) {
                        P[i][j]=k+1;
                        D[i][j]=D[i][k]+D[k][j];
                    }
        print2dArray(D);
        System.out.println("D");
        print2dArray(P);
        System.out.println("P");
    }

    public void path(int q,int r){
        System.out.print("\nShortest Path from Vertex "+q+ " to Vertex "+r+"\nv"+q+" -> ");
        path1(q,r);
        System.out.print("v"+r+"\n");
    }

    public void path1(int q,int r){
        if(P[q-1][r-1]!=0){
            path1(q,P[q-1][r-1]);
            System.out.print("v"+P[q-1][r-1]+" -> ");
            path1(P[q-1][r-1],r);
        }
    }

    private void print2dArray(int A[][]){
        System.out.print("\n");
        for(int x=0;x<A.length;x++) {
            for (int y=0;y<A.length;y++)
                System.out.print(A[x][y]+" ");
            System.out.print("\n");
        }
    }
}
