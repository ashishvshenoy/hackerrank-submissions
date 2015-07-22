import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProffessorSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCases = br.readLine();
        for(int i=0;i<Integer.parseInt(testCases);i++){
            String nkLine = br.readLine();
            String[] nkLineArr = nkLine.split(" ");
            int n = Integer.parseInt(nkLineArr[0]);
            int k = Integer.parseInt(nkLineArr[1]);
            String arrivalTimeLine = br.readLine();
            String[] arrivalTimes = arrivalTimeLine.split(" ");
            int count=0;
            for(String s : arrivalTimes){
                if(Integer.parseInt(s)<=0){
                    count++;
                }
            }
            if(count>=k){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
        }catch(IOException e){
            
        }
    }
}