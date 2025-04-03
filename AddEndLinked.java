class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void printSize() { // Renamed to avoid conflict with 'size' variable
        System.out.println("Length of the linked list is: " + size);
    }
}

public class AddEndLinked {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.printSize(); // Call corrected method
        list.insertAtEnd(23);
        list.insertAtEnd(28);
        System.out.println("Current size: " + list.size);
        list.display();
    }
}
