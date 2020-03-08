
public class FindConsecutivePattern {

	public static void main(String[] args) {
		
		String a  = "196a8596b12549c234qw6578e%^123qaz";
		
		char string[] = a.toCharArray();
		
		for(int i =0;i<string.length;i++)
		{
								
				


			if(!(Character.isDigit(string[i])) && Character.isDigit(string[i+1]) && Character.isDigit(string[i+2]) && Character.isDigit(string[i+3]) && Character.isDigit(string[i+4]) && !(Character.isDigit(string[i+5])))
			{
				
				System.out.println(string[i+1]);
				System.out.println(string[i+2]);
				System.out.println(string[i+3]);
				System.out.println(string[i+4]);
				break;
		}
			
			else if(!(Character.isDigit(string[i])) && Character.isDigit(string[i+1]) && Character.isDigit(string[i+2]) && Character.isDigit(string[i+3]) && !(Character.isDigit(string[i+4])))
			{
				
				
					
					System.out.println(string[i+1]);
					System.out.println(string[i+2]);
					System.out.println(string[i+3]);
					
					break;
			}
			
		}
	
	
	}
}
	


