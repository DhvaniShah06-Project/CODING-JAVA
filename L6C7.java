class Time{
	int Hour;
	int Minute;

	public Time(int Hour , int Minute){
		this.Hour = Hour;
		this.Minute = Minute;
	}
	static public void Demo(){
		this.Hour=5;

	}

}
	public class L6C7{
	public static void main(String[] args) {
		Time t1 = new Time(2,50);
		t1.Demo();
	}
}