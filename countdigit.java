import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int step= 0;
        while (n > 0) {
            n = n / 10;
            step++;
        }
        System.out.println(step);
    }
}
