package bst;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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






    public ArrayList<Integer> BFS(){



        Node currentNode = root;

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();

        queue.add(currentNode);

        while (queue.size()>0){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left!=null) queue.add(currentNode.left);
            if(currentNode.right!=null) queue.add(currentNode.right);
        }

        return results;

    }
}
