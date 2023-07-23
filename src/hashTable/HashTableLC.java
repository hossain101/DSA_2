package hashTable;

import java.util.*;

public class HashTableLC {

    public static void main(String[] args){

        //test for itemInCommon
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,5,8,9,10};

        System.out.println("Items In Common : "+itemInCommon(array1,array2));
    }


    public static boolean itemInCommon(int[] array1, int[] array2){
        // create hash table for array1

        HashMap<Integer,Boolean> myHashMap = new HashMap<Integer,Boolean>();

        // loop through array1 and add each item to hash table

        for(int i: array1){
            myHashMap.put(i,true);
        }
        // loop through array2 and check if item is in hash table
        for(int j: array2){
            if(myHashMap.containsKey(j)){
                return true;
            }
        }

        // if loop finishes, return false

        return false;
    }
}
