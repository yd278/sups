public interface StackInt {
    void pop() throws StackException;

    void push(int x) throws StackException;

    int top();
}
