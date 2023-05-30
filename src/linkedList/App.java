package linkedList;

public class App {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList(3);
        ll.append(8);
        ll.append(8);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(14);
        ll.append(15);
        ll.append(1);
        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(12);

        // Print the list after partitioning
        System.out.println("\nLL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10



    }
}
