import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] j = new int[n];

        for(int i = 0; i < n; i++){
            j[i] = sc.nextInt();
        }
        Arrays.sort(j);
        System.out.println(j[0]);
        System.out.print(j[n-1]);
    }
}