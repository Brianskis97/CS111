abstract class Audio extends Media{
	private Artist[] groupMembers;
	private int numMembers;
	private Artist producer;
	
	public Audio(String titlein, Artist artin, time timein, Artist[] groupin, int members, Artist producerin){
		super(titlein, artin, timein);
		groupMembers = groupin;
		numMembers = members;
		producer = producerin;
	}
	
	public void playMedia(){
		super.playMedia();
	}
	
	public String toString(){
		String output = "";
		for (int i = 0; i<groupMembers.length; i++){
			if(i < groupMembers.length-1){
				output = output + groupMembers[i].getFullName() + ", ";
			}
			else{
				output = output + groupMembers[i].getFullName();
			}
		}
		
		return(super.toString() + "\n"
		+ "Group Members"+"("+numMembers+"): " + output + "\n"
		+"Producer: " + producer.getFullName());
	}
	
}
