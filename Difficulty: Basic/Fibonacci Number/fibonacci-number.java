import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println(ans);
    }
    public static int fib(int n){
            if(n==0||n==1){
                return n;
            }
            else {
                return(fib(n-2)+fib(n-1));
            }
        }
}