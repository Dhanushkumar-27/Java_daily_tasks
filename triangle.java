/*public class triangle{
*    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }
} */
/* 
public class triangle {

    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            System.out.println("");
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */
public class triangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}