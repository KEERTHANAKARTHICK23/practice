import java.util.Scanner;
public class searchofelementarray{
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int i;
            int searchable;
            int size = kd.nextInt();
            int arr[]=new int [size];
            boolean found =false;
            System.out.println("enter the elements of array:");
            for (i=0;i<size;i++)
            {
                arr[i]=kd.nextInt();
            }
            searchable =kd.nextInt();
            for(i=0;i<size;i++)
            {
                if(arr[i]==searchable)
                {
                    found=true;
                    break;
                }
            }
             if(found)
             System.out.println("element found in the array");
             else
                System.out.println("element not found in the array");
    }

}


            

