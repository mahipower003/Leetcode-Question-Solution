class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
        	char temp=s.charAt(i);
        	if(temp=='(' || temp=='{' || temp=='[')
        	{
        		stack.push(temp);
        	}
        	else if(temp==')' && !stack.isEmpty() && stack.peek()=='(')
        	{
        		stack.pop();
        	}
        	else if(temp==']' && !stack.isEmpty() && stack.peek()=='[')
        	{
        		stack.pop();
        	}
        	else if(temp=='}' && !stack.isEmpty() && stack.peek()=='{')
        	{
        		stack.pop();
        	}
        	else
        	{
        		return false;
        	}
        }
        
        if(stack.isEmpty())
            return true;
        else
            return false;
        
        
    }
}