package eu.flrkv.DoubleChainedList;

public class Node {

    // Atributes
    private Person content;
    private Node before;
    private Node next;

    // Construct
    public Node(Person p) {
        this.setContent(p);
    }

    // Get methods
    public Node getBefore() {
        return before;
    }
    public Node getNext() {
        return next;
    }
    public Person getContent() {
        return content;
    }

    // Set methods
    public void setBefore(Node before) {
        this.before = before;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setContent(Person content) {
        this.content = content;
    }

}
