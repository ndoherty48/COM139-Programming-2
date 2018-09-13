/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import uulib.*;


public class Nialls_Code {
    static Square grass = new Square();
    static Circle sun = new Circle();
    static Boolean sunRise;
    static Boolean sunSet;
    static Square house = new Square();
    static Square window1 = new Square();
    static Square window2 = new Square();
    static Triangle roof = new Triangle();
    static Square door1 = new Square();
    static Square door2 = new Square();
    static Circle handle = new Circle();
    
    public static void main(String[] args) {
        grass.changeSize(1500);
        grass.moveVertical(310);
        grass.moveHorizontal(-160);
        sun.changeSize(80);
        sun.changeColor("yellow");
        house.changeSize(150);
        house.moveRight();
        house.moveVertical(160);
        roof.changeSize(85, 185);
        roof.moveHorizontal(165);
        roof.moveVertical(116);
        window1.changeSize(40);
        window1.moveVertical(185);
        window1.moveHorizontal(39);
        window2.changeSize(40);
        window2.moveVertical(185);
        window2.moveHorizontal(112);
        door1.changeSize(30);
        door1.moveVertical(265);
        door1.moveHorizontal(80);
        door2.changeSize(30);
        door2.moveVertical(280);
        door2.moveHorizontal(80);
        handle.changeSize(5);
        handle.moveVertical(275);
        handle.moveHorizontal(181);
        darkColours();
        makeVisible();
        sunRise();
        sunSet = false;
        sunRise = true;
        
        Boolean done = false;
        String input = GUI.getString("What do you want to do");
        while (done!=true) {
            switch (input) {
                case "sunset":
                    if (sunSet != true) {
                        sunset();
                    } else {
                        GUI.show("Sun is already set");
                    }
                    break;
                case "sunrise":
                    if (sunRise != true) {
                        sunRise();
                    } else {
                        GUI.show("Sun is already risen");
                    }
                    break;
                case "done":
                    done=true;
                    break;
                default:
                    GUI.show("Invalid");
                        break;
            }
            if(done!=true){
            	input = GUI.getString("What do you want to do");
            }
        }
    }
    public static void makeVisible() {
        grass.makeVisible();
        sun.makeVisible();
        house.makeVisible();
        door1.makeVisible();
        door2.makeVisible();
        handle.makeVisible();
        window2.makeVisible();
        window1.makeVisible();
        roof.makeVisible();
    }
    public static void colours() {
        grass.changeColor("green");
        house.changeColor("red");
        door1.changeColor("blue");
        door2.changeColor("blue");
        handle.changeColor("yellow");
        window1.changeColor("yellow");
        window2.changeColor("yellow");
        roof.changeColor("green");
    }
    public static void darkColours() {
        sunSet = true;
        sunRise = false;
        house.changeColor("black");
        window1.changeColor("white");
        window2.changeColor("white");
        grass.changeColor("black");
        roof.changeColor("black");
        door1.changeColor("black");
        door2.changeColor("black");
        handle.changeColor("black");
    }
    public static Boolean sunset() {
        for (int i = 1; i <= 50; i++) {
            sun.slowMoveHorizontal(1);
            if (i % 2 == 0) {
                sun.slowMoveVertical(-1);
            }
        }
        for (int i = 1; i <= 430; i++) {
            sun.slowMoveHorizontal(1);
            if (i % 2 == 0 && i < 60) {
                sun.slowMoveVertical(-1);
            }
            if (i > 60 && i < 90) {
                if (i % 3 == 0) {
                    sun.slowMoveVertical(-1);
                }
            }
            if (i > 130 && i < 150) {
                if (i % 3 == 0) {
                    sun.slowMoveVertical(1);
                }
            }
            if (i > 150 && i < 170) {
                if (i % 2 == 0) {
                    sun.slowMoveVertical(1);
                }
            }
            if (i > 170) {
                sun.slowMoveVertical(1);
            }
        }
        darkColours();
        return true;
    }
    public static Boolean sunRise() {
        sunRise = false;
        sunSet = false;
	//
        sun.moveVertical(-100);//
        sun.moveHorizontal(-600);
        sun.makeVisible();
        for (int i = 1; i <= 130; i++) {
            sun.slowMoveHorizontal(1);
            sun.slowMoveVertical(-1);
            if(i ==20){
                colours();
            }
        }
        sunRise = true;
        return sunRise;
    }
}

