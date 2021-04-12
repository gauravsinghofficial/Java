public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//        sll.display();
//        insert at first.......

//        sll.insertFirst(11);
//        sll.insertFirst(8);
//        sll.insertFirst(1);
//        sll.display();


//        insert at last/.......

//        sll.insertLast(11);
//        sll.insertLast(8);
//        sll.insertLast(1);
//        sll.display();


        // delete the first node of singly linkedlist


//        sll.insertLast(11);
//        sll.insertLast(8);
//        sll.insertLast(1);
//        sll.display();
//        System.out.println(sll.deleteFirst().data);
//        System.out.println(sll.deleteFirst().data);
//        sll.display();


    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
