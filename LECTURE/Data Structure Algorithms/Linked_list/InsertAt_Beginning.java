public class InsertAt_Beginning {

    public static class Node{
        int data ;
        Node next ;
        public Node(int data){
            this.data = data;
        }
    }
    public static class LinkList{
        Node head = null;
        Node tail = null;
        void InsertAt_Beginning(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else temp.next = head;
            head = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }    
        }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.InsertAt_Beginning(4);
        list.InsertAt_Beginning(57);
        list.InsertAt_Beginning(34);
        list.InsertAt_Beginning(5);
        list.InsertAt_Beginning(6);
        list. InsertAt_Beginning(8);
        list.InsertAt_Beginning(9);
        list.InsertAt_Beginning(12);
        list.display();
    }
}
