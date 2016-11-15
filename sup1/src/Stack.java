
public class Stack extends LinkedList implements StackInt{
    public Stack(int x) {
        super(x);
    }

    @Override
    public void pop() throws StackException {
        try {
            head = head.getNext();
        } catch (LinkedListException e) {
            throw new StackException("Empty Stack!");
        }
    }

    @Override
    public void push(int x) throws StackException {
        Element tmp = new Element(x);
        try {
            tmp.setNext(head);
            head = tmp;
        } catch (LinkedListException e) {
            throw new StackException("Nothing pushed");
        }

    }

    @Override
    public int top() {
        return head.getVal();
    }
}
