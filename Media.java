abstract class Media{
	
	private String title;
	private Artist majorArtist;
	private double playingTime;
	private int numPlays = 0;
	
	
	public Media(String titlein, Artist artin, double timein){
		title = titlein;
		majorArtist = artin;
		playingTime = timein;
	}
	
	public void playMedia(){
		numPlays = numPlays + 1;
		System.out.println("Now Playing: " + title + "\n" 
		+ "Playing Time: " + playingTime);
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getNumPlays(){
		return numPlays;
	}
	
	public double getPlayingTime(){
		return playingTime;
	}
	
	public Artist getMajorArtist(){
		return majorArtist;
	}
	
	public String toString(){
		return("Title: " + title + "\n"
		+ majorArtist.toString() + "\n"
		+ "Playing Time: " + playingTime + "\n"
		+ "Number of Plays: " + numPlays
		);
	}
	
} 
