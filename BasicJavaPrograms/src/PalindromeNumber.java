import java.util.Scanner;

public class PalindromeNumber {
	
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
		
		if(a== num)
		{
			System.out.println("Palindrome Number");

		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
		
				
		
}

}
