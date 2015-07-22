import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockBeastSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int k=0;k<testCases;k++){
            BigInteger largestDecent = new BigInteger("-999");
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<=N;i++){
                int noOf3s = i;
                String decentNumber = "";
                int noOf5s = N-i;
                if(checkForDecency(noOf5s, noOf3s)){
                    int p=0;
                    while(p<noOf5s){
                        decentNumber+="5";
                        p++;
                    }
                    p=0;
                    while(p<noOf3s){
                        decentNumber+="3";
                        p++;
                    }
                    largestDecent = new BigInteger(decentNumber);
                }
            }
            if(largestDecent.compareTo(new BigInteger("-999"))!=0){
                System.out.println(largestDecent);
            }else {
                System.out.println("-1");
            }
        }
        }catch(IOException e){
            
        }
    }
    
    public static boolean checkForDecency(int noOf5s, int noOf3s){
        if((noOf3s%5 == 0) && (noOf5s%3 == 0)){
            return true;
        }
        return false;
    }
}