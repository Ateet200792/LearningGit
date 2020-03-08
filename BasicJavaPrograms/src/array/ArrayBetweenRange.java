//Print an array with elements having value between two numbers f and l whose value is passed as argument.

package array;

import java.util.Arrays;

public class ArrayBetweenRange {

	public static void ArrayRange(int f,int l)
	{
		int length = l-f+1;
		int array[] = new int[length];
		
		while(f<l)
		{
			for(int i= 0;i<length;i++)
			{
				array[i]= f;
				f++;
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
	}
	public static void main(String[] args)
	{
		ArrayBetweenRange.ArrayRange(2, 9);
	}

}
