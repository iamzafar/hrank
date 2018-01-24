/**
 * Created by Zafar on 1/4/2018.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int diagonal_1 = 0;
        int diagonal_2 = 0;

        // getting first diagonal
        for (int i = 0; i < a.length; i++){
            for (int j = i; j <= i; j++){
                diagonal_1 += a[i][j];
            }
        }

        int count = a.length - 1;
        int row = 0;
        // getting second diagonal
        while (count >= 0){
            diagonal_2 += a[row][count];
            count--;
            row++;
        }

        int difference =  Math.abs(diagonal_1 - diagonal_2);

        return difference;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("E:\\hackerRank\\input\\input00.txt"));
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                //System.out.print(a[a_i][a_j] + " ");
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}

