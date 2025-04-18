public class Solution {
    public static String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1, str2));
    }
}