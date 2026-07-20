class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (e.g., -121 -> 121-)
        // 2. If the last digit is 0, the first digit must also be 0 (only 0 itself satisfies this)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // Reverse digits until we reach the middle of the number
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // For even-length numbers: x == revertedNumber (e.g., 1221 -> x = 12, reverted = 12)
        // For odd-length numbers: x == revertedNumber / 10 (e.g., 12321 -> x = 12, reverted = 123)
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
