// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3550.RbtxStrongTaupe2016.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3550.RbtxStrongTaupe2016.Robot;
import org.usfirst.frc3550.RbtxStrongTaupe2016.RobotMap;

/**
 * La commande RbtxAccelerPourLancerCommand permet de mettre l accelerateur a une vitesse optimale
 * Lorsque cette vitesse est atteinte indicateur lumineux est active sur le dashboard
 * L operateur peut alors activer la gachette
 */
public class RbtxAccelerPourLancerAutomatiqueCommand extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public RbtxAccelerPourLancerAutomatiqueCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
       // requires(Robot.ramasseur);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Boolean  AccelerateurPret = false;
    	//SmartDashboard.putBoolean("Accelerateur Pret", AccelerateurPret);
    	setTimeout(3); //change from 9 seconds to 4 seconds and should be tested with the new value
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean  accelerateurPret = false;
    	SmartDashboard.putBoolean("Accelerateur Pret", accelerateurPret);
    	Robot.shooter.accelererVitesse80();
    	//RobotMap.moteurAccelerateur.set(0.75);
    	accelerateurPret = (Robot.shooter.accelererateurPret() == true);
    	//Robot.ramasseur.aspirerLeBallon();
    	SmartDashboard.putBoolean("Accelerateur Pret", accelerateurPret);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.stop();
    	SmartDashboard.putBoolean("Accelerateur Pret", false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
