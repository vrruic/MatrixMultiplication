package com.matrix;

public class MatrixMultiply {
    public int[][] multiply(int[][] left, int[][] right)
    {
        int[][] result = new int[left.length][right[0].length];
        int insert;

        for(int x = 0; x < left.length; x++)
        {
            for(int y = 0; y < right[0].length; y++)
            {
                insert = 0;
                for(int z = 0; z < left[0].length; z++)
                {
                    insert += left[x][z] * right[z][y];
                }
                result[x][y] = insert;
            }
        }

        return result;
    }
}
