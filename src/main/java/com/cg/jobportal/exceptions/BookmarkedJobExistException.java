package com.cg.jobportal.exceptions;
/**************************************************************************************
 * @author       Vedavyas 
 * Description : This is bookmarkedjob already exists exception class. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
public class BookmarkedJobExistException extends Exception {
	

	public BookmarkedJobExistException(String msg) {
		super(msg);
	
	}

	public BookmarkedJobExistException() {
		super();
	}
	

}
