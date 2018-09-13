/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import uulib.*;
/**
 *
 * @author natha
 */
public class Question1 {
    public static void main(String args[]) {
        TicketMachine tm1 = new TicketMachine(Console.getInt("Enter Value to set ticket price: "));
        System.out.println("A ticket costs:" + tm1.getPrice() + "p");
        int balance = Console.getInt("Please enter money to purchase ticket, or 0 to cancel: ");
        if(balance!=0){
            int price = tm1.getPrice();
            while(balance<price){
                int due = price-balance;
                Console.println("You must insert at least: "+due+" pence");
                int moreAdded = Console.getInt("Please enter money to purchase ticket, or 0 to cancel: ");
                balance = balance+ moreAdded;
                if(moreAdded==0){
                    break;
                }
            }
            tm1.printTicket();
        }
        
    }
}
