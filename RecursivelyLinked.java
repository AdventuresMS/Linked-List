class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class RecursivelyLinked {
    public static void print(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        
    }
    public static void displayRecursively(Node head){
        if(head==null) return;
        System.out.println(head.val);
        displayRecursively(head.next);
    }
    public static void main(String[] args) {
        Node  a = new Node(20);  
        Node  b = new Node(30);  
        Node  c = new Node(40);  
        Node  d = new Node(50);  
        Node  e = new Node(60); 
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayRecursively(a);
    }

    
}
