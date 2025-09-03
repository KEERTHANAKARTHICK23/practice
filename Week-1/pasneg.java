import java.util.Scanner;

public class pasneg {
    public static void main(String[] args) {
        try (Scanner kd = new Scanner(System.in)) {
            int n = kd.nextInt();

            if (n > 0) {
                System.out.println("Positive");
            } else if (n < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
