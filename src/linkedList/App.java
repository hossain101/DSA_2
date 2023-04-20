package linkedList;

public class App {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.append(10);
        myLinkedList.append(15);
        myLinkedList.append(20);

         System.out.println(myLinkedList.get(3).value);

       // System.out.println(myLinkedList.removeLast().value);

        myLinkedList.prepend(30);
        myLinkedList.set(3,100);
        myLinkedList.set(44,99);

        myLinkedList.insert(2, 99);
        myLinkedList.insert(0, 4548);
        myLinkedList.insert(6, 23);
        myLinkedList.printAll();



    }
}
