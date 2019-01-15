/*
 * This file is part of Placeholder-2019, licensed under the GNU General Public License (GPLv3).
 *
 * Copyright (c) Riviera Robotics <https://github.com/Team5818>
 * Copyright (c) contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.rivierarobotics.robot.commands;

import org.rivierarobotics.robot.OI;
import org.rivierarobotics.robot.Robot;

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
