abstract class Audio extends Media{
	private Artist[] groupMembers;
	private int numMembers;
	private Artist producer;
	
	public Audio(String titlein, Artist artin, double timein, Artist[] groupin, int members, Artist producerin){
		super(titlein, artin, timein);
		groupMembers = groupin;
		numMembers = members;
		producer = producerin;
	}
}
