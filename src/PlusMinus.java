/**
 * Created by Zafar on 1/5/2018.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        double [] fractions = new double[3];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                fractions[0] +=1;       // positive numbers
            }else if (arr[i] < 0){
                fractions[1] +=1;       // negative
            }else fractions[2] += 1;    // zero
        }

        NumberFormat formatter = new DecimalFormat("#0.0000");
        // printing floats with 4 decimal places
        System.out.println(formatter.format(fractions[0]/arr.length));
        System.out.println(formatter.format(fractions[1]/arr.length));
        System.out.println(formatter.format(fractions[2]/arr.length));



    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("E:\\hackerRank\\input\\input02.txt"));
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
