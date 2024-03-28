import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int whole = 0;

        for (int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            whole += x*y;
        }
        if (whole == total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}