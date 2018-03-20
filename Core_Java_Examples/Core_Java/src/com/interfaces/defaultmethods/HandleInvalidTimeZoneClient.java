package com.interfaces.defaultmethods;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface HandleInvalidTimeZoneClient extends TimeClient_v3 {

	 default public ZonedDateTime getZonedDateTime(String zoneString) {
	        try {
	        	System.out.println("Am from HandleInvalidTimeZoneClient interface");
	            return ZonedDateTime.of(getLocalDateTime(),ZoneId.of(zoneString)); 
	        } catch (DateTimeException e) {
	            System.err.println("Invalid zone ID: " + zoneString +
	                "; using the default time zone instead.");
	            return ZonedDateTime.of(getLocalDateTime(),ZoneId.systemDefault());
	        }
	}
	 
}
