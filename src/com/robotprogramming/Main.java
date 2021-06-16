package com.robotprogramming;

import com.robotprogramming.model.RobotImpl;
import com.robotprogramming.util.Util;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        String answer="n";
        RobotImpl robot = new RobotImpl();
        robot.setPosition(1, 2);
        System.out.println("Start position ==>\t" + robot.toString());

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter robot move:");
            String move = scanner.nextLine();
            if (Util.isAlphabet(move)) {
                robot.move(move);
                System.out.println("Robot move ==>\t" + robot.toString());
            } else {
                System.out.println("Invalid move");
            }
            System.out.println("Do you want to continue? y or n");
            answer = scanner.nextLine();
        }while (answer.equals("Y") || answer.equals("y"));

    }
}
