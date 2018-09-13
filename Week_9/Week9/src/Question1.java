/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
public class Question1 {
    public static void main(String[] Args){
        Circle myCircle = new Circle();
        Square mySquare = new Square();
        
        myCircle.changeSize(10);
        myCircle.changeColor("blue");
        myCircle.makeVisible();
        mySquare.changeSize(50);
        mySquare.changeColor("yellow");
        mySquare.moveRight();
        mySquare.moveDown();
        mySquare.makeVisible();
    }
}
