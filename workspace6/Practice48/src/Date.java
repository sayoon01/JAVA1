public class Date {
private int  year, month, day;
	
	public String toString()
	{
		String rslt="";
		
		rslt += (year + "³â ");
		rslt += (month + "¿ù ");
		rslt += (day + "ÀÏ");
		
		return rslt;
	}
	
	public void setYear(int year){ this.year = year; }
	public void setMonth(int month){ this.month = month; }
	public void setDay(int day) { this.day = day;}
	
	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }
}
