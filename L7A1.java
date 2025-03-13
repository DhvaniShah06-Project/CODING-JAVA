import java.util.Scanner;
class Student{
	int id_no;
	int no_sub;
	String[] sub_code;
	int []sub_credit;
	char[]grade;
	double spi;
		public Student(int id_no,int no_sub,String[]sub_code,int[]sub_credit,char[]grade){
			this.id_no = id_no;
			this.no_sub = no_sub;
			this.sub_code = sub_code;
			this.sub_credit = sub_credit;
			this.grade = grade;
		}
		public int calculateGrade(char grade){
			switch (grade){
			case 'A' : return 10;
			case 'B': return 9;
			case 'C' : return 8;
			case 'D' : return 7 ;
			case 'E' : return 6;
			case'F' : return 5;
			case'G' : return 4;
			case 'H' : return 3;
			case 'I' : return 2;
			case 'J' : return 1;
			case 'K' : return 0;
			default : return 0;//if z grade then return 0
			}
			}
		
		public void calculateSpi(){
			int total_credit=0, total_point=0;
			for(int i = 0;i<no_sub;i++){
				total_credit+= sub_credit[i];
				total_point+=sub_credit[i]*calculateGrade(grade[i]);

			}
			double spi = (double)total_point/total_credit;
			System.out.print("Total SPI of Student : "+spi);
		}
	}

public class L7A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id No : ");
		int id = sc.nextInt();
		System.out.print("Enter No of Subjects : ");
		int sub = sc.nextInt();
		String[] sub_code = new String[sub];
		int[] sub_credit = new int[sub];
		char[]grade = new char[sub];
		for(int j =0 ;j<sub; j++){
			System.out.print("Enter Subject Code : ");
			sub_code[j] = sc.next();
			System.out.print("Enter Subject Credit : ");
			sub_credit[j] = sc.nextInt();
			System.out.print("Enter Grade Obtained : ");
			grade[j] = sc.next().charAt(0);
		}
		Student s1 = new Student( id,  sub, sub_code,  sub_credit,grade);
		s1.calculateSpi();
	}
	
}