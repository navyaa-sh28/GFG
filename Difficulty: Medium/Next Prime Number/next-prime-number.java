class Solution {
    public static int nextPrime(int n) {

        int num = n + 1;

        while (true) {

            boolean isPrime = true;

            // Check divisibility only till √num
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                return num;   // First prime found → immediate next prime
            }

            num++;  // Check next number
        }
    }
}