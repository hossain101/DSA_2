package hashTable;

public class App {
    public static void main(String[] args){
        HashTable myHashTable = new HashTable();

        myHashTable.set("grapes", 10000);
        myHashTable.set("apples", 54);
        myHashTable.set("oranges", 2);
        myHashTable.set("pears", 234);
        myHashTable.set("bolts", 100);
        myHashTable.set("nuts", 100);
        myHashTable.set("screws", 100);
        myHashTable.set("washers", 100);


        System.out.println(myHashTable.keys());

    }
}
