package tree;

public class App {

    public static void main(String[] args){

        Tree.BinarySearchTree myBST = new Tree.BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);

        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);
    }
}
