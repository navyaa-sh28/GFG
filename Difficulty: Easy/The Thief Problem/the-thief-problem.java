// User function Template for Java
import java.util.*;
class Solution {
    public static int getMaxVal(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        int sum=0;
        for(int i=arr.length-1;i>=arr.length-k;i--){
            sum=sum+arr[i];
        }
        return sum;
    }
}