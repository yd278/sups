public class Element {
    private int val;
    private Element next;

    public Element(int x) {
        val = x;
        next = null;
    }

    public Element getNext() throws LinkedListException {
        if (next == null) throw new LinkedListException("out of bound!");
        return next;
    }

    public void setNext(Element x) throws LinkedListException {
        if (x == null) throw new LinkedListException("element doesn't exist!");
        next = x;
    }

    public void cutTail() {
        next = null;
    }

    public int getVal() {
        return val;
    }

    public boolean isTail() {
        if (next == null) return true;
        return false;
    }
}
