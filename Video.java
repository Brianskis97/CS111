abstract class Video extends Media{
	
	private String supportingactors[];
	private int numActors;
	private String director;
	private String rating;
	
	public Video(String titlein, Artist artin, double timein, String[] supactin, int numactin, String direcin, String ratin){
		 super(titlein, artin, timein);
		 supportingactors = supactin;
		 director = direcin;
		 rating = ratin;
	 }
	
	public void playMedia(){
		super.playMedia();
		System.out.println("Rating: " + rating);
	}
	
	public String toString(){
		String output = "";
		for (int i = 0; i<supportingactors.length; i++){
			if(i < supportingactors.length-1){
				output = output + supportingactors[i] + ", ";
			}
			else{
				output = output + supportingactors[i];
			}
		}
				
		return (super.toString() + "\n"
		+ "Supporting Actors: " + output + "\n"
		+ "Number of Actors: " + numActors + "\n"
		+ "Director: " + director + "\n"
		+ "Rating: " + rating);
	}
	
	public String getRating(){
		return rating;
	}
}
