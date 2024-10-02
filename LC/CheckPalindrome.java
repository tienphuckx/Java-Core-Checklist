public boolean isPalindrome(int x) {
    long y = (long) x;
    long reverseNumber = 0;
    long temp = y;
        
    if (y < 0) {
        return false;
    }
        
    while (y != 0) {
        long d = y % 10;
        reverseNumber = reverseNumber * 10 + d;
        y = y / 10;
    }

    return temp == reverseNumber;
}

