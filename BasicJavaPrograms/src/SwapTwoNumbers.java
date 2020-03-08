import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("Before reversing " + first+second);
		int temp = 0;
		
		temp = first;
		first  = second;
		second = temp;
		
		System.out.println("After reversing " + first+second);
		
	}

}
