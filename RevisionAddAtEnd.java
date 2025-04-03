class Node{
    int val;
    Node next;

    Node (int val){
        this.val = val;
        this.next = null;
    }
}
class Sll{
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void printSize(){
        System.out.println("length of the linked list"+size);
    }
}


public class RevisionAddAtEnd {
    public static void main(String[] args) {
        Sll list = new Sll();
        list.printSize();
        list.insertAtHead(23);
        list.insertAtHead(27);
        list.display();
    }
    
}
