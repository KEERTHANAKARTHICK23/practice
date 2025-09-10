import java.util.Scanner;
public class array{
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
            for (i=0;i<size;i++)
            {
                System.out.println(arr[i]+"");
            }
    }
}
            