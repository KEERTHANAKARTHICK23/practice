import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        try (Scanner kd = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = kd.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is Even.");
            } else {
                System.out.println(number + " is Odd.");      
            }
        }
    }
}
