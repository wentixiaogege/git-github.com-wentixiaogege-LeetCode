public class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        if(n <=0 ){
            return result;
        }
        
        String parent="";
        
        helper(result,parent,n,n);
        
        return result;
    }
    
    private void helper(List<String> result, String parent, int left, int right){
        
        if(left ==0 && right ==0){
            result.add(parent);
        }
        
        if(left >0){
            helper(result,parent+"(",left-1,right);
        }
        //左边先添加 一个 （
        if(right>0 && left<right){
            helper(result,parent+")",left,right-1);
        }
        
    }
}