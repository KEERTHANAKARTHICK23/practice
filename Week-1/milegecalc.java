import java.util.Scanner;

public class milegecalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter beginning and ending odometer reading separated by a space: ");
        double startReading = sc.nextDouble();
        double endReading = sc.nextDouble();
        double distance = endReading - startReading;
        double ratePerMile = 25.0;
        double remuneration = distance * ratePerMile;
        System.out.printf("%.2f %.2f\n", distance, remuneration);

    
    }
}
