import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isUpperCase(temp)) {
                result.append(Character.toLowerCase(temp));
            } else if (Character.isLowerCase(temp)) {
                result.append(Character.toUpperCase(temp));
            } else {
                result.append(temp);
            }
        }

        System.out.println(result.toString());
    }
}