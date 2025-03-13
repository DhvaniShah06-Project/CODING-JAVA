//pattern
import java.util.Scanner;
public class L5A1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		int i,j;
		for(i=0; i<s.length();i++){
			for(j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}