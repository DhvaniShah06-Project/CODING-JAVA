 //find length of string and print second half of it
import java.util.Scanner;
public class L4B4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		int b = s.length()/2;
		int i;
		char c;
		for(i=b+1;i<s.length();i++){
			c =s.charAt(i);
			System.out.print(c);
		}
	}

}
/*without space
if(c==' '){

			}
			else{
			System.out.print(c);
		}*/