class Solution {
    public int lastDigit(int n) {
        // Code here
        if(n>0){
        return n%10;
    }
    else{
        return -(n%10);
    }
}
}