class Demo{
	static int count = 0;
	public Demo(){
		count++;
	}

}
public class L6B6{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 =new Demo();
		Demo d3 = new Demo();
		Demo d8 = new Demo();
		System.out.print(Demo.count);

	}
}