package com.interfaces.defaultmethods;

import java.time.LocalDateTime;

public interface TimeClient_v1 {

	void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
