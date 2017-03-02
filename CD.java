public class CD extends Audio{
	
	private String[] tracks;
	private int numTracks;
	
	public CD(String titlein, Artist artin, time timein, Artist[] groupin, int members, Artist producerin, String[] tracksin, int numtracks){
		super(titlein, artin,timein, groupin, members, producerin);
		tracks = tracksin;
		numTracks = numtracks;
		
	}
	
	public void playMedia(int track){
		super.playMedia();
		System.out.println("Track" + "(" + track + "): " + tracks[track]); 
	}
	
	public String toString(){
		String output = "Tracks: \n";
		for (int i = 0; i<tracks.length; i++){
			if(i < tracks.length-1){
				output = output + (i+1) + ": " + tracks[i] + "\n";
			}
			else{
				output = output + (i+1) + ": " + tracks[i];
			}
		}
		
		return(super.toString() + "\n"	+ output + "\n");
		
	}
		
	
}
