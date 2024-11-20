class MinStack {
    private Stack <Integer> stack;
    private Stack <Integer> minstack;

    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) { 
        //1 2 1 -1 
        //1 1 1 -1 
        stack.push(val);
        if(minstack.isEmpty() || stack.peek()<= minstack.peek()){
            minstack.push(stack.peek());
        }
        else{
            minstack.push(minstack.peek());
        }

    }
    
    public void pop() {
        stack.pop();
        minstack.pop();

        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
