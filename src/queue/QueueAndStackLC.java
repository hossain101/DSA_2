package queue;

import java.util.ArrayList;
import java.util.*;

public class QueueAndStackLC {


//new stack using arraylist

    public class StackNew<T> {

        private ArrayList<T> stackList = new ArrayList<>();

        public ArrayList<T> getStackList() {
            return stackList;
        }

        public void printStack() {
            for (int i = stackList.size()-1; i >= 0; i--) {
                System.out.println(stackList.get(i));
            }
        }

        public boolean isEmpty() {
            return stackList.size() == 0;
        }

        public T peek() {
            if (isEmpty()) {
                return null;
            } else {
                return stackList.get(stackList.size() - 1);
            }
        }

        public int size() {
            return stackList.size();
        }

        public void push(T value){
            stackList.add(value);
        }


        public T pop(){
            T removed = peek();

            if(isEmpty()) return null;

            stackList.remove(size()-1);

            return removed;
        }

        public static String reverseString(String myString){
            String reversedString = "";

            Stack stringStack = new Stack();

            for(char c: myString.toCharArray()){
                stringStack.push(c);
            }

            while(stringStack.peek()!=null){
                reversedString+=stringStack.pop();
            }

            return reversedString;
        }

//        public static boolean isBalancedParentheses(String parentheses) {
//            Stack<Character> stack = new Stack<>();
//            for (char p : parentheses.toCharArray()) {
//                if (p == '(') {
//                    stack.push(p);
//                } else if (p == ')') {
//                    if (stack.isEmpty() || stack.pop() != '(') {
//                        return false;
//                    }
//                }
//            }
//            return stack.isEmpty();
//        }

        public boolean isBalancedParentheses(String myString){
            StackNew leftParentheses  = new StackNew();
            StackNew rightParentheses = new StackNew();

            if(myString.length()%2!=0) return false;
            for(char c: myString.toCharArray()){
                if(leftParentheses.size()==0&&c==')') return false;

                if(c=='('){
                    leftParentheses.push(c);
                }
                else {
                    rightParentheses.push(c);

                }



            }
            return rightParentheses.size() == leftParentheses.size();
        }




        public  StackNew sortStack(StackNew myStack){
           StackNew tempStack = new StackNew();

              while(!myStack.isEmpty()){
                int temp = (int) myStack.pop();

                while(!tempStack.isEmpty()&&(int)tempStack.peek()>temp){
                     myStack.push(tempStack.pop());
                }
                tempStack.push(temp);
              }
              return tempStack;
        }
        //enqueue using stacks
//        public void enqueue(int value) {
//            while (!stack1.isEmpty()) {
//                stack2.push(stack1.pop());
//            }
//            stack1.push(value);
//            while (!stack2.isEmpty()) {
//                stack1.push(stack2.pop());
//            }
//        }
//          dequeue using stacks
//        public Integer dequeue(){
//            if(stack1.isEmpty())return null;
//
//            return stack1.pop();
//        }


    }






}
