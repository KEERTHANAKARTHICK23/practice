public class binary{
    public static void main(String[] args){ 
    int n = 3;
     {
        for (int a = 1; a <= n; a++) {
            for (int i = 0; i <= a; i += a) {
                for (int j = 0; j <= a; j += a) {
                    for (int k = 0; k <= a; k += a)
                    System.out.println(i+""+j+""+k);
                }
            }
        }
System.out.println();
    }
}
}