//using methods i.e functions
import java.util.Scanner;
public class L4A1Fn{
	public static void main(String[] args){
		L4A1Fn d =new L4A1Fn();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		d.L4A1Fn(s);
		sc.close();
	}
	public void L4A1Fn(String s){
		char c;
		for(int i = 0 ; i < s.length() ; i++){
					c = s.charAt(i);
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
						c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
					{
						V=V+1;
						}
					else if(c==' '){
						
						}
						else{
							B=B+1;
						}
				}
				System.out.println("Number Of Vowels : " +V);
				System.out.print("Number Of Consonants : " +B);

	}
}