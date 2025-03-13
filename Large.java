
import java.util.Scanner;

public class Large {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter a value : ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.print(a + " is greater");
        } else {
            System.out.print(b + " is greater");
        }

    }
}
