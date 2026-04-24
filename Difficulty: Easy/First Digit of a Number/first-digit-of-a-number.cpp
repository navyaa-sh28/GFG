int firstDigit(int n) {
    // code here
    while(n>0){
        if(n<10){
            return n;
        }
        n=n/10;
    }
}