import java.util.Scanner;
public class forloop{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = kd.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                
               System.out.print("*");
        }
        System.out.println("*");
        }
    }
               
}

