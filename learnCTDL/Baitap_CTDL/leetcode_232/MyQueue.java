class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if (st1.empty()) {
            return -1;
        } else {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            int r = st2.pop();
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            return r;
        }
    }
    
    public int peek() {
        if (st1.empty()) {
            return -1;
        } else {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            int r = st2.peek();
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            return r;
        }
    }
    
    public boolean empty() {
        return st1.empty();
    }
}