import java.util.*;

public class ArrayOfNames {
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.print("Enter The Size Of Array:");
		int size = cc.nextInt();
		String names[] = new String[size];

		System.out.println("Enter Array Elements :");
		for (int i = 0; i < names.length; i++)
			names[i] = cc.next();

		System.out.println();
		System.out.println("Entered Names :");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		cc.close();
	}
}