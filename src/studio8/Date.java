package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean isHoliday;

	public Date(String month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	public String getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public boolean isHoliday() {
		return isHoliday;
	}

    
    public static void main(String[] args) {
    	Date today = new Date("April", 6, 2023, false);
    	Date ayahBday = new Date("May", 4, 2004, true);
    	Date dallonBday = new Date("May", 4, 2004, true);
    	Date erinBday = new Date("September", 3, 2003, true);
    	Date yjhBday = new Date("October", 4, 1995, false);

    	
    	LinkedList<Date> dateList = new LinkedList<Date>();
    	dateList.add(today);
    	dateList.add(ayahBday);
    	dateList.add(dallonBday);
    	dateList.add(erinBday);
    	dateList.add(yjhBday);
    	System.out.print(dateList);
    	
    	HashSet<Date> dateSet = new HashSet<Date>();
    	dateSet.add(today);
    	dateSet.add(erinBday);
    	dateSet.add(ayahBday);
    	dateSet.add(dallonBday);
    	dateSet.add(yjhBday);
    	System.out.print(dateSet);
    }

	@Override
	public String toString() {
		return "Date month: " + month + ", day: " + day + ", year: " + year + ", isHoliday: " + isHoliday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && Objects.equals(month, other.month)
				&& year == other.year;
	}

    
}
