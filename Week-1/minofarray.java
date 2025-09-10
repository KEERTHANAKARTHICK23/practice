import java.util.Scanner;
public class minofarray{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int i;
            int size = kd.nextInt();
            int arr[]=new int [size];
            int min = Integer.MAX_VALUE;
            System.out.println("enter the elements of array:");
            for (i=0;i<size;i++)
            {
                arr[i]=kd.nextInt();
                if(min>arr[i])
                min = arr[i];
            }
            System.out.println("The max of array is:"+min);
}
    }