package linkedList;

import node.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////
    private Node head;
    private Node tail;
    private int length;


    LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp; //because of this return statement, the value of the removed node can be accessed in App.java. If you don't want to return the value, you can just return null.

    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null; //this will remove the reference from the first item to the second item. If you don't do this, the first item will still be pointing to the second item, and the second item will still be pointing to the third item, and so on. This will cause a memory leak. instead this will result in garbage collection.
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp; //because of this return statement, the value of the removed node can be accessed in App.java. If you don't want to return the value, you can just return null.
    }

    public Node get(int index) {
        if (index >= length || index < 0) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;


    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }


    public void reverse(){
        if(length == 0){
            return;
        }
        Node temp = head;
        head = tail;
        tail = temp;

        Node after  = temp.next;
        Node before = null;


      for (int i = 0; i < length; i++) {
          after = temp.next;
          temp.next = before;
          before = temp;
          temp = after;

      }}

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }


    public Node findMiddleNode(){

        if(head ==null){
            return null;
        }

        Node slow,fast;
        slow=head;
        fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public Node findKthFromEnd(int k){

        Node fast = head;
        Node slow = head;

        for(int i=0; i<k; i++){

            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while (fast !=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


    //reverse a linked list from position m to n. Do it in one-pass. Diagram found in diagrams/singly_linked_list_reverse_between_two_specific_nodes.png
    public void reverseBetween(int m, int n){
        if(head == null)return;

        Node beforeHead = new Node(0);
        beforeHead.next = head;

        Node nodeM = head;
        Node beforeNodeM = beforeHead;
        for(int i=0; i<m; i++){
            nodeM = nodeM.next;
            beforeNodeM = beforeNodeM.next;
        }



        for(int i = 0; i<n-m; i++){
            Node nodeToBeMoved = nodeM.next;
            nodeM.next = nodeToBeMoved.next;
            nodeToBeMoved.next = beforeNodeM.next;
            beforeNodeM.next = nodeToBeMoved;

        }

        head = beforeHead.next;

    }

  public void partitionList(int x){
        if (head==null)return;

        Node beforeHeadNewListLessThanX = new Node(0);
        Node beforeHeadNewListGreaterThanX = new Node(0);


        //when the code runs, the endNodeNewListLessThanX will be the last node of the new list that contains all the nodes less than x. The endNodeNewListGreaterThanX will be the last node of the new list that contains all the nodes greater than x.
        Node endNodeNewListLessThanX = beforeHeadNewListLessThanX;
        Node endNodeNewListGreaterThanX = beforeHeadNewListGreaterThanX;

        Node current = head;

        while(current!=null){

            if(current.value<x){
                endNodeNewListLessThanX.next = current;
                endNodeNewListLessThanX = current;
            }
            else{
                endNodeNewListGreaterThanX.next = current;
                endNodeNewListGreaterThanX = current;

            }

            current = current.next;

        }
        endNodeNewListGreaterThanX.next = null;
        endNodeNewListLessThanX.next =  beforeHeadNewListGreaterThanX.next;

        head = beforeHeadNewListLessThanX.next;
  }

  /*public void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }*/

  public void removeDuplicates(){
        if(head == null) return;

            Node beforeHead = new Node(0);
            beforeHead.next = head;

        Node current = head;
        Node beforeCurrent = beforeHead;
        Node remover = new Node(0);

    List<Integer> values = new ArrayList<>();
        while(current!=null){

            if(values.contains(current.value)){
                beforeCurrent.next = current.next;
                current = current.next;
                length--;

            }
            else {
                values.add(current.value);
                current = current.next;
                beforeCurrent = beforeCurrent.next;
            }




        }

  }



}

