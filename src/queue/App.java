package queue;

public class App {
    public static void main(String[] args){

        Queue myQueue = new Queue(10);

        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.printQueue();

        myQueue.dequeue();

        System.out.println("After dequeue");
        myQueue.printQueue();

    }
}
