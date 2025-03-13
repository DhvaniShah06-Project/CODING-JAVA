import java.util.Scanner;
class Time{
	int Hour;
	int Minute;

	public Time(int Hour , int Minute){
		this.Hour = Hour;
		this.Minute = Minute;
	}
	public void addTime(Time t2){
		this.Hour+=t2.Hour;
		this.Minute+=t2.Minute;
		if(this.Minute>=60){
			this.Hour++;
			this.Minute-=60;
		}
		System.out.print("Hour : "+this.Hour+" Minutes : "+this.Minute);
	}
}
public class Lab6A2{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Time In Hours and Minutes : ");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		System.out.print("Enter Second Time in Hours and Minutes : ");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		Time t1 = new Time(h1,m1);
		Time t2 = new Time(h2,m2);
		t1.addTime(t2);
	}
}
