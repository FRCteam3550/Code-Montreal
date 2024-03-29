package org.usfirst.frc3550.RbtxStrongTaupe2016.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RbtxShooter70Command extends CommandGroup {
    
    public  RbtxShooter70Command() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//addSequential(new RbtxDriveToDistanceWithEncoders(6, 0.5));
    	addParallel(new RbtxLancerPourAutomatiqueCommand());
    	addSequential(new RbtxAccelerPourLancer70Command());
    	//addParallel(new RbtxDriveToDistanceWithEncoders(5, 0.5));
    }
}
