class MyStack {

    public static Queue<Integer> q1;
    public static Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        if (q1.isEmpty()) {
            return true;
        }
        return false;
    }
}