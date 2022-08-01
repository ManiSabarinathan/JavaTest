public class LinkedList1 {
    Node head;

    public void add(int data){

        Node node = new Node();
        node.data=data;
        node.next=null;

        if(head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        System.out.println("^^^^^ :: ");
    }

    public void print() {
        Node n = head;
        while(n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }


}
class Node {
    int data;
    Node next;
}