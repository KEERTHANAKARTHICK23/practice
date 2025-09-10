import java.util.Scanner;
public class armstrongnumber{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = kd.nextInt();
            int originalnum=num;
            int sum=0;
            while(num!=0)
            {
                int dig=num%10;
                sum = (dig*dig*dig)+sum;
                num=num/10;
            }
        if(sum==originalnum)
            {
                System.out.println("ARMSTRONG NUMBER");

            }
             else
            {
                System.out.println("NOT ARMSTRONG NUMBER");
            }
    }
}
            