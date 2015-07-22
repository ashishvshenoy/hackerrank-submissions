import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SongOfPie {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String pi = "31415926535897932384626433833";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            for(int i=0;i<testCases;i++){
                String song = br.readLine();
                String[] songArr = song.split(" ");
                int index = 0;
                boolean flag = false;
                for(String s:songArr){
                    if(s.length()==Integer.parseInt(""+pi.charAt(index))){
                        index++;
                        continue;
                    } else {
                        System.out.println("It's not a pi song.");
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("It's a pi song.");
                }
            }
        }catch(IOException e){
            
        }
    }
}