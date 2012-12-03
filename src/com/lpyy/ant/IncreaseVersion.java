package com.lpyy.ant;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Property;


public class IncreaseVersion extends Task {

	private String oldversioncode;
	private String newversioncode;
	
	
	/*********************************************************************
	 * Creates the file
	 **********************************************************************/
	public void execute() throws BuildException {
		
		System.out.println(" LPYY  IncreaseVersion..."+oldversioncode);
		try {
			if(null != oldversioncode && !oldversioncode.equals("")){
				int newvc = Integer.parseInt(oldversioncode);
//				newvc++;
//				newversioncode = Integer.toString(newvc);
				getProject().setNewProperty(newversioncode, "888");
			}
		} catch (Exception ex) {
			throw new BuildException(ex.getMessage());
		} finally {
			
		}
	}

	public void setOldversioncode(String oldvc){
		oldversioncode = oldvc;
	}
	
	public void setNewversioncode(String newvc){
		newversioncode = newvc;
	}

}