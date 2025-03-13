
import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        int sum = 0, rem, i = 0;
        for (int count = 0; a != 0; count++) {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
            i = i + 1;
        }
        System.out.print("Total digits : " + i);
    }
}
