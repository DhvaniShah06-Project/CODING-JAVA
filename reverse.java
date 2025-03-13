
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        int sum = 0, rem;
        sc.close();
        for (; a != 0;) {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
        }
        System.out.print("Reverse : " + sum);
    }
}
