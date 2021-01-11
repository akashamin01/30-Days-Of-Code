import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        for(int x=0;x<n;x++){
            String s1 = sc.nextLine();
            char[] ch1 = s1.toCharArray();                                         
            StringBuilder sb1e = new StringBuilder(); 
            StringBuilder sb1o = new StringBuilder();      
            for(int i=0; i<s1.length(); i++){
                if(i%2 == 0){   
                    sb1e.append(ch1[i]);                            
                }else{  
                    sb1o.append(ch1[i]);              
                }
            }    
            // System.out.println(n);
            System.out.println(sb1e.toString()+" "+sb1o.toString());     
        }
    }
}
