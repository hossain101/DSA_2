package doublyLinkedList;

public class App {

    public static void main(String[] args) {


        DoublyLinkedList myDLL = new DoublyLinkedList(7);


   myDLL.prepend(6);
           myDLL.prepend(5);
              myDLL.prepend(4);
                    myDLL.prepend(3);
                        myDLL.prepend(2);
                        myDLL.prepend(1);
                            myDLL.prepend(0);







        myDLL.printList();


        myDLL.remove(7);
        System.out.println("After removing 0th index");

        myDLL.printList();
    }

}
