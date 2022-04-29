package com.robotprogramming.service;

import com.robotprogramming.model.RobotImpl;

import java.awt.*;

public class RobotMoveService {

    private final RobotImpl robot;

    public RobotMoveService(RobotImpl robot) {
        this.robot = robot;
    }

    public void robotMove(String position) {
        for (int i = 0; i < position.length(); i++) {
            char val = position.charAt(i);
            Point cp = robot.getPosition();

            if (robot.getCurrDirection().equals("N")) {
                if (checkLeft(val))
                    robot.setCurrDirection("V");
                else if (checkRight(val))
                    robot.setCurrDirection("Ö");
                else if (checkMoveForward(val))
                    robot.setPosition(cp.x, cp.y - 1);
            } else if (robot.getCurrDirection().equals("S")) {
                if (checkLeft(val))
                    robot.setCurrDirection("Ö");
                else if (checkRight(val))
                    robot.setCurrDirection("V");
                else if (checkMoveForward(val))
                    robot.setPosition(cp.x, cp.y + 1);
            } else if (robot.getCurrDirection().equals("Ö")) {
                if (checkLeft(val))
                    robot.setCurrDirection("N");
                else if (checkRight(val))
                    robot.setCurrDirection("S");
                else if (checkMoveForward(val))
                    robot.setPosition(cp.x + 1, cp.y);
            } else if (robot.getCurrDirection().equals("V")) {
                if (checkLeft(val))
                    robot.setCurrDirection("S");
                else if (checkRight(val))
                    robot.setCurrDirection("N");
                else if (checkMoveForward(val))
                    robot.setPosition(cp.x - 1, cp.y);
            }
        }
    }

    private boolean checkLeft(char command) {
        return command == 'V' || command == 'L';
    }

    private boolean checkRight(char command) {
        return command == 'R' || command == 'H';
    }

    private boolean checkMoveForward(char command) {
        return command == 'G' || command == 'F';
    }

    public void checkDirectionForNorth(char val) {
        if (checkLeft(val)) {
            robot.setCurrDirection("S");
        } else if (checkRight(val)) {
            robot.setCurrDirection("N");
        } else if (checkMoveForward(val)) {
            robot.setPosition(robot.getPosition().x , robot.getPosition().y-1);
        }
    }

    public void checkDirectionForSouth(char val) {
        if (checkLeft(val)) {
            robot.setCurrDirection("Ö");
        } else if (checkRight(val)) {
            robot.setCurrDirection("V");
        } else if (checkMoveForward(val)) {
            robot.setPosition(robot.getPosition().x, robot.getPosition().y + 1);
        }
    }

    public void checkDirectionForWest(char val) {
        if (checkLeft(val)) {
            robot.setCurrDirection("S");
        } else if (checkRight(val)) {
            robot.setCurrDirection("N");
        } else if (checkMoveForward(val)) {
            robot.setPosition(robot.getPosition().x - 1, robot.getPosition().y);
        }
    }

    public void checkDirectionForEast(char val) {
        if (checkLeft(val)) {
            robot.setCurrDirection("N");
        } else if (checkRight(val)) {
            robot.setCurrDirection("S");
        } else if (checkMoveForward(val)) {
            robot.setPosition(robot.getPosition().x + 1, robot.getPosition().y);
        }
    }
}
