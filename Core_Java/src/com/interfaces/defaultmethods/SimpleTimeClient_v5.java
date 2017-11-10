package com.interfaces.defaultmethods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SimpleTimeClient_v5 implements TimeClient_v5 {

	/*
	 * (non-Javadoc)
	 * We are explecitly giving implemetation for getZonedDateTime
	 * as this method is declared as abstract in interface
	 */
	
	@Override
	public ZonedDateTime getZonedDateTime(String zoneString) {
		System.out.println("From impl returning default time");
		return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault()) ;
	}

	private LocalDateTime dateAndTime;
	
	public SimpleTimeClient_v5() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
    public static void main(String... args) {
        TimeClient_v5 myTimeClient = new SimpleTimeClient_v5();
        System.out.println(myTimeClient.toString());

        //Uses default method from interface
        System.out.println("Time in California: " +
                myTimeClient.getZonedDateTime("Blah blah").toString());
        
    }

}
