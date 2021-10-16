package com.matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions of first matrix: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Enter dimensions of second matrix: ");
        c = scanner.nextInt();
        d = scanner.nextInt();

        if( b != c)
        {
            System.out.println("Invalid matrix sizes for multiplying.");
            System.exit(0);
        }

        int[][] fm = new int[a][b];
        int[][] sm = new int[c][d];

        System.out.println("Enter values in first matrix: ");
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                fm[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter values in second matrix: ");
        for(int m = 0; m < c; m++)
        {
            for(int n = 0; n < d; n++)
            {
                sm[m][n] = scanner.nextInt();
            }
        }

        System.out.println();

        MatrixMultiply mm = new MatrixMultiply();
        int[][] multFinal = mm.multiply(fm, sm);

        for(int s = 0; s < a; s++)
        {
            for(int t = 0; t < d; t++)
            {
                System.out.print(multFinal[s][t] + " ");
            }
            System.out.println();
        }
    }
}
