import java.util.Scanner;
public class diamand {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++)
                System.out.print(" ");
            for (int col = 1; col <= 2*row-1; col++)
                System.out.print("*");{
            }
            System.out.println();
        }
                for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++)
                System.out.print(" ");
            for (int col = 1; col <= 2*row-1; col++)
                System.out.print("*");{
        }
        System.out.println();
        }
    }
}
