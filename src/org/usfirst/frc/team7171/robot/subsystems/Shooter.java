package org.usfirst.frc.team7171.robot.subsystems;

import org.usfirst.frc.team7171.robot.OI;
import org.usfirst.frc.team7171.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	private Solenoid sol1;
	private Solenoid sol2;
	private Solenoid sol3;
	private Solenoid sol4;
	
	public Shooter() {
		sol1 = new Solenoid(RobotMap.SHOOTER_1);
		sol2 = new Solenoid(RobotMap.SHOOTER_2);
		sol3 = new Solenoid(RobotMap.SHOOTER_3);
		sol4 = new Solenoid(RobotMap.SHOOTER_4);
	}
	public void  setExtended(boolean extended)
	{
		if (OI.deadman.get()) {
			sol1.set(extended);
			sol2.set(extended);
			sol3.set(extended);
			sol4.set(extended);
		}
	}

	@Override
	protected void initDefaultCommand() {
		
	}
}
