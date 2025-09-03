import java.util.Scanner;

public class daysconvert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int days = sc.nextInt();

            int years = days / 365;
            int remainingDays = days % 365;
            int months = remainingDays / 30;
            int finalDays = remainingDays % 30;

            System.out.println("Years: " + years);
            System.out.println("Months: " + months);
            System.out.println("Days: " + finalDays);
        }
    }
}