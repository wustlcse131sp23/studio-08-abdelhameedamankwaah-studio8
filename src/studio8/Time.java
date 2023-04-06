package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean isTwelveHour;
	
	public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}


	public boolean isTwelveHour() {
		return isTwelveHour;
	}


	public Time(int hour, int minute, boolean isTwelveHour) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.isTwelveHour = isTwelveHour;
	}

	public static void main(String[] args) {
		Time first = new Time(11, 46, true);
		Time second = new Time(11, 46, false);
		System.out.println(first.toString());
		
		
    }


	@Override
	public String toString() {
		return "Time hour: " + hour + ", minute: " + minute + ", isTwelveHour: " + isTwelveHour;
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, isTwelveHour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isTwelveHour == other.isTwelveHour && minute == other.minute;
	}

	
}