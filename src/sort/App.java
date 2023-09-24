package sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4,8,7,9,33,44,5,66,4,345,342,3,44,5,2,3,1,3,1,1,232,32,3,2,1,23,5,6,1 };
//        BubbleSort bs = new BubbleSort();
        //bs.bubbleSort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

//        System.out.println(Arrays.toString(arr));
//
//        SelectionSort mySelectionSort = new SelectionSort();
//
//        mySelectionSort.selectionSort(arr);
//
//        System.out.println(Arrays.toString(arr));

        InsertionSort myInsertionSort  =new InsertionSort();

        myInsertionSort.insertionSort(arr);

        System.out.println(Arrays.toString(arr));




    }
}
