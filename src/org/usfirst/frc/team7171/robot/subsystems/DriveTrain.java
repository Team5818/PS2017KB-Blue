package org.usfirst.frc.team7171.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	private DriveTrainSide left;
	private DriveTrainSide right;
	
	public DriveTrain() {
		left = new DriveTrainSide(false);
		right = new DriveTrainSide(true);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
