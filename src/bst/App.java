package bst;

public class App {

    public static void main(String[]  args){

        BST myBST = new BST();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        myBST.rInsert(4);
        myBST.rInsert(5);
        myBST.rInsert(6);
myBST.rInsert(47);
myBST.rInsert(21);
myBST.rInsert(76);
myBST.rInsert(18);
myBST.rInsert(27);
myBST.rInsert(52);
myBST.rInsert(82);



        //myBST.insert(27);

        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSPOrder());
       // System.out.println("Root->right->right: "+ myBST.root.right.right.right.value);


    }

}
