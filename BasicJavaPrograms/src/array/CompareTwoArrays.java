package array;

public class CompareTwoArrays {
	
	public static void CompareArrays()
	{
		int a1[] = {2,4,3,5};
		int a2[] = {3,5,7,8};
		int i,j;
		int count =0;
		for( i=0;i<a1.length;i++) 
		{
			for(j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
				
				
			}
			
			
			if(count==0)
			{
				System.out.println(a1[i]);
				
			}

		}
		
			
		
			}

	public static void main(String[] args) {
		
		CompareTwoArrays.CompareArrays();
	}

}
