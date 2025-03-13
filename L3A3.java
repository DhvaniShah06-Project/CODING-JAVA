//max with ternary

import java.util.Scanner;

public class L3A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter a value : ");
        int b = sc.nextInt();
        System.out.print("Enter a value : ");
        int c = sc.nextInt();
        int max;
        max = ((a > b)) ? ((a > c) ? (a) : (c)) : ((b > c) ? (b) : (c));
        System.out.print("Greatest Number : " + max);
    }
}
