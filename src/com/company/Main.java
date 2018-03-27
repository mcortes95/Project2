package com.company;


public class Main {
    public static void main(String[] args) {

        int[][] W1=new int[][]{
                {0,1,99,1,5},
                {9,0,3,2,99},
                {99,99,0,4,99},
                {99,99,2,0,3},
                {3,99,99,99,0},
        };
        int[][] W2=new int[][]{
                {0,6,99,5,12,13},
                {9,0,99,14,8,6},
                {99,10,0,9,19,99},
                {9,99,99,0,18,7},
                {99,99,17,99,0,11},
                {15,21,11,36,2,0}
        };
        Algorithms test1=new Algorithms(W1);
        Algorithms test2=new Algorithms(W2);
        test1.printW();
        //test1.floyd();
        test1.floyd2();
        test1.path(5,3);

        test2.printW();
        //test2.floyd();
        test2.floyd2();
        test2.path(1,3);

    }
}
