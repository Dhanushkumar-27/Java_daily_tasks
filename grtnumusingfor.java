import java.util.Scanner;
public class grtnumusingfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            int z = sc.nextInt();
            if (temp < z) {
                temp = z;
            }
        }
        
        System.out.println("The greatest number is: " + temp);
        sc.close();
    }
}
