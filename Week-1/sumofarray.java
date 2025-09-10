import java.util.Scanner;
public class sumofarray{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int i;
            int size = kd.nextInt();
            int arr[]=new int [size];
            System.out.println("enter the elements of array:");
            for (i=0;i<size;i++)
            {
                arr[i]=kd.nextInt();
            }
            int sum=0;
            for (i=0;i<size;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("The sum of array is:"+sum);
}
    }

