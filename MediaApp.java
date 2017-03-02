import java.util.Scanner;
import java.util.ArrayList;

public class MediaApp{
	
	ArrayList<Video> videos = new ArrayList<Video>();
	ArrayList<Audio> music = new ArrayList<Audio>();
	ArrayList<Artist> Bands = new ArrayList<Artist>();
	ArrayList<Artist> artists = new ArrayList<Artist>();
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		
	}
	
	public CD createCD(){
		String in = "";
		String title;
		int numtracks;
		String[]tracks;
		String bandlist = "Bands: \n";
		Scanner CDinput = new Scanner(System.in);
		int swin;
		int year;
		Artist band;
		Artist members;
		int nummembers;
		boolean flag = true;
		System.out.println("Please enter the Album Title: ")
		title = CDinput.nextLine();
		while(flag){
			System.out.println("Would you like to use an existing Band?(y/n): ");
			in = CDinput.nextLine();
			if(in.equals("y") || in.equals("Y") || in.equals("yes") || in.equals("Yes")){
				for(int i = 0; i<Bands.size(); i++){
						bandlist = bandlist + (i+1) + ": " + Bands.get(i).getFullName() + "\n";
					}
				System.out.println("Please input the number of your selection: ");
				swin = CDinput.nextInt();
				band = Bands.get(swin);
				flag = false;		
			}
			else if(in.equals("n") || in.equals("N") || in.equals("no") || in.equals("No")){
				System.out.println("Please input Band Name: ");
				in = CDinput.nextLine();
				System.out.println("Please input the year formed: ");
				year = CDinput.nextInt();
				band = new Artist( in, "", new Date(0,0,year));
				Bands.add(band);
				flag = false;
			}
			else
			{
				System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
			}
		}
		
		System.out.println("Please enter the number of band members: ");
		nummembmers = CDinput.nextInt();
		members = new Artist[nummembers];
		flag = true;
		
		for(int k = 0; k < nummembers; k++){
			System.out.println("Would you like to add and existing artist (e) or a new artist (n): ");
			in = CDinput.nextLine();
			if(in.equals("E") || in.equals("e")){
				String artistlist = "";
				for(int i = 0; i<artists.size(); i++){
						artistlist = artistlist + (i+1) + ": " + artists.get(i).getFullName() + "\n";
					}
				System.out.println("Please input the number of your selection: ");
				int sel = CDinput.nextInt();
				members[k] = artists.get(sel);
				flag = false;		
			}
			else if(in.equals("n") || in.equals("N")){
				String lastin= ""
				System.out.println("Please input First Name: ");
				in = CDinput.nextLine();
				System.out.println("Please input the year formed: ");
				year = CDinput.nextInt();
				band = new Artist( in, "", new Date(0,0,year));
				Bands.add(band);
				flag = false;
			}
			else
			{
				System.out.println("Invalid choice, please use E or e for existing and N, n for new.");
			}
		}
		
	}
	
				
				
			
		
		
}
