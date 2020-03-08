import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int a= 0,temp;
		
		int n = num;
		
		while(n!=0)
		{
		temp= n%10;
		a= a* 10 +temp;
		n=n/10;
		}
		
		System.out.println("Reverse is " + a);
		
		

	}

}
