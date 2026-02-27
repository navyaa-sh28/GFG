import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0&&i!=1){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        
    }
}