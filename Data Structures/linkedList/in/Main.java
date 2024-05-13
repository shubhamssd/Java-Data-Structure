package linkedList.in;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(12);
        ll.insertFirst(13);
        ll.insertFirst(14);
        ll.insertFirst(15);
        ll.insertFirst(18);

        ll.insert(100,4); // inserting the value at index 4

        ll.insertLast(20);
        ll.insertLast(21);
        ll.insertLast(22);

        ll.display();
    }
}
