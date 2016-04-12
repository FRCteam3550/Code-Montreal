package org.usfirst.frc3550.RbtxStrongTaupe2016.filtering;

import java.util.Date;

/**
 * 
 * 
 * @author Robotics
 *
 */

public class LowPassFilter {
	private double m_lastValue = 0;
	private long m_lastTime = -1;
	private double m_RC;
	
	/**
	 * Resets the LowPassFilter
	 */
	public void reset(){
		m_lastValue = 0;
		m_lastTime  = -1;
	}
	
	/**
	 * Specifies an RC value and construct a new LowPassFilter object.
	 * 
	 * @param RC
	 */
	public LowPassFilter(double RC){
		m_RC = RC;
	}
	
	/**
	 * Sets an RC value
	 * 
	 * @param RC
	 */
	public void setRC(double RC){
		m_RC = RC;
	}
	
	/**
	 * Retrieves an RC value
	 * @return 
	 * 
	 * @return
	 */
	public double getRC(){
		return m_RC;
	}
	
	/**
	 * Call this everytime you need to calculate the value. Recommand you do
	 * this every iteration. Otherwise try to reset it.
	 * 
	 * @param value the value to go in
	 * @return The value the filter computes
	 */
	public double Calculate(double value){
		if(m_lastTime > 0){
			long currentTime = new Date().getTime();
			double a = currentTime - m_lastTime;
			a /= (a+m_RC);
			m_lastTime = currentTime;
			m_lastValue = a*value+(1-a)*m_lastValue;
		}else
			m_lastTime = new Date().getTime();
		
		return m_lastValue;
		}
}
