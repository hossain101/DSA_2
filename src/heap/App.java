package heap;

public class App {
    public static void main(String[] args){
        System.out.println("This is the output for heap app.");

        Heap myHeap = new Heap();

        myHeap.insert(99);
        myHeap.insert(80);
        myHeap.insert(75);
        myHeap.insert(60);
        myHeap.insert(68);
        myHeap.insert(55);


        System.out.println(myHeap.getHeap());

        System.out.println("After Removing top");

        myHeap.remove();

        System.out.println(myHeap.getHeap());

    }


}
