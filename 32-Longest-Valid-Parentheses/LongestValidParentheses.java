public class Solution {
    public int longestValidParentheses(String s) {
        
    if(s == null || s.length() ==0){
        return 0;
    }
    int result = 0,temp=0;
    int[] data = new int[s.length()];
    
    Stack<Integer> stack = new Stack<>();
    for(int i=0; i<s.length(); i++){
        
        if(s.charAt(i) == '('){
            stack.push(i);
        }else{
            if(!stack.isEmpty()){
                data[i] =1;
                data[stack.pop()] =1;
            }
        }     
    }
    //110111
    for(int i=0; i<data.length; i++){
        
        if(data[i] == 1){
            temp++;
        }else{
            result = Math.max(result,temp);
            temp=0;
        }
    }
    
    return Math.max(result,temp);
        
    }
}