package com.service;

import com.robotprogramming.model.RobotImpl;

import java.awt.*;

public class RobotMoveService {

    private RobotImpl robot;

    public RobotMoveService(RobotImpl robot) {
        this.robot = robot;
    }

    public void robotMove(String position) {
        for (int i=0; i< position.length(); i++)
        {
            char val=position.charAt(i);
            Point cp = robot.getPosition();

            if(robot.getCurrDirection()=="N"){
                if ( val== 'V' || val == 'L')
                    robot.setCurrDirection("V");
                else if (val == 'H' || val== 'R')
                    robot.setCurrDirection("Ö");
                else if(val =='G' || val =='F')
                    robot.setPosition(cp.x, cp.y - 1);
            }else if (robot.getCurrDirection()=="S"){
                if ( val== 'V' || val == 'L')
                    robot.setCurrDirection("Ö");
                else if (val == 'H' || val== 'R')
                    robot.setCurrDirection("V");
                else if(val =='G' || val =='F')
                    robot.setPosition(cp.x, cp.y + 1);
            }else if (robot.getCurrDirection()=="Ö") {
                if ( val== 'V' || val == 'L')
                    robot.setCurrDirection("N");
                else if (val == 'H' || val== 'R')
                    robot.setCurrDirection("S");
                else if(val =='G' || val =='F')
                    robot.setPosition(cp.x + 1, cp.y);
            }else if (robot.getCurrDirection()=="V"){
                if ( val== 'V' || val == 'L')
                    robot.setCurrDirection("S");
                else if (val == 'H' || val== 'R')
                    robot.setCurrDirection("N");
                else if(val =='G' || val =='F')
                    robot.setPosition(cp.x - 1, cp.y);
            }
        }
    }
}
