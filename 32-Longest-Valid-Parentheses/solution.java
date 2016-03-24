public class Solution {
    public int longestValidParentheses(String s) {
        
    if(s == null || s.length() ==0){
        return 0;
    }
    int result = 0;
    int[] data = new int[s.length()];
    
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<s.length(); i++){
        //))(())
        if(s.charAt(i) == '('){
            stack.push(s.charAt(i));
        }else{
            if(stack.isEmpty()){
                data[i]=0;
            }else if(stack.peek() == ')'){
                data[i] =1;
                data[i-1] =1;
            }
        }     
    }
    //110111
    for(int i=0; i<data.length; i++){
        
        int j=0;
        while(data[i] ==1){
            j++;
            i++;
        }
        result = Math.max(result,j);
        
    }
    
    return result;
        
    }
}