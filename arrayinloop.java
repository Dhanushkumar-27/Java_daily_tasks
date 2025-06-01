import java.util.Scanner;
/*public class arrayinloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in ECE_F:");
        int[] ECE_F = new int[10];

        for (int i = 0; i < 10; i++) {
            ECE_F[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Roll.no: " + ECE_F[i]);
        }
        sc.close();
    }
}

public class arrayinloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in ECE_F:");
        int[] ECE_F = new int[10];

        for (int i = 0; i < 10; i++) {
            ECE_F[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Roll.no: " + ECE_F[i]);
        }
        sc.close();
    }
    
}*/
public class arrayinloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in ECE_F:");
        int numStudents = sc.nextInt();
        int[] ECE_F = new int[numStudents];

        System.out.println("Enter the roll numbers:");
        for (int i = 0; i < numStudents; i++) {
            ECE_F[i] = sc.nextInt();
        }

        System.out.println("Roll numbers in ECE_F:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Roll.no: " + ECE_F[i]);
        }
        sc.close();
    }
}