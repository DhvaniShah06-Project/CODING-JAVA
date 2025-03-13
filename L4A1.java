 //Accept a line and find how many vowels and consonant are there
	import java.util.Scanner;
		public class L4A1{
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter String : ");
				String s = sc.nextLine();
				char c;
				int i,V=0,B=0; 
				for(i = 0 ; i < s.length() ; i++){
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