import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for(int i = 1; i < n+1; i++){
            for(int x = 0; x < n-i; x++){
                System.out.printf(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}