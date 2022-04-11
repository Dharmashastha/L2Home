package L2;

import java.util.Stack;

class Solution {
    
	public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            switch(ch)
            {
                case '[':
                        stk.push(']');
                        break;
            
                case '(':
                        stk.push(')');
                        break;
            
                case '{':
                        stk.push('}');
                        break;
                default :
                    if(stk.isEmpty() || stk.pop() != ch)
                    {
                        return false;
                    }
            }       
        }
        return stk.isEmpty();   
    }
	
	public static void main(String args[])
	{
		Solution solCall = new Solution();
		
		boolean check = solCall.isValid("{()}}{");
		System.out.println(check);
	}
}
