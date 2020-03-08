import java.util.Scanner;

public class PrimeNumberWithUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = scan.nextInt();
		
		int i , count = 0;
		
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
		if(count>2)
		{
			System.out.println(number + " is not a prime number");
		}
		
		else
		{
			System.out.println(number + " is a prime number");
		}
	}

}
