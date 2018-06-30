package practice.euler;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int dx = 1;
        int dy = 1;
        
        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();
        
        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();
        
        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();
            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }       
    }
}
