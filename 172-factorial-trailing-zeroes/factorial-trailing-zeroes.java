class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        // Keep dividing n by 5 until n becomes 0
        while (n > 0) {
            n /= 5;       // Count how many multiples of 5, 25, 125...
            count += n;   // Add them to the total
        }
        return count;
    }
}
