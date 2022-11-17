import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter your array length :"); 
		Scanner scanner = new Scanner(System.in);
		try {
			int length = scanner.nextInt();  // array length

			int a[] = new int[length];
			System.out.println("Enter Your Array Value :");
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();     // arrays

			}

			int min = 0;                 // for 0th index
			int max = a.length - 1;      // for last index
			int key = 20;                // searching

			while (min <= max) {             // for checking which index no placed
				int mid = (max + min) / 2;    // for find mid index to separate indexes
				if (key == a[mid]) {           // the key no placed mid index the below statement printed
					System.out.println("Present" + mid);
					break;
				} else if (key < a[mid]) {  // the key value < mid value the left indexes checked
					max = mid - 1;
				} else {
					min = mid + 1;          // else right side indexes checked
				}
			}
			if (min > max)    // the key value not presented in the array the below statement printed

				System.out.println("The no not presented");
		} catch (InputMismatchException im) {
			System.out.println("Please enter numeric values");
		}

	}
}
