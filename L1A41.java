//Addition Using Command line Argument
public class L1A41
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.print("Integer a is : "+args[0]);
		System.out.println("  Integer b is : "+args[1]);
		System.out.print("Addition is : "+(a+b));
		
	}

}
//concat if System.out.println(args[0]+args[1]) i.e if a=10 b=20 output is 1020