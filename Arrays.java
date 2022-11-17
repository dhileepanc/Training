
// user input
import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		//Adding two matrices
		int a[] = new int[6];
		int b[] = new int[6];
		System.out.println("Enter 1st elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Enter 2nd elements :");
		for (int i = 0; i < b.length; i++) {
			b[i] = scanner.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + b[i] + " ");

		}
		System.out.println();

		// marks

		/*
		 * int marks[]=new int[5]; int total=0; float avg;
		 * System.out.println("Enter Marks :"); for(int i=0;i<marks.length;i++) {
		 * marks[i]=scanner.nextInt(); total=total+marks[i]; } if(total<=500) {
		 * System.out.println("Total mark :"+total); avg=total/marks.length;
		 * System.out.println("Average :"+avg); } else {
		 * System.out.println("Somenthing went wrong"); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // for(int mark:marks) // { // System.out.println(mark); // }
		 * 
		 * // for(int i=0;i<marks.length;i++) { // System.out.println(marks[i]);}
		 */

		// find the biggest num in the element
		/*
		 * int a[]=new int[5];
		 * 
		 * System.out.println("Enter array :"); for(int i=0;i<a.length;i++) {
		 * a[i]=scanner.nextInt(); // 1 2 3 4 5 6 7 8 9 10 } // for(int b:a) // { //
		 * System.out.println(b); // } int biggest=Integer.MIN_VALUE; for(int
		 * i=0;i<a.length;i++) { if(biggest<a[i]) biggest=a[i]; }
		 * System.out.println(biggest);
		 */

		// Reverse
//		int a[] = new int[6]; // 1 2 3 4 5 6
//
//		int i = 0, j = a.length - 1;
//		System.out.println("Enter your Array :");
//		for (int k = 0; k < a.length; k++) {
//			a[k] = scanner.nextInt();
//
//		}
//		System.out.println("Array befor Reverse :");
//		for (int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + " ");
//		}
//		while (i < j) {
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//			i = i + 1;
//			j = j - 1;
//
//		}
//		System.out.println();
//		System.out.println("After Reversing :");
//
//		for (int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + " ");
//		}

	}
}
