public class Movie {
	private String title, director;
	private int score, year;
	
	public void setTitle(String t) {title = t; }
	public void setDirector(String d) {director = d;}
	public void setScore (int s) {score = s;}
	public void setYear (int y) {year = y;}
	
	public String getTitle() {return title;}
	public String getDirector() {return director;}
	public int getScore() {return score;}
	public int getYear() {return year;}
	
	public String toString() {
		String rslt = "";
		rslt += ("제목 : " + title + "\n");
		rslt += ("평점 : " + score + "점\n");
		rslt += ("감독 : " + director + "\n");
		rslt += ("개봉년도 : " + year + "년\n");
		return rslt;
	}
}
