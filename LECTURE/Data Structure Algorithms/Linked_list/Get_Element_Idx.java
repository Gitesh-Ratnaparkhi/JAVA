public class Get_Element_Idx {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkList {
        Node head = null;
        Node tail = null;

        void Inseert_At_End(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void instert_at_head(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insert_at_index(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (index == size()) {
                Inseert_At_End(val);
                return;
            } else if (index == 0) {
                instert_at_head(val);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int getAt(int index) {
            if (index < 0 || index > size()) {
                System.out.println("Wrong Index ");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.Inseert_At_End(4);
        ll.Inseert_At_End(5);
        ll.Inseert_At_End(12);
        ll.instert_at_head(13);
        ll.insert_at_index(3, 10);
        ll.display();
        System.out.println("Get in index : ");
        System.out.println(ll.getAt(3));
    }
}
