import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean[] charArr = new boolean[256];
        char index = 'a';
        while((int)index<=(int)'z'){
            charArr[(int)index]=false;
            index++;
        }
        for(int i=0;i<s.length();i++){
            s = s.toLowerCase();
            //System.out.println(s.charAt(i));
            charArr[(int)s.charAt(i)] = true;
        }
        index = 'a';
        boolean flag = true;
        while((int)index<=(int)'z'){
            //System.out.println(charArr[(int)index]);
            flag = flag&&charArr[(int)index];
            index++;
        }
        if(flag){
            System.out.println("pangram");
        }else {
            System.out.println("not pangram");
        }
    }
}