abstract class Video extends Media{
	
	private Artist supportingactors[];
	private int numActors;
	private Artist director;
	private String rating;
	
	public Video(String titlein, Artist artin, time timein, Artist[] supactin, int numactin, Artist direcin, String ratin){
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
				output = output + supportingactors[i].getFullName() + ", ";
			}
			else{
				output = output + supportingactors[i].getFullName();
			}
		}
				
		return (super.toString() + "\n"
		+ "Supporting Actors: " + output + "\n"
		+ "Number of Actors: " + numActors + "\n"
		+ "Director: " + director.getFullName() + "\n"
		+ "Rating: " + rating);
	}
	
	public String getRating(){
		return rating;
	}
}
