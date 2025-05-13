class Solution {
    public int solution(int n) {
        int temp = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                temp += i;
            }
            return temp;
        } else {
            for (int i = 0; i <= n; i+=2) {
                temp += i*i;
            }
            return temp;
        }
    }
}