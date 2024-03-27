import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int time = h*60+m;
        int hour = time / 60;
        int min = time - h*60 - 45;

        if (min < 0){
            hour -= 1;
            min += 60;
        }

        if (hour < 0){
            hour += 24;
        }

        System.out.print(hour + " " + min);
    }
}