package obscuretime;
import java.time.Year;
public class JaredDate {
	private int day;
	private int month;
	private Year year;
	private String notationSystem;
	
	JaredDate(int day, int month, Year yr, String notationSystem){
		this.day = day;
		this.month = month;
		this.year = yr;
		this.notationSystem = notationSystem;
	}
	
	
	public String getNotationSystem() {
		return notationSystem;
	}


	public void setNotationSystem(String notationSystem) {
		this.notationSystem = notationSystem;
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	
	
	
	
	
	
	
	
	
	
	
}
