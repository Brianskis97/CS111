public class Artist{
	
	private String last;
	private String first;
	private Date date;
	private String thandle = "N/A";
	private String url = "N/A";
	
	public Artist(String lastin, String firstin, Date datein){
		last = lastin;
		first = firstin;
		date = datein;
	}
	
	public Artist(String lastin, String firstin, Date datein, String thandlein, String urlin){
		last = lastin;
		first = firstin;
		date = datein;
		thandle = thandlein;
		url = urlin;
	}
	
	public String toString(){
		return( "First Name : " + first + "\n"
		+ "Last Name: " + last + "\n"
		+ "Date of Birth(Day/Month/Year): " + date.toString() + "\n"
		+ "Twitter Handle: " + thandle + "\n" 
		+ "Url: " + url);  
	}
	
	public String getFirstName(){
		return first;
	}
	
	public String getLastName(){
		return last;
	}
	
	public String getFullName(){
		return first + " " + last;
	}
		
	
}

