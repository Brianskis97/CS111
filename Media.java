abstract class Media{
	
	private String title;
	private Artist majorArtist;
	private time playingTime;
	private int numPlays = 0;
	
	
	public Media(String titlein, Artist artin, time timein){
		title = titlein;
		majorArtist = artin;
		playingTime = timein;
	}
	
	public void playMedia(){
		numPlays = numPlays + 1;
		System.out.println("Now Playing: " + title + "\n" 
		+ "Playing Time (h:m:s):  " + playingTime.toString());
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getNumPlays(){
		return numPlays;
	}
	
	public time getPlayingTime(){
		return playingTime;
	}
	
	public Artist getMajorArtist(){
		return majorArtist;
	}
	
	public String toString(){
		return("Title: " + title + "\n"
		+ "Major Artist: " + majorArtist.getFullName() + "\n"
		+ "Playing Time(h:m:s): " + playingTime.toString() + "\n"
		+ "Number of Plays: " + numPlays
		);
	}
	
} 
