import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigitsSolution {

    public static void main(String[] args) {
        try{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i=0;i<testCases;i++){
            int count=0;
            String number = br.readLine();
            for(int j=0;j<number.length();j++){
                int digit = Integer.parseInt(""+number.charAt(j));
                int num = Integer.parseInt(number);
                if(digit!=0&&num%digit==0){
                    count++;
                }
            }
            System.out.println(count);
        }
        }catch(IOException e){
            
        }
    }
}