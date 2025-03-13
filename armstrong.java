
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int b = sc.nextInt();
        sc.close();
        int n, sum = 0, r;
        n = b;

        while (b != 0) {
            r = b % 10;
            sum = sum + (r * r * r);
            b = b / 10;
        }
        if (sum == n) {
            System.out.print("Number is Armstrong");
        } else {
            System.out.print("Number is not armstrong");
        }
    }
}
