import java.util.Scanner;

public class primenumberusingtemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a number to check if it is prime:");
        int a = sc.nextInt();
        int temp = 0;
        for (int i=2; i <= a; i++) {
            if (a % i == 0) {
                temp  =  1; 
            }
        }
        if (temp ==1){
            System.out.println("The number not is prime");
        }else {
            System.out.println("The number is  prime");
        }
        sc.close();
    }

    }

