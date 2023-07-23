package hashTable;

import java.util.*;

public class HashTableLC {

    public static void main(String[] args){

        //test for itemInCommon
//        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {6,7,5,8,9,10};
//
//        System.out.println("Items In Common : "+itemInCommon(array1,array2));


        //test for findDuplicates
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);

        System.out.println("Duplicates : "+findDuplicates(array));
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


    public static List<Integer> findDuplicates(ArrayList<Integer> array){

        // create hash table
        HashMap<Integer,Boolean> myHashMap = new HashMap<Integer,Boolean>();
        // create list to return
        List<Integer> duplicates = new ArrayList<Integer>();
        // loop through array
        for(int i: array){
            // if item is in hash table, add to list
            if(myHashMap.containsKey(i)){
                duplicates.add(i);
            }
            // else add item to hash table
            else{
                myHashMap.put(i,true);
            }
        }
        // return list
        return duplicates;
    }
}
