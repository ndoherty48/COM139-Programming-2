/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;
import uulib.*;
/**
 *
 * @author B00736742
 */
public class Task2 {
    public static void main(String[] args) {
        int coin = Console.getInt("Enter a coin");
        switch(coin){
               case 1: Console.println("One Penny");
                break;
               case 2: Console.println("Two Pence");
                break;
               case 5: Console.println("Five Pence");
                break;
               case 10: Console.println("Ten Pence");
                break;
               case 20: Console.println("Twenty Pence");
                break;
               case 50: Console.println("Fifty Pence");
                break;
               case 100: Console.println("One Pound");
                break;
               case 200: Console.println("Two Pound");
                break;
               default: Console.println("Invalid Coin Value: "+coin);
                break;
        }
    }
}
