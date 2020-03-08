
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 153 ,a=0,temp;
		int n = number;
		
		while (n!=0)
		{
		temp = n%10;
		 a = a+ (temp*temp*temp);
		n = n/10;
		
		}
		
		
		if(a==number)
		{
			System.out.println("It is an armstrong number");
		}
		
		else
		{
			System.out.println("It is not an armstrong number");
		}
		

	}

}
