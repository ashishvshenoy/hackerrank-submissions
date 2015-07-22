import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i=0;i<testCases;i++){
            String s = scan.next();
            String rev = "";
            for(int j=0;j<s.length();j++){
                rev+=s.charAt(s.length()-j-1);
            }
            boolean flag = true;
            //System.out.println("String : "+s+" length "+s.length()+" Reverse: "+rev+" length "+rev.length());
            for(int k=1;k<s.length();k++){
                int diff1 = (int)s.charAt(k) - (int)s.charAt(k-1);
                int diff2 = (int)rev.charAt(k) - (int)rev.charAt(k-1);
               //System.out.println(diff1+ " - "+diff2);
                if(Math.abs(diff1)!=Math.abs(diff2)){
                    flag = false;
                }
            }
            if(!flag){
                System.out.println("Not Funny");
            }else {
                System.out.println("Funny");
            }
        }
        
    }
}