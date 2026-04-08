//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}