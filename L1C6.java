//check whether entered letter is vowel or consonant
import java.util.Scanner;
	public class L1C6
		{
			public static void main(String[] args)
			{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a character : ");
			char b=sc.next().charAt(0);
			if(b>='a'&&b<='z'||b>='A'&&b<='Z'){
				if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
				System.out.print("Entered Chatracter is vowel");
				}
				else{
					System.out.print("Entered Character is Consonant");
				}

			}
			else{
				System.out.print("Entered character is not an alphabet");
			}
			
				
			}
			}
		