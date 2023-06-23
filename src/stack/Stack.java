package stack;

public class Stack {
    private Node top;
    private Node bottom;

    private int height;


    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        bottom = newNode;
        height = 1;

    }

    public void printStack(){
        Node temp = top;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: "+top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+ height);
    }



}
