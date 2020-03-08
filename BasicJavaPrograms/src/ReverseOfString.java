import java.util.Scanner;



public class ReverseOfString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String");
		String Word = scan.nextLine();
		int length = Word.length();
		String a= "";
		
		for(int i = length-1;i>=0;i--)
		{
			a=a+Word.charAt(i);
		}
		
		System.out.println(a);

	}

}
