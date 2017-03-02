public class Band{
	
	private String name;
	private Artist[] members;
	private Date yearformed;
	
	public Band(String namein, Artist[] membersin, int yearin){
	
		name = namein;
		members = membersin;
		yearformed = new Date(0,0,yearin);
		
	}
	
	public Artist[] getMembers(){
		return members;
	}
	
	public String getName(){
		return name;
	}
	
	public int getYearFormed(){
		return yearformed.getYear();
	}
	
	public String toString(){
		
		String output = "";
		
		for (int i = 0; i<members.length; i++){
			if(i < members.length-1){
				output = output + members[i].getFullName() + "\n";
			}
			else{
				output = output + members[i].getFullName();
			}
		}
		
		
		return( "Band Name: " + name + "\n"
		+ "Band Members: " + "\n" + output + "\n"
		+ "Year Formed: " + yearformed.getYear());
	}
	 
	
}
