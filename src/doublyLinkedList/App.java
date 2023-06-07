package doublyLinkedList;

public class App {

    public static void main(String[] args) {


        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHead();

        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(1);


        myDLL.printList();

        System.out.println("This is after prepend.");

        myDLL.prepend(69);

        myDLL.printList();



    }

}
