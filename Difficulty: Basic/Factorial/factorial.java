class Solution {
    public int factorial(int n) {
        int fact=1;
        for(int i=1;i<n+1;i++){
            fact=fact*i;
        }
        return fact;
    }
}
