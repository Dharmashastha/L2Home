package pattern;

public class Solution 
{
	
public void pyramidPattern(int row)
{
	for(int i = row-1 ; i >=0 ; i--) {
		for(int j = 0 ; j < row ; j++) {
			if(i <= j) 
			{
				System.out.print("* ");
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public void rightTrianglePattern(int row)
{
	for(int i = 0; i < row; i++)
	{
		for(int j = 0; j <= i; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}

public void leftTrianglePattern(int row)
{
	for(int i = row-1 ; i >=0 ; i--) 
	{
		for(int j = 0 ; j < row ; j++) 
		{
			if(i <= j) 
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public void diamondShapePattern(int row)
{
	int space = row - 1;
	for(int i = 1 ; i <= row ; i++) 
	{
		for(int j = 1 ; j <= space ; j++) 
		{
			System.out.print(" ");
		}
		
		space--;
		
		for(int j = 0; j < 2 * i - 1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	space = 1;
	
	for(int i = 1 ; i < row ; i++) 
	{
		for(int j = 1 ; j <= space ; j++) 
		{
			System.out.print(" ");
		}
		
		space++;
		
		for(int j = 0; j < 2 * (row-i) - 1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}

}

