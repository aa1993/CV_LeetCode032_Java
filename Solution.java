class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        for(int i = 0; i< s.length() ; i++)
        {
            int count = 0;
            int j = i;
            int k = j;
            while(j<s.length())
            {
                
                count = s.charAt(j)=='(' ? count+1 : count -1;
                if(count < 0)
                    break;
                if(count == 0)
                    if(j-i+1 > max){
                        max = j-i+1;
                        k = i;
                    }
                
                j++;
            }
            i=k;
        }
        return max;
    }
}