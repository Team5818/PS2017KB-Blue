package org.usfirst.frc.team7171.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class ShootAndRetract extends CommandGroup {
	private static double wait = 0.5;

	public ShootAndRetract() {
		this.addSequential(new ActuateShooter());
		this.addSequential(new TimedCommand(wait));
		this.addSequential(new ActuateShooter(true));
	}
}
