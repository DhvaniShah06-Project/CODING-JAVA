//prime number in given range

import java.util.Scanner;

public class L3C7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        System.out.print("Enter a Number : ");
        int b = sc.nextInt();
        int i , flag = 0;
        for (i = 2 ; a <= b ; a++) {
            for (i = 2 ; i <= a-1 ; i++) {
                if (a % i == 0) {
                    flag = flag + 1;
                }   
            }
            if (flag == 0) {
                System.out.println(a + " Is Prime Number");
            }
             else {
            }
            flag = 0;
            i = 2;
        }
    }

}
