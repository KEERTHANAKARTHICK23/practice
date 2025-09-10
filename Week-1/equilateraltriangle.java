import java.util.Scanner;
public class equilateraltriangle {

    private static boolean b;
    private static boolean c;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
               System.out.print("* ");
        }
        System.out.println();
        }
        boolean a = false;
        if(a==b&&a==c)
            System.out.println(" Equilateral Triangle");
            else{
                System.out.println("not Equilateral Triangle");
            }
    }
}    
        