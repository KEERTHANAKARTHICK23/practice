import java.util.Scanner;
public class maxofarray{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int i;
            int size = kd.nextInt();
            int arr[]=new int [size];
            int max = Integer.MIN_VALUE;
            System.out.println("enter the elements of array:");
            for (i=0;i<size;i++)
            {
                arr[i]=kd.nextInt();
                if(max<arr[i])
                max = arr[i];
            }
            System.out.println("The max of array is:"+max);
}
    }
