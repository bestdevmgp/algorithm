import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            for (int j = 0; j < i; j++){
                sum += 1;
            }
            int M = A+B;
            System.out.println(M);
        }

    }
}