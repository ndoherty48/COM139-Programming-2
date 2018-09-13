/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Random;
import uulib.Console;
public class NumContainer {
    public static void main(String[] args) {
        int[] numbers = new int[]{9,3,7,2,1,8,6,5,8,4};
        
        //TEST ARRAYS
        int[] Array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] Array2 = {10,9,8,7,6,5,4,3,2,1};
        int[] Array3 = {3,9,6,10,8,2,7,5,1,4};
        
        printArray(Array1);
        bubbleSort(Array1);
        printArray(Array2);
        bubbleSort(Array2);
        printArray(Array3);
        bubbleSort(Array3);
        
        //bubbleSort(numbers);
        
        int[] RandomIntArray = generateRandomInts(100);
        printArray(RandomIntArray);
        bubbleSort(RandomIntArray);
    }
    
    public static void swap(int[] array, int posA, int posB) {
        int temp = array[posA];
        array[posA]=array[posB];
        array[posB]=temp;
    }
    
    public static void printArray(int[] array) {
        for(int i =0;i<array.length;i++){
            Console.print(array[i]+", ");
        }
        Console.println();
    }
    
    public static void bubbleSort(int[] array) {
        int comp=0,swap=0;
        for (int out = array.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                comp++;
                if (array[in] > array[in+1]) {
                    swap(array,in,out);
                    swap++;
                }
            }
        }
        Console.println(comp+" Comparisons and "+swap+" Swaps");
    }
    
    public static int[] generateRandomInts(int qty) {    
        Random r = new Random();
        int[] x = new int[qty];
        for(int i =0;i<qty-1;i++){
            x[i] = r.nextInt(100)+1;
        }
        return x;
    }
    
} // end class
