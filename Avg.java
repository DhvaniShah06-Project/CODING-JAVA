
import java.util.Scanner;

public class Avg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter a value : ");
        int b = sc.nextInt();
        System.out.print("Enter a value : ");
        int c = sc.nextInt();
        System.out.print((a + b + c) / 3.0);
        sc.close();
    }
}
