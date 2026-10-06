class Solution {
    public int minAddToMakeValid(String s) {
        char[] str=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='(')
            {
                stack.push(str[i]);
                count++;
            }
            if(str[i]==')')
            {
                if(!stack.isEmpty())
                {
                               stack.pop();
                               count--;
                }
                else
                {
                    count++;
                }
                


            }


        }
        return count;
        
      }  
}