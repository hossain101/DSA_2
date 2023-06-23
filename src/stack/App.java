package stack;

public class App {

    public static void main(String[] args){

        Stack myStack = new Stack(2);
        myStack.getTop();
        myStack.getHeight();


        myStack.push(3);
        myStack.push(4);
        myStack.push(1);

        myStack.printStack();



    }
}
