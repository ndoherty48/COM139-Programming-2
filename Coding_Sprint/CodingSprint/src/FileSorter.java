/*
 * Author: Dermot Kerr
 * Email: d.kerr@ulster.ac.uk
 * Date: 19 February 2018
 * Description: COM139 Coding Sprint Starter Code
 */
import uulib.*;
public class FileSorter {
    public static void main(String[] args) {
        // Task: Complete main method below
        // Read array from supplied text file (practice.txt) using UUlib
        int[] fileArray = readArrayFromFile("practice.txt");
        // Sort array using Bubble sort and Selection sort
        bubbleSort(fileArray);
        selectionSort(fileArray);
        // Compute the following stats from array obtained from text file
            // Total number of positive values
            Console.println("Positive Numbers = "+countPositiveValues(fileArray));
            // Total number of negative values
            Console.println("Negative Numbers = "+countNegativeValues(fileArray));
            // Total number of zero values
            Console.println("Zeros = "+countZeroValues(fileArray));
            // Minimum value
            Console.println("Minimum Value = "+minArrayValue(fileArray));
            // Maximum value
            Console.println("Maximum Value = "+maxArrayValue(fileArray));
            // Mean, median and mode values
            Console.println("Mean = "+meanArrayValue(fileArray));
            Console.println("Median = "+medianArrayValue(fileArray));
            Console.println("Mode = "+modeArrayValue(fileArray));
    }
    
    public static void printArray(int[] array) {
        /*
        Description: prints the contents of an array to screen, one element per line
        Parameters:  int array of values to be printed
        Returns: void
        */
        System.out.println("-----");
        for(int i = 0; i < array.length; i++){
            System.out.println( array[i] );
        }
    }
    
    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers 
        */   
        InputFile in = new InputFile(filename);
        int size = in.readInt(); // get size of array - first element in file
        int[] array = new int[size];
        for (int i=0; i< size; i++) {
            array[i] = in.readInt(); // read elements of array
        }
        in.close();
        return array;
    }
    public static int countPositiveValues(int[] array) {
        /*
        Description: Counts the positive integer values in an array
        Parameters:  int array to be counted
        Returns: int number of positive values
        */  
        // Task: Complete method code
        int count=0;
        for(int i = 0;i<array.length;i++){
            if(array[i]>0){
                count++;
            }
        }
        return count;
    }
    
    public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative values
        */ 
        // Task: Complete method code
        int count=0;
        for(int i = 0;i<array.length;i++){
            if(array[i]<0){
                count++;
            }
        }
        return count;
    }
    
    public static int countZeroValues(int[] array) {
        /*
        Description: Counts the zero integer values in an array
        Parameters:  int array to be counted
        Returns: int number of zero values
        */
        // Task: Complete method code
        int count=0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        return count;
    }
    
    public static double meanArrayValue(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */  
        // Task: Complete method code
        double mean=0.0;
        for(int i=0;i<array.length;i++){
            mean+=array[i];
        }
        mean /=array.length;
        return mean;

    }
    
    
    public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted!
        */  
        // Task: Complete method code
        bubbleSort(array);
        double median = 0;
        median = (array[(array.length/2)-1]+array[array.length/2])/2;
        return median;
    }
    
    public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted!
        */  
        int mode = array[0];
        int maxCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) {
                    count++;
                }
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }
    
    public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */  
        // Task: Complete method code
        int min = array[0];
        for(int i =1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    
    public static int maxArrayValue(int[] array) {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */ 
        // Task: Complete method code
        int max = array[0];
        for(int i =1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    
    public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */ 
        // Task: Complete method code
        int temp;
        temp = array[posB];
        array[posB] = array[posA];
        array[posA] = temp;
    }
    
    public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */ 
        // Task: Complete method code and count number of comparisons and swaps
        int comparisons = 0, swaps=0;
        for (int out = array.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                comparisons++;
                if (array[in] > array[in+1]) {
                    int tmp = array[in]; // swap items
                    array[in] = array[in+1]; //
                    array[in+1] = tmp; //
                    swaps++;
                }
            }
        }
        Console.println("Bubble Sort Comparisons = "+comparisons+"\nBubble Sort Swaps = "+swaps);
    } 
    
    public static void selectionSort(int array[]) {
        /*
        Description: Sorts a int array using selection sort algorithm
        Parameters:  int array of values to be sorted
        Returns: void
        */ 
        int in, out, min;
        int ncomps=0,nSwaps = 0;
        for (out=0; out < array.length-1; out++) {
            min = out;
            for (in = out+1; in < array.length; in++) {
                ncomps++;
                if (array[in] < array[min]) {
                    min = in;            // new minimum 
                }
            }
            swap( array, min, out);
            nSwaps++;
        }
        Console.println("Selection Sort Comparisons = "+ncomps+"\nSelection Sort Swaps = "+nSwaps);
    }
}