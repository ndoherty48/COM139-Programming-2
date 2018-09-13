/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import uulib.*;
/**
 *
 * @author natha
 */
public class ExamResults {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] results = {45, 59, 23, 89, 94, 51, 65, 74, 23, 65, 96, 21, 44, 33, 59, 85, 49, 58, 56, 69};
        Console.println("Average: "+average(results));
        Console.println("Lowest Result: "+minVal(results));
        Console.println("Highest Result: "+maxVal(results));
        Console.println("Linear Search for 65: "+linearSearch(results,65));
        Console.println("Binary Search for 65: "+binarySearch(results,65));
    }
    public static void printArray(int[] array){
        for(int i =0;i<array.length;i++){
            Console.print(array[i]+", ");
        }
        Console.println();
    }
    public static double average(int[] array){
        double avg=0.0;
        for(int i =0;i<array.length;i++){
            avg+=array[i];
        }
        avg = avg/array.length;
        return avg;
    }
    public static int maxVal(int[] array){
        for (int out = array.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in+1]) {
                    int temp = array[in];
                    array[in]=array[out];
                    array[out]=temp;
                }
            }
        }
        return array[array.length-1];
    }
    public static int minVal(int[] array){
        for (int out = array.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in+1]) {
                    int temp = array[in];
                    array[in]=array[out];
                    array[out]=temp;
                }
            }
        }
        return array[0];
    }
    
    public static int linearSearch(int items[], int key){
        for(int i = 0; i < items.length; i++) {
            if (key == items[i]) {
                return i; // found it so return position
            }
        }
        return -1; // not found so return -1
    }
    public static int binarySearch(int items[], int key) {
        int left = 0, right = items.length-1;
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (key == items[pivot]) {
                return pivot; // found
            } else if (key > items[pivot]) {
                left = pivot + 1; // search right
            } else {
                right = pivot - 1; // search left
            }
        }
        return -1; // not found
    }
    
}
