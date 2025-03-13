import java.util.Scanner;
class Cube{
	double width;
	double height;
	double depth;

	public void setCube(double height,double width, double depth){
	this.height = height;
	this.width = width;
	this.depth = depth;
}
	public String getCube(){
return this.height+" "+this.width+" "+this.depth;
}

	public void setCube2(double height,double width, double depth){
	this.height = height;
	this.width = width;
	this.depth = depth;
}
	public String getCube2(){
return this.height+" "+this.width+" "+this.depth;
}

	public void volume(Cube C2){
		System.out.println("1st Cube Volume : "+this.height*+this.width*+this.depth);
		System.out.print("2nd Cube Volume : "+C2.height*+C2.width*+C2.depth);

	}

}
public class practice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details For 1st Cube : ");
		System.out.print("Enter Height : ");
		double h1 = sc.nextDouble();
		System.out.print("Enter Width : ");
		double w1 = sc.nextDouble();
		System.out.print("Enter Depth : ");
		double d1 = sc.nextDouble();
		System.out.println("Enter Details of 2nd Cube :");
		System.out.print("Enter Height : ");
		double h2 = sc.nextDouble();
		System.out.print("Enter Width : ");
		double w2 = sc.nextDouble();
		System.out.print("Enter Depth : ");
		double d2 = sc.nextDouble();
		Cube c1 =new Cube();
		Cube c2 = new Cube();
		sc.close();
		c1.setCube(h1,w1,d1);
	System.out.println(	c1.getCube());
	c2.setCube2(h2,w2,d2);
	System.out.print(c2.getCube());
		c1.volume(c2);

	}
}

/*public Cube(double height,double width,double depth){
 	this.height = height;
 	this.width=width;
 	this.depth=depth;
*/