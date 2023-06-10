package doublyLinkedList;

public class App {

    public static void main(String[] args) {


        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHead();

        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(1);
        myDLL.append(232323);


        myDLL.printList();

        System.out.println("This is after prepend.");

        myDLL.prepend(69);

        myDLL.printList();



        System.out.println("This is after removeFirst.");

        myDLL.printList();

        System.out.println("At index 2 : "+myDLL.get(2).value);
        System.out.println("At index 4 : "+myDLL.get(4).value);


        System.out.println("lets change up the shizz at index 4 to 6969:" + myDLL.set(4,6969)+ myDLL.get(4).value);

        System.out.println("lets try to insert sth new at index 2 : ");
        myDLL.insert(2, 123456789);
        myDLL.insert(3,3232);
myDLL.insert(4,322323232);
        myDLL.printList();


    }

}
