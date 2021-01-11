import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int num=125261;
        int numx=num;
        int revnum = 0,i=0;
        while(num!=0){
            i = num%10;
            revnum = (revnum*10) + i;
            num = num / 10; 
        }
        
        if(numx == revnum){
            System.out.println("Palindrome");    
        }else{
            System.out.println("Not A Palindrome");
        }
    }
}
