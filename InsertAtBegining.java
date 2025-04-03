class Node {
    int val;
    Node next;
 
    Node(int var1) {
       this.val = var1;
       this.next = null;
    }
 }
 class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void printSize(){
        System.out.println(" Size : "+size);
    }
 }
public class InsertAtBegining {
    public static void main(String[] args) {
        SLL list = new SLL();
        
        list.insertAtTail(3);
        list.insertAtTail(28);
        list.insertAtTail(45);
        //list.insertAtTail(12);
        list.display();
        list.insertAtHead(50);
        list.display();
       
    }
    
}
