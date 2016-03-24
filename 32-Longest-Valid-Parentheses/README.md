Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

Subscribe to see which companies asked this question


//DP 分析
 // longest[i] 以i 结尾最大valid 长度
    int[] longest = new int[s.length()];// if s.charAt(i) == '(' longest[i] =0 else
                                        // if ==')' if s[i-1] == '(' longest[i] = longest[i-2]+2;
                                        //          if s[i-1] == ')' 
                                                                 // if  s[i-longest[i-1]-1] =='(' longest[i] = longest[i-1] +2 + longest[i-longest[i-1] -2]
                                                                 // else  =0;? 
    int max =0;