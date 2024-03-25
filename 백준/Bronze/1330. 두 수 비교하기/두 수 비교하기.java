import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer A = scanner.nextInt();
        Integer B = scanner.nextInt();

        if (A > B){
            System.out.println(">");
        } else if (A < B){
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}