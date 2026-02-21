//
//
//Array with user input 
//
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayAndScanner{
	
	public static void main(String[] args){

		int length;

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many items are in your list: ");
		length = Integer.parseInt(scanner.nextLine());

		String[] items = new String[length];

		System.out.println("Enter items you want to add: ");

		int count = 1;

		for (int i = 0; i < items.length; i++){

			items[i] = scanner.nextLine();
			System.out.println("[" + count + "/4] filled");
			count++;
		}
		System.out.println("Numbers of item on the list: " + items.length);
		System.out.println("You have " + Arrays.toString(items) + " on your list");
	}
}