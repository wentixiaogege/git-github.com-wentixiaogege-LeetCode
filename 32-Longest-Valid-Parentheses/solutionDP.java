public class Solution {
    public int longestValidParentheses(String s) {
        
    if(s == null || s.length() ==0){
        return 0;
    }
    // longest[i] 以i 结尾最大valid 长度
    int[] longest = new int[s.length()];// if s.charAt(i) == '(' longest[i] =0 else
                                        // if ==')' if s[i-1] == '(' longest[i] = longest[i-2]+2;
                                        //          if s[i-1] == ')' 
                                                                 // if  s[i-longest[i-1]-1] =='(' longest[i] = longest[i-1] +2 + longest[i-longest[i-1] -2]
                                                                 // else  =0;? 
    int max =0;
    for(int i=1; i<s.length(); i++){
        
        if(i>=1 && s.charAt(i) == ')'){
            if(s.charAt(i-1) == '('){
                longest[i] = (i-2 >=0) ?longest[i-2]+2 : 2;
            }else if(i-longest[i-1]-1 >= 0 && s.charAt(i-longest[i-1]-1) =='('){
                longest[i] = longest[i-1]+2 + (i-longest[i-1]-2 >0 ?longest[i-longest[i-1]-2] :0);
            }   
            max = Math.max(max,longest[i]);
        }
    }
     return max;   
    }
}