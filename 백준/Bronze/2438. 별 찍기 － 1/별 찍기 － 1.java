import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}