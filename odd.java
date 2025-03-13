
import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        sc.close();
        if ((a & 1) == 0) {
            System.out.print(a + " Is Even");
        } else {
            System.out.print(a + " Is Odd");
        }
    }
}
