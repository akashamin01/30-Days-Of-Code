import java.util.*;

class MergeArrays {
    public static void main(String[] args){
    int arr1[] = {4,6,8};
    int arr2[] = {5,7};
    int l1 = arr1.length;
    int l2 = arr2.length;
    int newlength = l1+l2; 
    int newArr[] = new int[newlength];
    int k = 0;
    for(int i=0;i<l1;i++){
        newArr[k] = arr1[i];
        k++;
    }
    for(int i=0;i<l2;i++){
        newArr[k] = arr2[i];
        k++;
    }
    Arrays.sort(newArr);
    for(int i=0;i<newlength;i++){
        System.out.print("\n"+newArr[i]);
    }
    }
}
