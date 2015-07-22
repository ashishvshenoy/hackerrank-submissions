import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumBday {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            int B = s.nextInt();
            int W = s.nextInt();
            int costOfBlack = s.nextInt();
            int costOfWhite = s.nextInt();
            int costOfExchange = s.nextInt();
            if(costOfBlack<costOfWhite){
                if(costOfBlack+costOfExchange<costOfWhite){
                    costOfWhite = costOfBlack+costOfExchange;
                }
            }else{
                if(costOfWhite+costOfExchange<costOfBlack){
                    costOfBlack = costOfWhite+costOfExchange;
                }
            }
            System.out.println((long)((long)costOfWhite*W + (long)costOfBlack*B));
        }
    }
}