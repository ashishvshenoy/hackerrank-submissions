import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        try{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        System.out.println(factorial(n));
    }catch(IOException e){
        
    }
}
      public static BigInteger factorial(BigInteger n){
        if(BigInteger.valueOf(0).compareTo(n)==0||BigInteger.valueOf(1).compareTo(n)==0){
            return new BigInteger("1");
        }
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
