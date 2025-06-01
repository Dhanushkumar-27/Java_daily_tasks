import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a number to find the sum of its digits:");
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            int digit = a % 10; // Get the last digit
            sum += digit;       // Add it to the sum
            a /= 10;            // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
            
}
