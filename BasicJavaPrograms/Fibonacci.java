import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int a=0, b=1, c, n=10;
        System.out.println(a+"\n"+b);
        for(int i=0; i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
