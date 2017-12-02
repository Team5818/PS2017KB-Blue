package org.usfirst.frc.team7171.robot.subsystems;

import org.usfirst.frc.team7171.robot.commands.TeleopDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	private DriveTrainSide left;
	private DriveTrainSide right;
	
	public DriveTrain() {
		left = new DriveTrainSide(false);
		right = new DriveTrainSide(true);
	}
	
	public void setPower(double powLeft, double powRight) {
		left.setPower(powLeft);
		right.setPower(powRight);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TeleopDrive());
	}

}
