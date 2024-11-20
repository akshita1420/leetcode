class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();

        for(String s: tokens){
            if(s.equals("*")){
                int p1=stack.pop();
                int p2=stack.pop();
                int mul=p2*p1;
                stack.push(mul);

            }
            else if(s.equals("+")){
                int m1=stack.pop();
                int m2=stack.pop();
                int plus=m2+m1;
                stack.push(plus);

            }
            else if(s.equals("-")){
                int s1=stack.pop();
                int s2=stack.pop();
                int sub=s2-s1;
                stack.push(sub);

            }
            else if(s.equals("/")){
                int d1=stack.pop();
                int d2=stack.pop();
                int div=d2/d1;
                stack.push(div);

            }
            else{
                int temp = Integer.parseInt(s);
                stack.push(temp);

            }            
        }
        return stack.peek();
    }
}
