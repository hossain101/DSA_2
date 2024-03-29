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
            head.previous = newNode;
            newNode.next = head;

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
        if(index<0 || index>length){
            return null;
        }

        else if(index<length/2){
             temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
        }
        else {
             temp = tail;
             //for the loop to atleast run once the length and index are subtracted by 1
            for(int i= 0; i<length-index-1;i++){
                temp = temp.previous;
            }
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if (index < 0 && index > length) return false;

        else if(index==0){
            prepend(value);
            return true;
        }
        else if (index==length){
            append(value);
            return true;
        }
        else{
            Node newNode = new Node(value);
            Node before = get(index-1);
            Node after = before.next;

            newNode.next = after;
            newNode.previous = before;

            before.next = newNode;
            after.previous = newNode;
            length++;
            return true;
        }
    }
    public Node remove(int index){
        if(index==0&&index>length){
            return null;
        }
        else if(index==0){
            return removeFirst();
        }
        else if(index==length-1){
            return removeLast();
        }
        else{
            Node temp =get(index);
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            temp.next = null;
            temp.previous= null;
            length--;
            return temp;
        }
    }

//    public void swapFirstLast() {
//        if (length < 2) return;
//        int temp = head.value;
//        head.value = tail.value;
//        tail.value = temp;
//    }
    public void swapFirstLast(){
        if(length==0){
            System.out.println("List is empty");
        }
        else if(length==1){
            System.out.println("Only one element in the list");
        }
        else{
           head.next.previous = tail;
           head.previous = tail.previous;
           tail.previous.next = head;
           tail.next=  head.next;
           head.next = null;
           tail.previous=null;
           Node temp = head;
           head = tail;
           tail = temp;

        }
    }

//    public void reverse() {
//        Node current = head;
//        Node temp = null;
//
//        while (current != null) {
//            temp = current.prev;
//            current.prev = current.next;
//            current.next = temp;
//            current = current.prev;
//        }
//
//        temp = head;
//        head = tail;
//        tail = temp;
//    }
    public void reverse(){
        if(length==0){
            System.out.println("List is empty");
        }
        if(length==1){
            System.out.println("Only one element in the list");

        }
        else{
            Node start = head;
            Node end = tail;


            for(int i=0; i<(length+1)/2;i++){
                int startTemp = start.value;
                start.value = end.value;
                end.value = startTemp;
                start = start.next;
                end = end.previous;

            }
        }
}

    boolean isPalindrome(){
        if(length==0){
            return false;
        }
        else if(length==1){
            return true;
        }
        else{
            Node start = head;
            Node end = tail;

            int startValue=head.value;

            for(int i=0; i<length/2; i++){
                if(start.value==end.value){
                    start=start.next;
                    end=end.previous;

                }
                else {
                    return false;
                }

            }
            return true;
        }
    }


//
//    public void swapPairs() {
//        Node dummy = new Node(0);
//        dummy.next = head;
//        Node prev = dummy;
//
//        while (head != null && head.next != null) {
//            Node firstNode = head;
//            Node secondNode = head.next;
//
//            prev.next = secondNode;
//            firstNode.next = secondNode.next;
//            secondNode.next = firstNode;
//
//            secondNode.prev = prev;
//            firstNode.prev = secondNode;
//            if (firstNode.next != null) {
//                firstNode.next.prev = firstNode;
//            }
//
//            head = firstNode.next;
//            prev = firstNode;
//        }
//
//        head = dummy.next;
//        if (head != null) head.prev = null;
//    }
//

public void swapPairs(){
        if(length==0){
            System.out.println("List is empty");
        }
        else if(length==1){
            System.out.println("Can't swap only one element.");
        }
        else {
            Node start = head;
            Node afterStart = head.next;

            while(afterStart!=null){
                int temp = start.value;
                start.value = afterStart.value;
                afterStart.value = temp;
                start = afterStart.next;
                if(start!=null){
                    afterStart = start.next;
                }
                else{
                    break;
                }


            }


        }
}


}

