public class Date {
	int year, month, day;
	
	public String toString()
	{
		String rslt="";
		
		rslt += (year + "�� ");
		rslt += (month + "�� ");
		rslt += (day + "��");
		
		return rslt;
	}
	
	public void setYear(int y)
	{
		 year = y;
	}
	public void setMonth(int m)
	{
		month = m;
	}
	public void setDay(int d)
	{
		day = d;
	}
}
