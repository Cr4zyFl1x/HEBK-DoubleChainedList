package eu.flrkv.DoubleChainedList;

public class List {

    // Attributes
    private Node first;
    private Node last;
    private Node current;

    // Construct
    public List() {

    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public Node getCurrent() {
        return current;
    }

    // Check if List is empty
    public boolean isEmpty() {
        return (first == null || last == null);
    }

    // Check if current Node is set
    public boolean hasAccess() {
        return current != null;
    }

    // Move current to next node if possible
    public void next() {
        current = (!isEmpty() && hasAccess() && current.getNext() != null) ? current.getNext() : current;
    }

    // Set current as first node if possible
    public void toFirst() {
        current = !isEmpty() ? first : current;
    }

    // Set current as last node if possible
    public void toLast() {
        current = !isEmpty() ? last : current;
    }

    // Return current Person if possible
    public Person getPerson() {
        return hasAccess() ? current.getContent() : null;
    }

    // Replace current Person if it's not null
    public void setPerson(Person person) {
        if (person != null && hasAccess()) {
            current.setContent(person);
        }
    }

    public void printAll() {
        if (!isEmpty()) {
            Node tmp = first;
            System.out.println(tmp.getContent().getName());
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                System.out.println(tmp.getContent().getName());
            }
        }
    }

    private void setLast() {
        if (!isEmpty()) {
            if (first.getNext() == null) {
                last = first;
                return;
            }
            Node tmp = first;
            while (tmp.getNext() != null) {
                tmp.getNext();
            }
            last = tmp;
        }
    }

    // Append Person to end
    public void append(Person person) {
        if (person != null) {
            if (isEmpty()) {
                first = new Node(person);
                last = first;
                return;
            }
            Node tmp = first;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(person));
            tmp.getNext().setBefore(tmp);
            last = tmp.getNext();
        }
    }

    public void appendArray(Person[] person) {
        if (person != null) {
            for (Person p: person) {
                append(p);
            }
        }
    }

    // Insert Person in front of the current Person/Node
    public void insert(Person person) {
        if (isEmpty()) {
            first = new Node(person);
            last = first;
            return;
        }
        if (!hasAccess() && !isEmpty() || person == null) {
            return;
        }

        Node tmp = first;
        if (tmp == current) {
            tmp.setBefore(new Node(person));
            tmp.getBefore().setNext(current);
            first = tmp.getBefore();
            return;
        }
        while (tmp.getNext() != current && tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(person));
        tmp = tmp.getNext();
        tmp.setNext(current);
    }

    public void concat(List l) {
        if (l != null) {
            if (isEmpty()) {
                first = l.getFirst();
                last = l.getLast();
                return;
            }
            Node tmp = first;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(l.getFirst());
            tmp.getNext().setBefore(tmp);
            last = l.getLast();
        }
    }

    public void remove() {
        if (!isEmpty() && hasAccess()) {
            Node tmp = first;



        }
    }

}
