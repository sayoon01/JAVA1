public class Date {
	int year, month, day;
	
	/*public String toString() 
	{
		return (year + "년 " + month + "월 " + day + "일");
	}*/
	
	public String toString()
	{
		String rslt="";
		
		rslt += (year + "년 ");
		rslt += (month + "월 ");
		rslt += (day + "일");
		
		return rslt;
	}
}
