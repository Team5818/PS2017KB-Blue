package org.usfirst.frc.team7171.robot.subsystems;

import org.usfirst.frc.team7171.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrainSide extends Subsystem {
	
	private CANTalon front;
	private CANTalon back;
	
	public DriveTrainSide(boolean isRightSide) {
		// probably need to reverse some of these
		if (isRightSide) {
			front = new CANTalon(RobotMap.R_TALON_F);
			back = new CANTalon(RobotMap.R_TALON_B);
		} else {
			front = new CANTalon(RobotMap.L_TALON_F);
			back = new CANTalon(RobotMap.L_TALON_B);
		}
	}
	
	public void setPower(double power) {
		front.set(power);
		back.set(power);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
