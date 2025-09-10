import java.util.Scanner;
public class countarrayelement{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int i;
            int count = 0;
            int size = kd.nextInt();
            int arr[]=new int [size];
            System.out.println("enter the elements of array:");
            for(i=0;i<size;i++)
            {
                arr[i]=kd.nextInt();
            }
            System.out.println("enter the key element:");
            int key = kd.nextInt();
        
            for(i=0;i<size;i++)
            {
                if(arr[i]<key)
                count++;
            }
             System.out.println("The count of elements less than key is:"+count);
    }        
   
}

