//given year is leap or not

import java.util.Scanner;

public class L3B5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int a = sc.nextInt();
        int year = (a % 100 != 0 && a % 4 == 0 || a % 400 == 0) ? (29) : (28);
        if (year == 29) {
            System.out.print(a + " Is Leap Year");
        } else {
            System.out.print(a + " Is Not Leap Year");
        }
    }
}
