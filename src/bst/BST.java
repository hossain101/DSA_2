package bst;


public class BST {

    public Node root;

   private Node rInsert(Node currentNode,int value){

       if(currentNode ==null) return new Node(value);

       if(value<currentNode.value){
           currentNode.left = rInsert(currentNode.left,value);

       }
       else if(value>currentNode.value){
           currentNode.right = rInsert(currentNode.right, value);
       }

       return currentNode;


   }

   public void rInsert(int value){

       if(root==null) root = new Node(value);
       rInsert(root,value);
   }
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

public boolean rContains(int value){
        return rContains(root, value);
}
}
