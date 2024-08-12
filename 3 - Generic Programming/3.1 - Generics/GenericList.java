public class GenericList<E> {
    // Generic version of a linked list: in this case, the parameter <E> represents a placeholder for any possible class.
    private E head;
    private GenericList tail = null;
    GenericList(E head, GenericList tail) {
        this.head = head;
        this.tail = tail;
    }
    public E get() {
        return head;
    }
    public void insert(E e) {
        this.tail = new GenericList(head, tail);
        this.head = e;
    }
    public void printList() {
        System.out.print(head + " ");
        if (tail == null) {
            System.out.println();
        } else {
            tail.printList();
        }
    }
}
