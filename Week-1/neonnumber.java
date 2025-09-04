import java.util.Scanner;
public class neonnumber{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = kd.nextInt();
            int num=n*n;
            int sum=0;
            while(num!=0)
            {
                int dig=num%10;
                sum = sum+dig;
                num=num/10;
            }
            if(sum==n)
            {
                System.out.println("NEON NUMBER");

            }
             else
            {
                System.out.println("NOT NEON NUMBER");
            }
        
    }
}
            