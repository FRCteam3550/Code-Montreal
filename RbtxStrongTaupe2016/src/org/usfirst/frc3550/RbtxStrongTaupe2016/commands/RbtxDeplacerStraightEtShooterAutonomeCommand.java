package org.usfirst.frc3550.RbtxStrongTaupe2016.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RbtxDeplacerStraightEtShooterAutonomeCommand extends CommandGroup {
    
    public  RbtxDeplacerStraightEtShooterAutonomeCommand(double StartPosition) {
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
    	
    	// -2.23 ft represents the closest distance to the target safe enough to score
    	addSequential(new RbtxDriveToDistanceWithEncoders(StartPosition-2.23, 0.5));
    	addSequential(new RbtxShooterAutomatiqueCommand());
  	  	

    }
}
