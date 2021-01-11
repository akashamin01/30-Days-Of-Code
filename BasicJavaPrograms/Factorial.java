import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int n=4;
        int result = 1;
        for(int i=1; i<=n;i++){
            result=i*result;
        }
        System.out.println(result);
    }
}
