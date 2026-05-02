class Solution {
    public int nthTerm(int a, int r, int n) {
        int mod = 1000000007;
        long result = a;

        for (int i = 1; i < n; i++) {
            result = (result * r) % mod;
        }

        return (int) result;
    }
}