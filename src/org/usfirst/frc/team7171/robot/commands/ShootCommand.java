package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootCommand extends Command {

	private boolean extend;
	
	public ShootCommand(boolean e)
	{
		requires(Robot.s);
		setInterruptible(false);
		setTimeout(.01);
		extend = e;
	}
	@Override
	protected void initialize() {
		Robot.s.setExtended(extend);
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
