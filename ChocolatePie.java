import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolatePie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
         //Write code to solve each of the test over here
        int wrapperCount = 0;
        int chocolateCount = 0;
        while(N-C>=0){
            wrapperCount++;
            chocolateCount++;
            N-=C;
        }
        while(wrapperCount-M>=0){
            wrapperCount++;
            chocolateCount++;
            wrapperCount-=M;
        }
        return (long)chocolateCount;
    }
    
    
}
