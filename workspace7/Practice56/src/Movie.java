import java.util.Random;

public class Movie {
	private String title, director, mid;
	private int year;
	
	public void setTitle(String t) {title = t; }
	public void setDirector(String d) {director = d;}
	public void setYear (int y) {year = y;}
	
	public String getTitle() {return title;}
	public String getDirector() {return director;}
	public int getYear() {return year;}
	
	public String toString() {
		String rslt = "";
		rslt += ("번호 : " + mid + "\n");
		rslt += ("제목 : " + title + "\n");
		rslt += ("감독 : " + director + "\n");
		rslt += ("제작 년도 : " + year + "년\n");
		return rslt;
	}
	
	Random rg = new Random();
	public Movie()
	{
		mid = makeId();
		title = "모름";
		director = "모름";
		year = -1;
		//score = -1;
	}
	
	private String makeId()
	{
		String id ;
		int n1 = rg.nextInt(9000) + 1000;
		int n2 = rg.nextInt(9000) + 1000;
		id = n1 + "-" + n2;
		return id;
	}

	public static String compareMovies(Movie x, Movie y)
	{
		String rslt = ("영화 " + x.mid + "와 영화 " + y.mid + "는 "); 
		boolean equal1 = compareDirector(x,y);
		if(equal1 == true)
			rslt += "감독이 같고 ";
		else
			rslt += "감독이 다르고 ";
		
		boolean equal2 = compareYear(x,y);
		if(equal2 == true)
			rslt += "제작년도가 같습니다";
		else
			rslt += "제작년도가 다릅니다.";
		
		return rslt;
	}
	
	private static boolean compareDirector(Movie x, Movie y)
	{
		if((x.director).equals(y.director) == true)
			return true;
		else
			return false;
	}
	private static boolean compareYear(Movie x, Movie y)
	{
		if(x.year == y.year)
			return true;
		else
			return false;
	}
}
