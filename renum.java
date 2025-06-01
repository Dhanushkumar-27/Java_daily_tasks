import java.util.Scanner;  
public class renum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        int reverseNum = 0;

        while (num != 0) {
            int d = num % 10;
            reverseNum = reverseNum * 10 + d;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reverseNum);
        sc.close();
    }
}
