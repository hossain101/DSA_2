package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashTableLC {

    public static void main(String[] args){

        //test for itemInCommon
//        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {6,7,5,8,9,10};
//
//        System.out.println("Items In Common : "+itemInCommon(array1,array2));


        //test for findDuplicates
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(2);
//
//        System.out.println("Duplicates : "+findDuplicates(array));


        //test for firstNonRepeatingChar
//        String input = "a green apple";
//        System.out.println("First Non Repeating Character : "+firstNonRepeatingChar(input));

        //test for groupAnagrams
//        String[] stringArray = {"eat"};
//        System.out.println("Group Anagrams : " + groupAnagrams(stringArray));

        //test for twoSum
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
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

    public static Character firstNonRepeatingChar(String input){

        // create hash table
        HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();

        // loop through string

        for(char i: input.toCharArray()){
            // if item is in hash table, increment value
            if(myHashMap.containsKey(i)){
                myHashMap.put(i,myHashMap.get(i)+1);
            }
            // else add item to hash table
            else{
                myHashMap.put(i,1);
            }
        }
        // loop through string
        for (char i : input.toCharArray()) {
            // if item has value of 1, return item
            if (myHashMap.get(i) == 1) {
                return i;
            }
        }
        // return null
        return null;

    }

    public static List<List<String>> groupAnagrams(String[] stringArray) {

        //crate a hashTable
        HashMap<String, List<String>> myHashMap = new HashMap<String, List<String>>();

        //loop through strings
        for (String str : stringArray) {
            myHashMap.put(str, new ArrayList<String>());


        }

        //loop through strings
        for (String str : stringArray) {


            //sort string
            char[] charArray = str.toCharArray();
            //sort string according to unicode values of characters.
            Arrays.sort(charArray);
            //convert sorted charArray to string
            String sortedString = new String(charArray);

            //get list from hashTable
            List<String> anagramList = myHashMap.get(sortedString);

            // If the list is null, create a new ArrayList and put it into the HashMap
            if (anagramList == null) {
                anagramList = new ArrayList<>();
                myHashMap.put(sortedString, anagramList);
            }

            // Add the current string to the list
            anagramList.add(str);

            //add sorted string to hashTable as key and add str which is the original string in stringArray to list as value.
//            myHashMap.put(sortedString, anagramList);
//            anagramList.add(str);
        }

//        for(int i = 0; i < stringArray.length; i++){
//            //sort each string
//            char[] charArray = stringArray[i].toCharArray();
//            Arrays.sort(charArray);
//            String sortedString = new String(charArray);
//            //add each string to hashTable
//            myHashMap.get(sortedString).add(stringArray[i]);
//        }

        //create list to return
        List<List<String>> anagrams = new ArrayList<>();

        //loop through hashTable keys and add value which is  each list to anagrams to return

        for (String key : myHashMap.keySet()) {


            //add each list to anagrams to return

            if (!myHashMap.get(key).isEmpty()) {
                anagrams.add(myHashMap.get(key));
            }


        }


        //return list
        return anagrams;


//        public static List<List<String>> groupAnagrams (String[]input){
//
//            //creating a new HashMap to store each individual string as key and their anagrams as a list as values
//
//
//            HashMap<String, List<String>> myHashMap = new HashMap<String, List<String>>();
//
//
//            for (String str : input) {
//
//                char[] inputToChar = str.toCharArray();
//                Arrays.sort(inputToChar);
//
//                String sortedInput = new String(inputToChar);
//
//                if (myHashMap.containsKey(sortedInput)) {
//                    myHashMap.get(sortedInput).add(str);
//                } else {
//                    ArrayList anagramArrayList = new ArrayList<String>();
//                    anagramArrayList.add(str);
//                    myHashMap.put(sortedInput, anagramArrayList);
//
//                }
//
//
//            }
//            return new ArrayList<>(myHashMap.values());
//
//
//        }
//
//
    }

    public static int[] twoSum(int[] nums, int target){

        //create a hashTable
        HashMap<Integer,Integer> myHashMap = new HashMap<Integer,Integer>();

        //loop through nums
        for(int i = 0; i < nums.length; i++){
            //if target - nums[i] is in hashTable, return index of target - nums[i] and index of nums[i]
            if(myHashMap.containsKey(target - nums[i])){
                return new int[]{myHashMap.get(target - nums[i]),i};
            }
            //else add nums[i] to hashTable
            else{
                myHashMap.put(nums[i],i);
            }
        }
        //return null
        return new int[0];
    }

}
