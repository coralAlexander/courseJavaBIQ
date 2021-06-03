package data_Struction_linkedlist;

public class MyList {

    private Node first;

    public void add(int num) {
        Node newNode = new Node(num);
        if (first == null) {
            first = newNode;
        }
        else {
            Node curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node curr = first;
        while (curr != null) {
            s.append(curr.getValue());
            s.append(' ');
            curr = curr.getNext();
        }
        return s.toString();
    }
}
