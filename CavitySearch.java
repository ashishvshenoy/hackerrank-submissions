import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavitySearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] map = new char[n][n]; 
        for(int i=0;i<n;i++){
            String line = s.next();
            for(int j=0;j<n;j++){
                map[i][j] = line.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=0&&j!=0&&i!=n-1&&j!=n-1){
                    if(map[i-1][j]!='X'&&map[i][j-1]!='X'&&map[i+1][j]!='X'&&map[i][j+1]!='X'&&(int)map[i-1][j]<(int)map[i][j]&&(int)map[i][j-1]<(int)map[i][j]&&(int)map[i+1][j]<(int)map[i][j]&&(int)map[i][j+1]<(int)map[i][j]){
                        map[i][j]='X';
                        System.out.print('X');
                    }else {
                        System.out.print(map[i][j]);
                    }
                }else{
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}