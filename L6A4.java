//display and set account detai
import java.util.Scanner;
class Bank_Account{
	double accountNo;
	String username;
	String email;
	String accountype;
	int balance;
		
	public void getAccountDetails(double accountNo, String username,String email, String accountype, int balance){
 		this.accountNo = accountNo;
		this.username = username;
		this.email = email;
		this.accountype = accountype;
		this.balance = balance;
		}
	public void displayAccountDetails(double accountNo, String username, String email, String accountype, int balance){
		System.out.print(" Account Details : \n");
		System.out.print(" Account Number : " +this.accountNo+ " \n Name : " +this.username+ " \n Email : " +this.email+ "\n Account Type : " +this.accountype+ " \n Current Balance in Account is : "+this.balance);
	}



}

public class L6A4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account Number : ");
		double an = sc.nextInt();
		System.out.print("Enter User Name : ");
		String name = sc.next();
		System.out.print("Enter Your Registered Email : ");
		String mail = sc.next();
		System.out.print("Enter Your Account Type : \nDemate or Savings or Current or FD(Fixed Digits) or OD(Over Draft) : ");
		String type = sc.next();
		System.out.print("Enter Amount of Balance : ");
		int bal = sc.nextInt();
		Bank_Account b1 = new Bank_Account();
		b1.getAccountDetails(an,name,mail,type,bal);
		b1.displayAccountDetails(an,name,mail,type,bal);

	}
}