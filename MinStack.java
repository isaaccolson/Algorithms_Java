class MinStack {
    
    Stack<Integer> normalStack;
    Stack<Integer> minValueStack;
   
    public MinStack() {
       normalStack = new Stack<>();
        minValueStack = new Stack<>();
    }
    
    public void push(int x) {
            normalStack.push(x);
        if(minValueStack.isEmpty() || x < minValueStack.peek()){
            minValueStack.push(x);
        } else {
            minValueStack.push(minValueStack.peek());
        } 
        
    }
    
    public void pop() {
        normalStack.pop();
        minValueStack.pop();
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
        return minValueStack.peek();
    }
}
