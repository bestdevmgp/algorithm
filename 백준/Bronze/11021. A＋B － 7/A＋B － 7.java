import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num = 0;

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            num+=1;
            System.out.println("Case #" + num +": " + (a+b));
        }
    }
}