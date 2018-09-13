/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

import uulib.Console;

/**
 *
 * @author natha
 */
public class Task3 {
    public static void main(String[] args){
        int input = Console.getInt("Please Enter a number");
        String output;
        if(input == 0){
            output = "Zero";
        }else if(input %2 == 0){
            output = "Even";
        }else{
            output = "Odd";
        }
        System.out.println("The number entered is "+input+" and is therefore "+output);
    }
}
