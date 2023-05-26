package linkedList;

public class App {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.append(10);
        myLinkedList.append(15);




       // System.out.println(myLinkedList.removeLast().value);
       // myLinkedList.reverse();


        myLinkedList.reverseBetween(2,2);

        myLinkedList.printAll();



    }
}
