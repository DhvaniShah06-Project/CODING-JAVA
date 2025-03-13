//palindrome or not

import java.util.Scanner;

public class L3B6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int b, r, sum = 0;
        b = a;
        for (; b != 0;) {
            r = b % 10;
            sum = sum * 10 + r;
            b = b / 10;
        }
        if (sum == a) {
            System.out.print(a + " : Is Palindrome");
        } 
        else {
            System.out.print(a + " : Not Palindrome;");
        }
    }
}
