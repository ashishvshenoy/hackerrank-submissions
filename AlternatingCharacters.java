import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            String str = s.next();
            int deletion=0;
            int startIndex = 0;
            for(int j=1;j<str.length();j++){
                if(str.charAt(startIndex)==str.charAt(j)){
                    deletion++;
                }else{
                    startIndex = j;
                }
            }
            System.out.println(deletion);
        }
    }
}