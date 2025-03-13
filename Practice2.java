/*BankDemo
Method Account
accNum accType balance*/



import java.util.Scanner;
class BankDemo{
	int[] accNum;
	String[] accType;
	double[] balance;
	public void set(int[] accNum,String[] accType,double[] balance){
		this.accNum = accNum;
		this.accType = accType;
		this.balance = balance;
	}
	public void get(){
		int i =0;
		for(;i<3;i++){
		System.out.print(Bank Account Details : );
		}
	}
}
public class Practice2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] accNum = new int[];
		String[] accType = new String[];
		double [] balance = new double[];
		int j=0;
		for(;j<3;j++){
			accNum[j] =sc.nextInt();
			accType[j]=sc.next();
			balance[j]=sc.nextDouble();

		}
		BankDemo b =new BankDemo();
		b.set(accNum,accType,balance);
	}
}