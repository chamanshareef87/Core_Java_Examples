package com.interfaces.defaultmethods;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public interface TimeClient_v2 {

	void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    //This will enforce impl to implement it
    ZonedDateTime getZonedDateTime(String zoneString);

}
