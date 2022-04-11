package pattern;

import java.util.Scanner;

public class PatternOutput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Solution solCall = new Solution();
		
		int number = input.nextInt();
		
		switch(number)
		{
		
		case 1:
		{
			solCall.pyramidPattern(5);
			break;
		}
		
		case 2:
		{
			solCall.rightTrianglePattern(5);
			break;
		}
		
		case 3:
		{
			solCall.leftTrianglePattern(5);
			break;
		}
		
		case 4:
		{
			solCall.diamondShapePattern(5);
			break;
		}
		
		case 5:
		{
			
			break;
		}
		
		case 6:
		{
			
			break;
		}
		
		case 7:
		{
			
			break;
		}
		
		case 8:
		{
			
			break;
		}
		
		case 9:
		{
			
			break;
		}
		
		case 10:
		{
			
			break;
		}
		
		case 11:
		{
			
			break;
		}
		
		case 12:
		{
			
			break;
		}
		
		case 13:
		{
			
			break;
		}
		
		case 14:
		{
			
			break;
		}
		
		case 15:
		{
			
			break;
		}
		
		case 16:
		{
			
			break;
		}
		
		case 17:
		{
			
			break;
		}
		}
input.close();
}
}	
