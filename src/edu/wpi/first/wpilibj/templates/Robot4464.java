/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot4464 extends SimpleRobot {
    
    Drive driveBase = new Drive();
    Manipulator Shooter = new Manipulator();
   // SecondaryProcessor ODroid = new SecondaryProcessor(); // do not use this yet. 

    public void robotInit() {
    }

    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        
        while(this.isAutonomous()&&this.isEnabled()){  //do not modify this line
            
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        
        while(this.isOperatorControl()&&this.isEnabled()){ // do not modify this line
            
        }
    }

    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    }

    public void disable() {
        while (this.isDisabled()) {
            Timer.delay(0.01);
        }


    }
}
