/***********************************************************
 *          Initial TicketMachine implementation           *
 * Simulates a machine which dispenses fixed price tickets *
 ***********************************************************/
 
public class TicketMachine {
  private int price;   // price of a ticket
  private int balance; // money inserted for ticket
  private int total;   // total money inserted in machine 

  // Constructor: initialises machine with price of ticket
  public TicketMachine(int ticketCost) {
    if (ticketCost >= 0) {
      price = ticketCost;
    } else {
      price = 0;
    }
    balance = 0;
    total = 0;
  } 

  // accessor method: returns price of ticket
  public int getPrice() {
    return price;
  }

  public void setPrice(int newPrice){
      price = newPrice;
  }
  
  // accessor method: returns current balance of money
  public int getBalance() {
    return balance;
  }
  

  // mutator method: adds money to current balance
  public void insertMoney(int amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Use a positive amount: " + amount);
    }
  }



  // mutator method: refund balance left in machine and reset
  // machine balance to zero
   public int refundBalance() {
      int refundAmount = balance-price;
      balance = 0;
      return refundAmount;	
  }


  // mutator method: print ticket, update total, reset balance
  public void printTicket() {
    int amountLeftToPay = price-balance;
    //if (amountLeftToPay <= 0) {
      System.out.println("*** Thank you for purchasing this Ticket ***");
      System.out.println("Ticket Price = "+price+" pence");
      System.out.println("Your change is " + refundBalance() + " pence");    
      total += price;   // update total collected with price
      balance -= price; // reduce balance by ticket price
    //} else {
    //  System.out.println("You must insert at least: " + amountLeftToPay + " pence.");
    //}
  }
  
  public int emptyMachine(){
      int amountTakenOut = total;
      total=0;
      return amountTakenOut;      
  }
}