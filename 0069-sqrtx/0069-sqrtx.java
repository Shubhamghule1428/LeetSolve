class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        long left = 1;
        long right = x;
        long ans = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            // Check if mid * mid is less than or equal to x
            if (mid * mid <= x) {
                ans = mid; // Potential answer
                left = mid + 1; // Look for a larger valid square root
            } else {
                right = mid - 1; // mid * mid is too large, look smaller
            }
        }
        return (int) ans;
    }
}