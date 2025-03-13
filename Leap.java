import java.util.Scanner;
public class Leap{
	public static void main(String[] args){
     Leap d=new Leap();
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a Year : ");
        int a = sc.nextInt();
        System.out.print("Enter a Year : ");
        int b = sc.nextInt();
        sc.close();
       int i;
       for(i=a;i<=b;i++){
       	d.Leap(i);
       
       }
	
}
public void Leap(int n){
     int year = (n % 100 != 0 && n % 4 == 0 || n % 400 == 0) ? (29) : (28);
     if(year==29){
        System.out.println("LeapM Year : "+n);
     }
}
}