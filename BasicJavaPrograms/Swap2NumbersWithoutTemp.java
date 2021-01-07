import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int a=17;
        int b=11;
        System.out.printf("a=%d <-> b=%d",a,b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.printf("\na=%d <-> b=%d",a,b);
    }
}
