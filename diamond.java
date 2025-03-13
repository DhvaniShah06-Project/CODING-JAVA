
import java.util.Scanner;

public class diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < (a - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (j != 0 && j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }

        for (int i = a - 1; i > 0; i--) {
            for (int k = a - i + 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                if (j == i || j == 1) {
                    System.out.print("* ");
                } else if (j != i && j != 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
