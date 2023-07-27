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
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

            //test for subArraySum
//            int[] nums = {1,4,20,3,10,5};
//            int target = 33;
//            System.out.println(Arrays.toString(subArraySum(nums,target)));

        //test for removeDuplicates
//        List<Integer> myList = new ArrayList<Integer>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(2);
//        myList.add(4);
//        myList.add(5);

//        System.out.println("Remove Duplicates : "+removeDuplicates(myList));

        //test for hasUniqueChars
//        String input = "abcdefg";
//        System.out.println("Has Unique Chars : "+hasUniqueChars(input));


        //test for findPairs
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

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

    public static int[] subArraySum(int[] nums, int target){

            //create a hashTable
            HashMap<Integer,Integer> myHashMap = new HashMap<Integer,Integer>();

            //create a variable to store sum
            int sum = 0;

            //loop through nums
            for(int i = 0; i < nums.length; i++){
                //add nums[i] to sum
                sum += nums[i];
                //if sum is equal to target, return index of 0 and index of i
                if(sum == target){
                    return new int[]{0,i};
                }
                //if sum - target is in hashTable, return index of sum - target + 1 and index of i
                if(myHashMap.containsKey(sum - target)){
                    return new int[]{myHashMap.get(sum - target) + 1,i};
                }
                //else add sum to hashTable
                else{
                    myHashMap.put(sum,i);
                }
            }
            //return null
            return new int[0];
    }

    public static List<Integer> removeDuplicates(List<Integer> myList){

        //create a hashSet from myList, and it will automatically remove duplicates as hashSet does not allow duplicates
        HashSet<Integer> myHashSet = new HashSet<Integer>(myList);

        //return a new ArrayList from myHashSet as the return type is List<Integer>
        return  new ArrayList<Integer>(myHashSet);



        // Create a HashSet to store unique elements
//        HashSet<Integer> uniqueSet = new HashSet<>();
//
//        // Create a new ArrayList to store elements without duplicates
//        ArrayList<Integer> newList = new ArrayList<>();
//
//        // Loop through the original list and add elements to the new list if they are not already in the HashSet
//        for (Integer num : list) {
//            if (uniqueSet.add(num)) {
//                newList.add(num);
//            }


    }

    public static Boolean hasUniqueChars(String input){


        //create a hashSet
        HashSet<Character> myHashSet = new HashSet<Character>();

        //loop through input

        for(char i: input.toCharArray()){
            //if item is in hashSet, return false
            if(myHashSet.contains(i)){
                return false;
            }
            //else add item to hashSet
            else{
                myHashSet.add(i);
            }
        }

        return true;
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
//        Set<Integer> mySet = new HashSet<>();
//        List<int[]> pairs = new ArrayList<>();
//
//        for (int num : arr1) {
//            mySet.add(num);
//        }
//
//        for (int num : arr2) {
//            int complement = target - num;
//            if (mySet.contains(complement)) {
//                pairs.add(new int[]{complement, num});
//            }
//        }
//
//        return pairs;
//

        // create a hashMap

        HashMap <Integer,Boolean> myHashMap = new HashMap<Integer,Boolean>();

        for (int i : arr1){
            myHashMap.put(i,true);
        }

        List<int[]> pairs = new ArrayList<>();

        for (int j : arr2){
            int complement = target - j;
            if (myHashMap.containsKey(complement)){
                pairs.add(new int[]{complement,j        });
            }
        }

        return pairs;

    }
}
