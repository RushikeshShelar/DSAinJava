import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.print("Enter The Size Of Array:");
		int size = cc.nextInt();
		int arrUser[] = new int[size];

		System.out.println("Enter Array Elements :");
		for (int i = 0; i < arrUser.length; i++)
			arrUser[i] = cc.nextInt();

		System.out.println();
		System.out.println("Enter the Number To search :");
		int n = cc.nextInt();
		for (int i = 0; i < arrUser.length; i++) {
			if (arrUser[i] == n)
				System.out.println("Found At Index" + i);
		}
	}
}