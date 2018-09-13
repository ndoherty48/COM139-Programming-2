/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

/**
 *
 * @author natha
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int p =7,q=-4;
        int r = (3*p)+(4*q);
        int s = (5*p)+(6*r);
        int t;
        if(r > s){
            t =p+q+r;
        }else{
            t =p+q+s;
        }
        System.out.println("P = "+p+" Q = "+q+" R = "+r+" S = "+ s+ " T = " +t);
    }
    
}
