//taking string and numbers perform basic calculator
import java.util.Scanner;
public class L2A2{
	public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a value : ");
     int a=sc.nextInt();
     System.out.print("Enter another value : ");
     int b=sc.nextInt();
     System.out.print("Enter Operation(Addition/Subtraction/Multiplication/Division) : ");
     String str=sc.next();
     if(str.equals("Addition")){
     	System.out.print("Addition : "+(a+b));
     }
    else if(str.equals("Subtraction")){
     	System.out.print("Subtraction : "+(a-b));
     }
     else if(str.equals("Multiplication")){
     	System.out.print("Multiplication : "+(a*b));
     }
     else if(str.equals("Division")&&b!=0){
     		System.out.print("Division : "+(a/b));

	}
	else{
		System.out.print("Invalid Operator");
	}
}
}