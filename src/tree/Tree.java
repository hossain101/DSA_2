package tree;

public class Tree {

    public static class BinarySearchTree{

        public Node root;

        public boolean insert(int value) {
            Node newNode = new Node(value);

            if (root == null) {
                root = newNode;
                return true;
            }
            Node temp = root;
            while (true) {
                //this checks if the new Node that is created has the same value as one of the nodes in the tree
                if (newNode.value == temp.value) return false;

                //this checks if the newNode has a value less than root and so on to the left to add the new node to the appropriate place.
                if (newNode.value < temp.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return true;
                    }
                    //since there is no empty place on the left, we move one node down to basically repeat the process.
                    temp = temp.left;

                }
                //same as the left but for the right side as newNode.value>temp.value.
                else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    }
                    temp = temp.right;
                }


            }


        }

        //new method called contains to see if the tree contains


    boolean contains(int value){

            Node temp = root;

            while(temp!=null){
                if(value==temp.value)return true;
                if(value<temp.value){
                    temp = temp.left;
                }
                else{
                    temp = temp.right;
                }

            }
            return false;
    }



    }









    
}
