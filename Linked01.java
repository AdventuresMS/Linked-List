class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linked01{
    public static void main(String[] args) {
        Node  a = new Node(20);  
        Node  b = new Node(30);  
        Node  c = new Node(40);  
        Node  d = new Node(50);  
        Node  e = new Node(60);  
        a.next = b;
        b.next = c;
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(b.next.val);

       
        
        
    }
}