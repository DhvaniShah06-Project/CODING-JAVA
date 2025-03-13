//
import java.util.Scanner;
	class Sentence{
		String sent="";
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int b =0;
		public void Count(){
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("Enter Sentence (Quit To Exit): ");
			this.sent = sc.nextLine();
			if(sent.equals("Quit")){
				break;
			}
			for(int b=0;b<sent.length();b++){
			if(sent.charAt(b)=='a'){
				a++;
			}
			else if(sent.charAt(b)=='e'){
				e++;
			}
			else if(sent.charAt(b)=='i'){
				i++;
			}
			else if(sent.charAt(b)=='o'){
				o++;
			}
			else if(sent.charAt(b)=='u'){
				u++;
			}
			}//for
		}//while
		System.out.println("Total Number of a : "+a);
		System.out.println("Total Number of e : "+e);
		System.out.println("Total Number of i : "+i);
		System.out.println("Total Number of o : "+o);
		System.out.print("Total Number of u : "+u);

}

	}
public class L6B3{
	public static void main(String[] args){
		Sentence s1 = new Sentence();
		s1.Count();
	}
}