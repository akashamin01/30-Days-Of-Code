import java.util.*;
import java.io.*;

class Calculator{
    int power(int i, int j) throws Exception{
        if(i<0 || j<0){
            throw new Exception("n and p should be non-negative");                    
        }else{
            int res = 1;
            for (int l=1;l<=j;l++){
                res = res * i;
            }
            return res;
        }
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
