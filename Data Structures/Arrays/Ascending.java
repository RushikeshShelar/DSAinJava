import java.util.*;

public class Ascending {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of Array:");
		int size = sc.nextInt();

		int numbers[] = new int[size];

		// input
		System.out.println("Enter Array Elements :");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		boolean isAsending = true;

		for (int i = 0; i < size - 1; i++) {
			if (numbers[i] > numbers[i + 1])
				isAsending = false;
		}
		if (isAsending)
			System.out.println("Array is in an asending Order.");
		else
			System.out.println("Array is In not in an asending Order.");
		sc.close();

	}
}