
public class RepetitiveLetter {

	public static void main(String[] args) {
		
		String name = "ateett";
		int count=1;
		char p=0;
		for(int i = 0;i<name.length();i++)
		{
			if(name.charAt(i)==p)	
			{
				
							
				
			}
			
			else
			{
			for(int j = i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count++;
					 p= name.charAt(i);
					 
				}
				
			}
			System.out.println(name.charAt(i)+" is present " + count + " times");

			
			count=1;

		}
						
	}

}}
