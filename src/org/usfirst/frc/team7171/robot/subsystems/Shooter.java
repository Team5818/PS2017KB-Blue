package org.usfirst.frc.team7171.robot.subsystems;


import org.usfirst.frc.team7171.robot.OI;
import org.usfirst.frc.team7171.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	public static final boolean EXTENDED = true;
	public static final boolean RETRACTED = !EXTENDED;

	private Solenoid plunger;
	
	public Shooter() {
		plunger = new Solenoid(RobotMap.SHOOTER);
	}

	public void setPlunger(boolean extended) {
		if (OI.deadman.get()) {
			plunger.set(extended);
		}
	}

	@Override
	protected void initDefaultCommand() {

	}

}
