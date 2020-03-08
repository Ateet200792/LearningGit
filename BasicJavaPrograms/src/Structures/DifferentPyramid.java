package Structures;

public class DifferentPyramid {
	

	public static void main(String[] args) {
		int j;
		
		for(int i =1;i<=5;i++)
		{
			for( j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if((k==2 && i==3) || (k==2 && i==4) || (k==3 && i==4))
				
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(" *");

				}
					
							}
			System.out.println();
		}

	}

}
