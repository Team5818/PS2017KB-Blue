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

import org.rivierarobotics.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class DriveTrainSide {

    private WPI_TalonSRX front;
    private WPI_TalonSRX back;

    public DriveTrainSide(boolean isRightSide) {
        if (isRightSide) {
            front = new WPI_TalonSRX(RobotMap.R_TALON_F);
            back = new WPI_TalonSRX(RobotMap.R_TALON_B);
        } else {
            front = new WPI_TalonSRX(RobotMap.L_TALON_F);
            back = new WPI_TalonSRX(RobotMap.L_TALON_B);
            front.setInverted(true);
            back.setInverted(true);
        }
    }

    public void setPower(double power) {
        front.set(power);
        back.set(power);
    }

}
