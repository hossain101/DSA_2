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
        myDLL.printList();

        System.out.println("after reverse");

        myDLL.reverse();
        myDLL.printList();


        System.out.println(myDLL.get(3).value);

    }

}
