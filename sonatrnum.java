import java.util.Scanner;
public class sonatrnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int temp = 0; 
        for(int i = 0; i < 9; i++){
            temp += sc.nextInt();
            System.out.println("the sum of numbers:"+ temp);
        }
        sc.close();
    }
}
