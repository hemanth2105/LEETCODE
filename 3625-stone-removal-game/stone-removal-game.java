
class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }

        int a = n;
        int count = 10;
        int f = 0;

        while (a >= count) {
            a = a - count;
            count--;
            f++;
        }

        
        return f % 2 != 0;
    }
}
