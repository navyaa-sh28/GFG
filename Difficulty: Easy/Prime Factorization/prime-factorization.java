class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        int i=2;
        while(n!=1){
            if(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
            else if(n%i!=0&&i==2){
                i++;
            }
            else{
                i=i+2;
            }
        }
    }
}
