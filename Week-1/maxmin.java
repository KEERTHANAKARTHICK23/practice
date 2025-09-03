import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = (a > b) ? a : b;
            int min = (a < b) ? a : b;

            System.out.println("Max=" + max + " Min=" + min);
        }
    }
}