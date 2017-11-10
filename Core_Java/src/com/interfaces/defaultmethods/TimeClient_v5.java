package com.interfaces.defaultmethods;

import java.time.ZonedDateTime;

public interface TimeClient_v5 extends TimeClient_v3{

	//This will now become a mandatory to implement
	public ZonedDateTime getZonedDateTime(String zoneString);

}
