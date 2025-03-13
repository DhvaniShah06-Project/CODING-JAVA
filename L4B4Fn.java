import java.util.Scanner;
public class L4B4Fn{
	public static void main(String[] args){
		L4B4Fn d = new L4B4Fn();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		d.L4BFn(s);
	}
	public class void (String s){
		int b = s.length()/2;
		int i;
		char c;
		for(i = b+1 ; i < s.length();i++){
			c =s.charAt(i);
			System.out.print(c);
		}
	}
}