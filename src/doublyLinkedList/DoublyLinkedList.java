package doublyLinkedList;
import node.Node;
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            System.out.println("list is empty");
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
            return head;
        } else {
            Node temp = tail;
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
            length--;
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            System.out.println("list is empty");
            return null;
        } else if (length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            Node temp = head;
            head = head.next;
            head.previous = null;
            temp.next = null;
            length--;
            return temp;
        }
    }


    public Node get(int index){
        Node temp = null;
        if(index<0 && index>length){
            return null;
        }

        else if(index<length/2){
             temp = head;
            for(int i=1; i<index; i++){
                temp = temp.next;

            }

        }
        else if (index>length/2){
             temp = tail;
            for(int i=1; i>length-index;i++){
                temp = temp.previous;

            }

        }

        return temp;


    }

}

