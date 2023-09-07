package bst;

public class App {

    public static void main(String[]  args){

        BST myBST = new BST();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        myBST.rInsert(4);


        //myBST.insert(27);

        System.out.println("Root : "+myBST.root.value);
        System.out.println("Root->left: "+ myBST.root.left.value);
        System.out.println("Root->right: "+ myBST.root.right.value);
       // System.out.println("Root->right->right: "+ myBST.root.right.right.right.value);


    }

}
