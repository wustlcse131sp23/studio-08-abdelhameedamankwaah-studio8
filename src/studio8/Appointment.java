/**
 * 
 */
package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	private String location;



	public Appointment(Date date, Time time, String location) {
		super();
		this.date = date;
		this.time = time;
		this.location = location;

	}
	
	public String getLocation() {
		return location;
	}
	
	public Date getDate() {
		return date;
	}


	public Time getTime() {
		return time;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	@Override
	public String toString() {
		return "Appointment date: " + date + ", time: " + time + ", location: " + location;
	}

	public Appointment calendar(Date date, Time time) {
		Appointment calendar = new Appointment(date, time, location);
		return calendar;
	}
	

	public static void main(String[] args) {
		
    	Date erinBday = new Date("September", 3, 2003, true);
    	Date ayahBday = new Date("May", 4, 2004, true);
    	Date yjhBday = new Date("October", 4, 1995, false);


		Time now = new Time(12, 17, true);
		Time later = new Time(12, 25, true);
		Time whenever = new Time(20, 25, false);


		
		Appointment first = new Appointment(erinBday, now, "Um 4");
		Appointment second = new Appointment(ayahBday, later, "Room 4432");
		Appointment third = new Appointment(yjhBday, whenever, "ROom 4406");


	
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
    	calendar.add(first);
    	calendar.add(second);
    	calendar.add(third);
    	
    	
    	System.out.println(calendar.toString());
    	

		
	}
	
	
	
}
