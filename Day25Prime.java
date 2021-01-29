import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            int x = sc.nextInt();
            int flag=0; 
            if(x==0 || x==1){
                System.out.println("Not prime");                                        
            }else{                
            for(int j = 2; j<=x/2; j++){
                if(x%j == 0){
                    System.out.println("Not prime");                    
                    flag = 1;
                    break;
                }
            } 
            if(flag == 0){
                System.out.println("Prime");   
            }
        }
        }
    }
}
