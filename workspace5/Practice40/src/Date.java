public class Date {
	int year, month, day;
	
	/*public String toString() 
	{
		return (year + "�� " + month + "�� " + day + "��");
	}*/
	
	public String toString()
	{
		String rslt="";
		
		rslt += (year + "�� ");
		rslt += (month + "�� ");
		rslt += (day + "��");
		
		return rslt;
	}
}
