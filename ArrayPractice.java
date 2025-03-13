/*Implement an array with 5 elements in class A Create four methods for array operation:
sortArray
searchArray
sumArray
avgArray
and call four methods using objects
*/

import java.util.Scanner;
class A{
	
	static public void sortArray(int[] a){
		int i=0,j,c;
		for(i=0;i<5;i++){
        for(j=i+1;j<5;j++){
            if(a[i]>a[j]){
                c=a[i];
                a[i]=a[j];
                a[j]=c;
            }
            }  
        }
        System.out.print("Array in Sorted Form : ");
        for(i=0;i<5;i++){
        	System.out.print(a[i]+ " ");
        }
        System.out.println();
    
		}
	static public void searchArray(int [] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Which Element to Find : ");
		int f = sc.nextInt();
		int z=0;
		for(int i = 0 ; i<a.length;i++){
			if(a[i]==f){
				z = 1;
				break;
			}

		}
		if(z==1){
			System.out.println("Element Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
	static public void sumArray(int a[]){
		int k,sum =0;
		for(k=0;k<5;k++){
			sum = sum + a[k];
		}
		System.out.println("Sum of Array : " +sum);
	}
	static public void avgArray(int a[]){
		int k,sum=0;
		for(k=0;k<5;k++){
			sum = sum + a[k];
		}
		int ans = sum/5;
		System.out.print("Average : "+ans);
	}
}



public class ArrayPractice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 elements of Array");
	int i =0;
	int a[] = new int[5];
	for(i=0;i<5;i++){
		System.out.print("Enter Array Element : ");
		a[i]=sc.nextInt();
	}

		A sort = new A();
		A search = new A();
		A sum = new A();
		A avg = new A();
		A.sortArray(a);
		A.searchArray(a);
		A.sumArray(a);
		A.avgArray(a);

	}
}