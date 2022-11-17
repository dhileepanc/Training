import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {
	void Bsort()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Array Length :");
		try {
			int length = sc.nextInt();
			int arr[] = new int[length];
			System.out.println("Enter Array Values :");
			for (int i = 0; i < arr.length; i++) {

				arr[i] = sc.nextInt();				// array values
			}
			int j = 1;							
			while (j <= arr.length) {
				int i = 0;
				while (i < arr.length - 1) {         
					if (arr[i] < arr[i + 1]) // ascending "<" descending ">"  // check 0th and 1st index
					{
						int temp = arr[i];   
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}

					i++;

				}
				j++;
			}

			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
		} catch (InputMismatchException im) {
			System.out.println("please enter numeric values only");
		}
	}
	public static void main(String[] args) {
	BubbleSort bs=new BubbleSort();
	bs.Bsort();

	}
}
