// Largest Number in an array

package array;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
		int a[] = {1110,666,820,933};
		int largest = 0;
		
		largest = a[0];
		for(int i = 0 ;i<a.length-1;i++)
		{
			

			 	if(largest>a[i+1])
				{
					
				}
			 	else
			 		
			 		largest = a[i+1];
			 		
			
			
		}
		
		System.out.println(largest);
		
			}

}
