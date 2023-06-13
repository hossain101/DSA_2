package doublyLinkedList;

public class App {

    public static void main(String[] args) {


        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.append(6);
        myDLL.append(7);
        myDLL.append(8);
        myDLL.append(9);


        myDLL.printList();

        System.out.println("After Swap");

        myDLL.swapPairs();
        myDLL.printList();



    }

}
