import java.util.Scanner;
class Circle{
	public void areaCircle(double r){
		System.out.print("Area Of Circle : " +3.14*r*r);
	}
}

public  class L6A1{
	public static void main(String[] args){
		Circle a = new Circle();
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of Circle : ");
		double r = sc.nextDouble();
		a.areaCircle(r);
		
	}
}