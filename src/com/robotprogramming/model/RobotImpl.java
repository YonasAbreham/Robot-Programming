package com.robotprogramming.model;

import com.robotprogramming.model.IRobot;
import com.robotprogramming.model.IRoom;
import com.service.RobotMoveService;

import java.awt.Point;

public class RobotImpl implements IRobot {
    Point currPosition;
    String currDirection;
    RobotMoveService moveService;

    public RobotImpl() {
        currPosition = new Point();
        currDirection = "N";
        moveService = new RobotMoveService(this);
    }

    public void move(String position) {
        moveService.robotMove(position);
    }

    public String getCurrDirection() {
        return currDirection;
    }

    public void setCurrDirection(String direction) {
        currDirection = direction;
    }

    public Point getPosition() {
        return currPosition;
    }

    public void setPosition(int x, int y) {
        currPosition.x = x;
        currPosition.y = y;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "currPosition=" + currPosition +
                ", currDirection='" + currDirection + '\'' +
                '}';
    }
}
