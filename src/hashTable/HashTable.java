package hashTable;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ": ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        if (dataMap[index] == null) {
            dataMap[index] = new Node(key, value);
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(key, value);
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];

        while (temp != null) {

            if (temp.key == key) return temp.value;
            temp = temp.next;
        }


        return 0;


    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i<dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp!=null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

}
