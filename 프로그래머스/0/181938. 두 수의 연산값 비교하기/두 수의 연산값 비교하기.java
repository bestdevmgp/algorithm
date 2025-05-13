class Solution {
    public int solution(int a, int b) {
        StringBuilder temp = new StringBuilder().append(a).append(b);
        int answer1 = Integer.parseInt(temp.toString());
        int answer2 = 2 * a * b;
        
        if (answer1 < answer2) return answer2;
        else return answer1;
    }
}