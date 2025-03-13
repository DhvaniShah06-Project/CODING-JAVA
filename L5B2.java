//pattern

import java.util.Scanner;

public class L5B2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < (a - i - 1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (int i = a - 1; i > 0; i--) {
            for (int k = a - i + 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
