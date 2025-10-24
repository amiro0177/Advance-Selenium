package com.tyss.crm.GenaricUtility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import com.google.common.primitives.Chars;

public class JavaUtility {

	public int randonNumber() {

		/*
		 * This Method will Generate the Random Number in the form of Integer.
		 * 
		 */
		Random ran = new Random();
		int randomnumber = ran.nextInt(2000);
		return randomnumber;
	}
	
	/**
	 * This method will return the system date in the form of string.
	 * 
	 * @return
	 */

	public String getSystemDate() {
		Date dt = new Date();
		String date = dt.toString();
		return date;
	}

	/**
	 * this method will return the date in format;
	 * 
	 * @return
	 */

	public String getSystemDateAndTimeInFormat() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy HH-mm-ss");
		Date dt = new Date();
		String systemDateInFormat = dateFormat.format(dt);
		return systemDateInFormat;
	}

	/**
	 * This method is used to get the system date and time;
	 * 
	 * @return
	 */
	public String getSystemDateAndTime() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}

}
