import java.util.Scanner;
public class sumofnarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        System.out.println("Enter the index value  : ");
        int i = sc.nextInt();
        int[] ECE_F = new int[i];
        System.out.println("Enter the elements : ");
        for(int j = 0 ; j < i ; j++) {
            ECE_F[j] = sc.nextInt(); 
            
        }
        for(int j = 0; j < i ; j++) {
            sum += ECE_F[j];
            
        }
        System.out.println(sum  + " This is the sum of the elements in the array ");
        for(int j = 0; j < i ; j++) {
            System.out.print(ECE_F[j]);
        }
        sc.close();
    }
    
}