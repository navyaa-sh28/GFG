// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        int n=Math.min(a,b);
        int m=Math.max(a,b);
        int i=1;
        int gcd=0;
        while(i<=n){
            if(n%i==0&&m%i==0){
                gcd=i;
                
            }
            i++;
        }
        return gcd;
    }
}