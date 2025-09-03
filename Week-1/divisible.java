
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        try (Scanner kd = new Scanner(System.in)) {
            int n = kd.nextInt();

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
} 