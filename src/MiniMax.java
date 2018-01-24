/**
 * Created by Zafar on 1/5/2018.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class MiniMax {
    static void miniMaxSum(int[] arr) {
        // Complete this function
//        for (int x : arr)
//            System.out.println(x);
        BigInteger [] sum = new BigInteger[5];

        // calculating sum
        for (int i = 0; i < arr.length; i++){
            switch (i){
                case 0:
                    sum[0] = BigInteger.valueOf(arr[1] + arr[2] + arr[3] + arr[4]);
                    break;
                case 1:
                    sum[1] = BigInteger.valueOf(arr[0] + arr[2] + arr[3] + arr[4]);
                    break;
                case 2:
                    sum[2] = BigInteger.valueOf(arr[1] + arr[0] + arr[3] + arr[4]);
                    break;
                case 3:
                    sum[3] = BigInteger.valueOf(arr[1] + arr[2] + arr[0] + arr[4]);
                    break;
                case 4:
                    sum[4] = BigInteger.valueOf(arr[1] + arr[2] + arr[3] + arr[0]);
                    break;
            }
        }

        // getting min or max
        BigInteger min = sum[0];
        BigInteger max = sum[sum.length-1]; // get te max from the end
        int counMin = 1;
        int countMax = sum.length-2;

        while (counMin < sum.length){
            if (sum[counMin].compareTo(min) == -1){
                min = sum[counMin];
            }

            if (sum[countMax].compareTo(max) == 1){
                max = sum[countMax];
            }

            counMin++;
            countMax--;
        }

        System.out.println(min + " " + max);

    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("E:\\hackerRank\\input\\input04.txt"));
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
