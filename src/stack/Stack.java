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

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top = newNode;
            bottom = newNode;

        }

        else{
            newNode.next = top;
            top = newNode;

        }
        height++;

    }

    public Node pop(){
        if(height==0){
            System.out.println("Stack is empty");
            return null;

        }
        else{
            Node temp = top;
            top = top.next;
            temp.next = null;


            height--;
            return temp;
        }

    }


}
