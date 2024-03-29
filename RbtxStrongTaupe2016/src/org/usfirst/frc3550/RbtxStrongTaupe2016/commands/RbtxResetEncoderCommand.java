package org.usfirst.frc3550.RbtxStrongTaupe2016.commands;

import org.usfirst.frc3550.RbtxStrongTaupe2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RbtxResetEncoderCommand extends Command {

    public RbtxResetEncoderCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.encoderSubsystem);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.encoderSubsystem.resetEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
