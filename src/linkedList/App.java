package linkedList;

public class App {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(5);


       // System.out.println(myLinkedList.removeLast().value);

        myLinkedList.prepend(30);
        myLinkedList.printAll();



    }
}
