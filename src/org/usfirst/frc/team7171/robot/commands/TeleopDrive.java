package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopDrive extends Command {

	private static double deadband = 0.1;
	
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
			if (turn > 0.0) {
				leftPow = Math.min(fwBack + turn, 1.0);
				rightPow = fwBack - turn;
			} else {
				rightPow = Math.min(fwBack - turn, 1.0);
				leftPow = fwBack + turn;
			}
		} else {
			if (turn > 0.0) {
				leftPow = Math.max(fwBack - turn, -1.0);
				rightPow = fwBack + turn;
			} else {
				rightPow = Math.max(fwBack + turn, -1.0);
				leftPow = fwBack - turn;
			}
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
