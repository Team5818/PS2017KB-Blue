package org.usfirst.frc.team7171.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	public static final int L_TALON_F = 0; // set
	public static final int L_TALON_B = 1; 
	public static final int R_TALON_F = 2;
	public static final int R_TALON_B = 3;
	
	public static final int JS_FW_BACK = 0;
	public static final int JS_TURN = 1;
	public static final int CD_BUTTONS = 2;
	
	public static final int SHOOTER = 0;
}
