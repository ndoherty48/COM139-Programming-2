
import uulib.GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
public class Question3 {
    Square wall;
    Square window, window2;
    Triangle roof;
    Circle sun;
    boolean Set;
    int size;

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.draw();
        
    }
    // Draw this picture.
    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
 
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
 
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
 
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        sun = new Circle();
        
        size = 60;
        
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(size);
        sun.makeVisible();
        
        Set = false;
        
        for(int i = 0;i<i+1;i++){
            String input = GUI.getString("Would you like to make the sun 'Set' or 'Rise'");
            switch (input) {
                case "Set":
                    settingSun();
                    break;
                case "set":
                    settingSun();
                    break;
                case "Rise":
                    risingSun();
                    break;
                case "rise":
                    risingSun();
                    break;
                default:
                    GUI.show("OOPS! command not recognised");
                    break;
            }
            
        }
    }
    // Change this picture to black/white display
    private void setBlackAndWhite() {
        if (wall != null) { // only if it's painted already...
            wall.changeColor("black");
            window.changeColor("white");
            //window1.changeColor("white");
            window2.changeColor("white");
            roof.changeColor("black");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }
    // Change this picture to use colour display
    private void setColor() {
        if (wall != null) { // only if it's painted already...
            wall.changeColor("red");
            window.changeColor("black");
            //window1.changeColor("black");
            window2.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    /* If not already night-time this method causes the sun
    to set and day to turn to night by changing the picture
    to black and white and making the sun disappear */

    public void settingSun() {
        sun.slowMoveHorizontal(50);
        sun.makeInvisible();
        setBlackAndWhite();
    }

    /* If it is night, this method causes the sun to appear
    and rise into the midday sky and night turns to day by
    changing the picture to colour */
    public void risingSun() {
        sun.moveHorizontal(-235);
        sun.makeVisible();
        sun.slowMoveHorizontal(185);
        setColor();
    }
} // end of class

