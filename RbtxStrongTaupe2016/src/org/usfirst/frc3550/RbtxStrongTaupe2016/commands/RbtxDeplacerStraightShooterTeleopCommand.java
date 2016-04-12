package org.usfirst.frc3550.RbtxStrongTaupe2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RbtxDeplacerStraightShooterTeleopCommand extends CommandGroup {
    
    public  RbtxDeplacerStraightShooterTeleopCommand(double distance1, double Speed) {

    	addSequential(new RbtxDriveToDistanceWithEncodersTeleop(distance1, Speed));
    	addSequential(new RbtxShooterAutomatiqueCommand());
    }
}
