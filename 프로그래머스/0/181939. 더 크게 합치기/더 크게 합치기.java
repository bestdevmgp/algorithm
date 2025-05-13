class Solution {
    public int solution(int a, int b) {
        StringBuilder temp1 = new StringBuilder().append(a).append(b);
        int answer1 = Integer.parseInt(temp1.toString());
        StringBuilder temp2 = new StringBuilder().append(b).append(a);
        int answer2 = Integer.parseInt(temp2.toString());
        
        if (answer1 < answer2) return answer2;
        else return answer1;
    }
}