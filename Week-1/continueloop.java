import java.util.Scanner;
public class continueloop{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = kd.nextInt();
            int i;
            for(i=0;i<n;i++)
            {
                if(i==5)
                {
                    continue;
                
                }
                System.out.println(i);


            }
    }
}