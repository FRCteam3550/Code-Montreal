package org.usfirst.frc3550.RbtxStrongTaupe2016.subsystems;

import org.usfirst.frc3550.RbtxStrongTaupe2016.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RbtxEncoderSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	//private final Encoder       m_encoder    = RobotMap.encodeurDeplacementGauche;
	
	public RbtxEncoderSubsystem(){
	super ("RbtxEncoderSubsystem");
	 //m_encoder.setDistancePerPulse(((8.0/12.0*Math.PI)*0.2151) / 360.0); 
     //m_encoder.setPIDSourceType(PIDSourceType.kRate);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void resetEncoder(){
    	//m_encoder.reset();
    }
}

