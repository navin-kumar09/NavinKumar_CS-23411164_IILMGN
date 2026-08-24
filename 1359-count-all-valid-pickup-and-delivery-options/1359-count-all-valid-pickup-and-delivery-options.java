class Solution {
    public int countOrders(int n) {
        long mod = 1_000_000_007;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = (result * (2L * i - 1)) % mod;
            result = (result * i) % mod;
        }

        return (int) result;
    }
}