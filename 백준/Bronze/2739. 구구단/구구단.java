import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}