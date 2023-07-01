import java.util.*;


public class Arrays {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of Array:");
		int size = sc.nextInt();

		int numbers[] = new int[size];

		//input
		System.out.println("Enter Array Elements :");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}


		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;


		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Largest number is : " + max);

		System.out.println("Smallest number is : " + min);

	}

}