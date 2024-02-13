package outLab2;

import java.lang.StringBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.ArrayList;

public class MSUclass<Key extends Comparable<Key>, Value> {
	String title;
	String courseID;
	int seats;
	int section=1;
	String days;
	String time;
	String location;
	String key;
	boolean lecture;
	String[] data;
	String[] dayTime;
	String[] titleSection;
	String[] getID;
	String[] getTitle;
//	int i;
	
	public MSUclass(String line) {
		/**splits csv into a list**/
		data = line.split(",");
//		if(i<1) {
//		seats = Integer.parseInt(data[4]);
//		}
//		System.out.println();
//		System.out.println("-------------------------");
//		System.out.println(data[1]);
//		System.out.println(data[4]);
////		System.out.println("   "+data[14]);
////		System.out.println("   "+data[15]);
////		System.out.println("   "+data[16]);
//		System.out.println("-------------------------");
//		System.out.println();
//		for(String point:data) {
//			System.out.println(point);
//		}
//		i = i+1;
//		System.out.println(i);
	}
	
	/**all my get functions for printing out the table**/
	public String getID() {
		courseID = data[1];
		getID = courseID.split("-");
		return getID[0];
	}
	public String getTitle() {
		return data[2];
	}
	
	public int getSeats() {
		/**since the only class with 0 seats is CSCI 112 i just check when
		 * there is no students and set it to 35 so works with
		 * seatsClass **/
		int studs = Integer.parseInt(data[4]);
		if(studs==0) {
			return 35;
		}
		return Integer.parseInt(data[4]);
	}
	
	public int getSection() {
		return section;
	}
	/**since the classes.csv has the section number by each ID i isolated the section number**/
	public void setSection() {
		titleSection = data[1].split("-");
		int sections = Integer.parseInt(titleSection[1]);
		section = sections;
		
	}
	
	public boolean isLecture() {
		/**check if its a lecture**/
		if (data[14].equals("Lecture")) {
			lecture = true;
		}
		else lecture = false;
		
		return lecture;
	}
	
	public String getKey() {
		/**use a string builder to build the key from data**/
		StringBuilder sb = new StringBuilder();
		/**building the key**/
		days = data[15];
		location = data[16];
		dayTime = days.split(" ");
		days = dayTime[0];
		time = dayTime[1];
		courseID = data[1];
		getID = courseID.split("-");
		sb.append(days);
		sb.append("-");
		sb.append(time);
		sb.append("-");
		sb.append(location);
		key = sb.toString();
		return key;
	}
}

