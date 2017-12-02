package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.Robot;
import org.usfirst.frc.team7171.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class DisableRobot extends Command {
	
	private DriveTrain dt;
	public DisableRobot() {
		dt = Robot.dt;
	}

	@Override
	protected void initialize() {
		requires(dt);
		setInterruptible(false);
		dt.setPower(0, 0);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
