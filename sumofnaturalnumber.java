import java.util.Scanner;

public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to sum:");
        int n = sc.nextInt();
        System.out.println("sum= " +(n*(n + 1))/2);
        sc.close();
    }
    
}
