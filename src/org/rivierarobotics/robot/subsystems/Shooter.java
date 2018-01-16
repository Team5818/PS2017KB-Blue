/*
 * This file is part of PS2017KB-Blue, licensed under the GNU General Public License (GPLv3).
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
package org.rivierarobotics.robot.subsystems;

import org.rivierarobotics.robot.OI;
import org.rivierarobotics.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	private Solenoid sol1;
	private Solenoid sol2;
	private Solenoid sol3;
	private Solenoid sol4;
	
	public Shooter() {
		sol1 = new Solenoid(RobotMap.SHOOTER_1);
		sol2 = new Solenoid(RobotMap.SHOOTER_2);
		sol3 = new Solenoid(RobotMap.SHOOTER_3);
		sol4 = new Solenoid(RobotMap.SHOOTER_4);
	}
	public void  setExtended(boolean extended)
	{
		if (OI.deadman.get()) {
			sol1.set(extended);
			sol2.set(extended);
			sol3.set(extended);
			sol4.set(extended);
		}
	}

	@Override
	protected void initDefaultCommand() {
		
	}
}
