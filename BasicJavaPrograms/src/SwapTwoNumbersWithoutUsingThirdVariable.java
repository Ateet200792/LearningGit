import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before reverse " + a+b );
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After reversing " + a+b);

	}

}
