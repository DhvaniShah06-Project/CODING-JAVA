import java.util.Scanner;
	class Sentence{
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int b =0;
		public void Count(String sent){
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
			
		}
	}
	
		public void Answer(){
		System.out.println("Total Number of a : "+a);
		System.out.println("Total Number of e : "+e);
		System.out.println("Total Number of i : "+i);
		System.out.println("Total Number of o : "+o);
		System.out.print("Total Number of u : "+u);
	}
	
}




	public class VowelCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Sentence s1 = new Sentence();
		while(true){
			System.out.print("Enter Sentence (Quit To Exit): ");
			String sent = sc.nextLine();
			sc.close();
			if(sent.equals("Quit")){
				break;
			}
			else{
				
				s1.Count(sent);

			}
		
	}
	s1.Answer();
}
}