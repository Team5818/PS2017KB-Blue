package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.OI;
import org.usfirst.frc.team7171.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopDrive extends Command {

	private static double deadband = 0.1;

	public TeleopDrive() {
		requires(Robot.dt);
		setInterruptible(true);
	}

	@Override
	protected void execute() {
		double fwBack = OI.jsFwBack.getY();
		double turn = OI.jsTurn.getX();

		if (Math.abs(fwBack) < deadband) {
			fwBack = 0;
		}
		if (Math.abs(turn) < deadband) {
			turn = 0;
		}

		double leftPow;
		double rightPow;
		if (fwBack > 0.0) {
			leftPow = fwBack + turn;
			rightPow = fwBack - turn;
		} else {
			leftPow = fwBack - turn;
			rightPow = fwBack + turn;
		}
		Robot.dt.setPower(leftPow, rightPow);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
