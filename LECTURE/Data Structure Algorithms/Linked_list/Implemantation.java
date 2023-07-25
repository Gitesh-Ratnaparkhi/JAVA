public class Implemantation {

    // Creating the node of the list 
    public static class Node {
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
        }      
    }

    // this is the class which create the link list
    public static class LinkList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null)head = temp;           
            else tail.next = temp;
            tail = temp;
        }
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtEnd(4);
        list.insertAtEnd(57);
        list.insertAtEnd(34);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.display();
    }
}
    

