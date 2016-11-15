public class LinkedList {
    protected Element head;

    public LinkedList(int x) {
        head = new Element(x);
    }

    public void add(int index, int x) throws LinkedListException {
        if (index < 0) throw new LinkedListException("out of bound!");
        if (index == 0) {
            Element tmp = new Element(x);
            tmp.setNext(head);
        } else {
            Element now = head;
            for (int i = 1; i < index; i++) {
                now = now.getNext();
            }
            Element tmp = new Element(x);
            if (!now.isTail()) tmp.setNext(now.getNext());
            now.setNext(tmp);
        }
    }

    public void remove(int index) throws LinkedListException {
        if (index < 0) throw new LinkedListException("out of bound!");
        if (index == 0) {
            if (head.isTail()) throw new LinkedListException("List is not Exist!");
            else head = head.getNext();
        } else {
            Element now = head;
            for (int i = 1; i < index; i++) {
                now = now.getNext();
            }
            if (now.getNext().isTail()) now.cutTail();

            else now.setNext(now.getNext().getNext());
        }
    }

    public int getHead() {
        return head.getVal();
    }

    public int getNth(int n) throws LinkedListException {
        if (n < 1) throw new LinkedListException("out of bound!");

        n--;
        Element now = head;
        while (n != 0) {
            now = now.getNext();
            n--;
        }
        return now.getVal();
    }

    public int length() throws LinkedListException {
        if (hasCycle()) throw new LinkedListException("there is a Cycle!");
        int cnt = 1;
        Element now = head;
        while (!now.isTail()) {
            now = now.getNext();
            cnt++;
        }
        return cnt;
    }

    public boolean hasCycle() throws LinkedListException {
        if (head.isTail()) return false;
        Element i = head.getNext();
        if (i.isTail()) return false;
        Element j = i.getNext();
        while (i != j) {
            if (j.isTail()) return false;
            j = j.getNext();
            if (j.isTail()) return false;
            j = j.getNext();
            i = i.getNext();
        }
        return true;
    }

    public static void main(String args[]) {
        Stack stack = new Stack(1);
        try {
            stack.push(2);
            stack.push(3);
            stack.pop();
            System.out.println(stack.top());
            stack.pop();
            System.out.println(stack.top());
            stack.pop();

        } catch (LinkedListException e) {
            System.out.println(e.getMessage());
        }
    }
}
