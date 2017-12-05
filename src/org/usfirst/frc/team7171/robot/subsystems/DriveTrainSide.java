package org.usfirst.frc.team7171.robot.subsystems;

import org.usfirst.frc.team7171.robot.OI;
import org.usfirst.frc.team7171.robot.RobotMap;

import com.ctre.CANTalon;

public class DriveTrainSide {
	
	private CANTalon front;
	private CANTalon back;
	
	public DriveTrainSide(boolean isRightSide) {
		if (isRightSide) {
			front = new CANTalon(RobotMap.R_TALON_F);
			back = new CANTalon(RobotMap.R_TALON_B);
		} else {
			front = new CANTalon(RobotMap.L_TALON_F);
			back = new CANTalon(RobotMap.L_TALON_B);
			front.setInverted(true);
			back.setInverted(true);
		}
	}
	
	public void setPower(double power) {
		if (OI.deadman.get()) {
			front.set(power);
			back.set(power);
		} else {
			front.set(0);
			back.set(0);
		}
	}

}
