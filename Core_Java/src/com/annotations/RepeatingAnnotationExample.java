package com.annotations;

public class RepeatingAnnotationExample {

	public static void main(String[] args) {
		
	}

	@Schedule
	@Schedule(dayOfWeek="Fri", hour="23")
	public static void doPeriodically(){
		
	}
}
