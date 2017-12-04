package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.Robot;
import org.usfirst.frc.team7171.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

	private Shooter shooter;
	private static final double TIMEOUT = 0.5;
	public Shoot() {
		shooter = Robot.shooter;
		requires(shooter);
		setTimeout(TIMEOUT);
	}

	@Override
	public synchronized void start() {
		shooter.setPlunger(shooter.EXTENDED);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

}
