import java.util.Scanner;
public class lettersquare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= n; col++) {
               System.out.print(ch++);
        }
        System.out.println();
        }
    }
}