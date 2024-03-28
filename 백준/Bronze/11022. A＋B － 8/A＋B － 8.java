import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int num = 1;

        for (int i = 0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            C = A+B;
            System.out.println("Case #"+num+": "+A+" + "+B+" = "+C);
            num++;
        }
    }
}