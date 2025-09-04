import java.util.Scanner;

public class sbicardapply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryage = sc.nextInt();
        int age = sc.nextInt();
        int employment = sc.nextInt();
        int income = sc.nextInt();
        if(primaryage>=21&&age>=18&&employment>0&&employment<5&&income>=300000)
        {
            System.out.println("eligible");

        }
        else{
            System.out.println("not eligible");

        }
    }
}

        
            
        