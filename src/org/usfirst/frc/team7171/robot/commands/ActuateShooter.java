package org.usfirst.frc.team7171.robot.commands;

import org.usfirst.frc.team7171.robot.Robot;
import org.usfirst.frc.team7171.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class ActuateShooter extends Command {

	private Shooter shooter;
	private boolean retract;

	private static final double TIMEOUT = 0.5;
	public ActuateShooter(boolean retract) {
		this.retract = retract;
		shooter = Robot.shooter;
		requires(shooter);
		setTimeout(TIMEOUT);
	}
	
	public ActuateShooter() {
		this(false);
	}

	@Override
	public synchronized void start() {
		if (retract) {
			shooter.setPlunger(shooter.RETRACTED);
		} else {
			shooter.setPlunger(shooter.EXTENDED);
		}
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

}
