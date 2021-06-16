package test;

import com.robotprogramming.model.RobotImpl;
import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit Test for simple robot cotroller
 */

public class RobotTest extends TestCase {
   RobotImpl robot;

    @Override
    protected void setUp() throws Exception {
        robot=new RobotImpl();
    }

    @Test
    public void testTurnLeft(){
        robot.move("L");
        assertTrue(robot.getCurrDirection()== "V");
    }

    @Test
    public void testTurnRight(){
        robot.move("R");
        assertTrue(robot.getCurrDirection() == "Ö");
    }

    @Test
    public void testMoveForward(){
        robot.move("G");
        assertTrue(robot.getCurrDirection() =="N");
    }

    @Test
    public void testSampleMove1(){
        robot.move("RRFLFFLRF");
        assertTrue(robot.getCurrDirection() =="Ö");
        assertTrue(robot.getPosition().x == 3);
        assertTrue(robot.getPosition().y == 1);
    }

    @Test
    public void testSampleMove2(){
        robot.setPosition(1,2);
        robot.move("HGHGGHGHG");
        System.out.println(robot.getPosition());
        assertTrue(robot.getCurrDirection() =="N");
        assertTrue(robot.getPosition().x == 1);
        assertTrue(robot.getPosition().y == 3);
    }

    @Test
    public void testMultiplePosition(){
        robot.move("HGHG");
        assertTrue(robot.getCurrDirection()=="S");
    }

    @Test
    public void testDirectionNorth(){
        assertTrue(robot.getCurrDirection() == "N");
    }

    @Test
    public void testGetDirection(){
        assertNotNull("Directtion not return null",robot.getCurrDirection());
    }
}
