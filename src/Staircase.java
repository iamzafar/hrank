/**
 * Created by Zafar on 1/5/2018.
 */
import java.io.*;
import java.util.*;

public class Staircase {
    static void staircase(int n) {
        // Complete this function
        for (int i = 0; i < n; i++){
            // printing spaces
            for (int j = n-1; j > i; j--){
                System.out.print(" ");
            }

            // printing
            for (int k = 0; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws  IOException{
        Scanner in = new Scanner(new File("E:\\hackerRank\\input\\input01.txt"));
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
