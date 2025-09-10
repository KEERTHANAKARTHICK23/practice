import java.util.Scanner;
public class breakloop{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = kd.nextInt();
            int i;
            int m=n;
            while(m>0){
            for(i=0;i<n;i++)
            {
                if(i==5)
                {
                    break;
                
                }
                System.out.println(i);


            }
            m--;
            }
    }
}