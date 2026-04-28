class Solution {
  public:
    bool isPrime(int n) {
        // code here
        if(n==1||n==0){
                return false;
            }
            else{
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    }
};
