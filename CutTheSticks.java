import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CutTheSticks {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int n;
        try{
        input=br.readLine();
        n = Integer.parseInt(input);
        int[] arr = new int[n];
        int k=0;
        input=br.readLine();
        String [] inputArr = input.split(" ");
        for(int i=0;i<inputArr.length;i++){
                arr[k]=Integer.parseInt(inputArr[i]);
                k++;
        }
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            int p=0;
            int count =0;
            int t;
            while(p<arr.length){
                t = arr[p];
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>0){
                        arr[i]-=t;
                        count++;
                    }
                }
                System.out.println(count);
                count=0;
                while(p<arr.length&&arr[p]<=0){
                    p++;
                }
            }
         
        }
        catch (IOException e){
            
        }
        }
    }