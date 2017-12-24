package com.itacademy.task22;

public class TimeInterval {

	private int sec;
	private int min;
	private int hour;

	public TimeInterval(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	public TimeInterval(int sec) {
		this.sec = sec % 60;
		int m = (sec - this.sec) / 60;
		this.min = m % 60;
		this.hour = (m - this.min) / 60;

	}
	
	public int getSecond() {
		return sec + min * 60 + hour * 3600;
	}
	
	public void printTimeInSec() {
		System.out.println("Intervar in sec: " + this.getSecond());
	}
	
	public void printTime() {
		System.out.println(String.format("Time interval: %s h, %s min, %s sec", this.hour, this.min, this.sec));
	}
	
	public int compareTime (TimeInterval t) {
		return this.getSecond() - t.getSecond();
	}
	
	

}
