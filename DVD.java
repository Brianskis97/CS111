public class DVD extends Video{
	private String[] speciaFeatures;
	private int numFeatures;
	private boolean wideScreenFormat;
	private boolean TVFormat;
	private String[] soundOptions;
	private int numSoundOptions;
	
	
	// Input: String Title, Artist artist, double Playtime, String[] supporting actors, int number of supporting actors, 
	// String director, String rating, String[] SpecialFeatures, int number of special features,
	// boolean is there widescren, boolean is there tv format, String[] soundOptions, int number of sound options
	public DVD(String titlein, Artist artin, double timein, String[] supactin, int numactin, String direcin, String ratin
	 , String[] specialin, int featuresin, boolean wideScreenFormatin, boolean TVFormatin,
	 String[] soundOptionsin,  int numSoundOptionsin){
		 super(titlein, artin, timein, supactin, numactin, direcin, ratin);
		 speciaFeatures = specialin;
		 numFeatures = featuresin;
		 wideScreenFormat = wideScreenFormatin;
		 TVFormat = TVFormatin;
		 soundOptions = soundOptionsin;
		 numSoundOptions  = numSoundOptionsin;
	 }
	 
	 public void playMedia(){
		 super.playMedia();
	 }
	 
	 public String toString(){
		 String features = "";
		 String sound = "";
		 for (int i = 0; i<speciaFeatures.length; i++){
			 if(i<speciaFeatures.length-1){
				 features = features + speciaFeatures[i] + ", ";
			 }
			 else{
				 features = features + speciaFeatures[i];
			 }
		 }
		 
		 for (int i = 0; i<soundOptions.length; i++){
			 if(i<soundOptions.length-1){
				 sound = sound + soundOptions[i] + ", ";
			 }
			 else{
				 sound = sound + soundOptions[i];
			 }
		 }
		 
		 return(super.toString() + "\n"
		 + "Special Features" + "(" + numFeatures + "): " + features + "\n"
		 + "Wide Screen: " + wideScreenFormat + "\n"
		 + "TV Format: " + TVFormat + "\n"
		 + "Sound Options" + "(" + numSoundOptions + "): " + sound );
	 }
}
