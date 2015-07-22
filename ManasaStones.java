import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        Map m = new HashMap<Integer,Integer>();
        for(int i=0;i<testCases;i++){
            int noOfStones = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int t;
            if(b>a){
                t=a;
                a=b;
                b=t;
            }
            for(int j=0;j<=noOfStones-1;j++){
                int possibleValue = (noOfStones-j-1)*b+j*a;
                if(!m.containsKey(possibleValue)){
                    m.put(possibleValue,1);
                    System.out.print(possibleValue+" ");
                }
            }
            System.out.println();
        }
    }
}