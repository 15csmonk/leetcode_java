class Solution {
    public String simplifyPath(String path) {
        if(path.length() == 0){
            return "";
        }
        if(path.length() == 1){
            return "/";
        }
        Stack<String> stack = new Stack<String>();
        String[] s1 = path.split("/");
        for(int i = 0; i < s1.length; i ++){
            String s2 = s1[i];
            if(s2.equals(".") || s2.equals("")){
                continue;
            }
            else if(s2.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s2);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        String res = "";
        while(!stack.isEmpty()){
            res = "/" + stack.pop() + res;
        }
        return res;
    }
}