/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort.binarysearch3.pkg0;

/**
 *
 * @author luoos2514
 */
public class BubbleSortBinarySearch30 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    int nums[] = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};

    //print out unsorted list
    for (int count = 0; count < nums.length; count++) {
      System.out.print(nums[count] + " ");
    }
    
    System.out.println("\n---------------------------------");
    bubbleSort(nums);

    //print out sorted list
    System.out.println("After sorting using the Bubble Sort,"
      + " the array is:");
    for (int count = 0; count < nums.length; count++) {
      System.out.print(nums[count] + " ");
    }
    
    System.out.println("\n\nHI");
    System.out.println("\nThe value 30 is at index: " + binarySearch(nums, 0, nums.length, 30));
  }

  public static void bubbleSort(int data[]) {
    int counter;
    //Loop to control number of passes
    for (int pass = 1; pass < data.length; pass++) {
      //Loop to control # of comparisons for length of array-1
      for (int element=0;element<data.length-1;element++) {
        //compare side-by-side elements and swap them if
        //first element is greater than second element
        if (data[element] > data[element + 1]) {
          swap(data, element, element + 1);  //call swap method
        }
      }
    }
  }

  public static void swap(int array2[], int first, int second) {
    int hold = array2[first];
    array2[first] = array2[second];
    array2[second] = hold;
  }
  
  public static int binarySearch(int[] sortedArray, int start, int end, int goal){
      if(start > end){
          return(-1);
      }
      
      else{
          int halfwayIndex = (start + end)/2;
          
          if(goal == sortedArray[halfwayIndex]){
              return(halfwayIndex);
          }
          
          else if(goal > sortedArray[halfwayIndex]){
              return(binarySearch(sortedArray, halfwayIndex+1, end, goal));
          }
          
          else {
              return(binarySearch(sortedArray, start, halfwayIndex+1, goal));
          }
          
      }
  }
}
