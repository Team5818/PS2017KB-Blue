package org.usfirst.frc.team7171.util;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class DeadmanButton extends Trigger {
	
	private JoystickButton button;
	
	public DeadmanButton(GenericHID joy, int buttonNum) {
		button = new JoystickButton(joy, buttonNum);
	}

	// needed to start command running
	public void bind(Command comm) {
		Scheduler.getInstance().add(comm);
		cancelWhenActive(comm);
		whenInactive(comm);
	}

	public boolean get() {
		return button.get();
	}

}
