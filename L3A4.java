//prime

import java.util.Scanner;

public class L3A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a = sc.nextInt();
		int i, flag = 0;
		for (i = 2; i <= a-2; i++) {
			if (a % i == 0) {
				flag = flag + 1;
			}
			break;
		}
		if (flag == 0) {
			System.out.print(a + " Is Prime");
		}
		 else {
			System.out.print(a + " Is Not Prime");
		}
	}
}
