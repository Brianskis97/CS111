import java.util.Scanner;
import java.util.ArrayList;

public class MediaApp {

	private static ArrayList<Video> videos = new ArrayList<Video>();
	private static ArrayList<Audio> music = new ArrayList<Audio>();
	private static ArrayList<Artist> artists = new ArrayList<Artist>();
	private static ArrayList<Artist> Bands = new ArrayList<Artist>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		CD test = createCD();
		music.add(test);
		System.out.flush();
		System.out.println("---------------------------------------------------------");
		System.out.println(music.get(0).toString());

	}
	
	public static DVD createDVD(){
		Scanner dvdinput = new Scanner(System.in);
		String in;
		String lastin;
		int hour;
		int minute;
		int second;
		time runtime;
		String title;
		Artist actor = null;
		Artist director = null;
		int nummembers;
		Artist[] members;
		boolean flag;
		String thandle;
		String url;
		String rating;
		
		System.out.println("Please enter the title: ");
		title = dvdinput.nextLine();
		System.out.println("---------------------------------------------------------");
		System.out.println("Please Enter the Main Actor: ");
		flag = true;
			while (flag) {
			System.out.println("Would you like to add and existing artist [e] or a new artist [n]: ");
			in = dvdinput.nextLine();
			
				if (in.equals("E") || in.equals("e")) {
					String artistlist = "";
					for (int i = 0; i < artists.size(); i++) {
						artistlist = artistlist + (i + 1) + ": "+ artists.get(i).getFullName() + "\n";
					}
					System.out.println("Please input the number of your selection: ");
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					actor = artists.get(sel);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artists' Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthday: ");
					int birthday = dvdinput.nextInt();
					dvdinput.nextLine();

					
					boolean flag2 = true;
					while (flag2) {
						System.out.println("Does the artist have Social Media? [y/n]: ");
						String social = dvdinput.nextLine();
						if (social.equals("y") || social.equals("Y")|| social.equals("yes") || social.equals("Yes")) {
							System.out.println("Please enter the artist's twitter handle: ");
							thandle = dvdinput.nextLine();
							System.out.println("Please enter the artist's URL: ");
							url = dvdinput.nextLine();
							actor = new Artist(lastin, in, new Date(birthday,birthmonth, birthyear), thandle, url);
							flag2 = false;
						} 
						else if(social.equals("n") || social.equals("N") || social.equals("no") || social.equals("No")){
							actor = new Artist(lastin, in, new Date(birthday, birthmonth, birthyear));
							flag2 = false;
						}
						else{
							System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
						}
						
					}
					artists.add(actor);
					flag = false;
				} else {
					System.out.println("Invalid choice, please use E or e for existing and N, n for new.");
				}
			}
			
			
			
			
		System.out.println("---------------------------------------------------------");	
		System.out.println("Please enter the number of Supporting Actors: ");
		nummembers = dvdinput.nextInt();
		dvdinput.nextLine();
		members = new Artist[nummembers];

		for (int k = 0; k < nummembers; k++) {
			flag = true;
			while (flag) {
			System.out.println("Would you like to add and existing artist [e] or a new artist [n]: ");
			in = dvdinput.nextLine();
			
				if (in.equals("E") || in.equals("e")) {
					String artistlist = "";
					for (int i = 0; i < artists.size(); i++) {
						artistlist = artistlist + (i + 1) + ": "+ artists.get(i).getFullName() + "\n";
					}
					System.out.println("Please input the number of your selection: ");
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					members[k - 1] = artists.get(sel);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artists' Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthday: ");
					int birthday = dvdinput.nextInt();
					dvdinput.nextLine();

					
					boolean flag2 = true;
					while (flag2) {
						System.out.println("Does the artist have Social Media? [y/n]: ");
						String social = dvdinput.nextLine();
						if (social.equals("y") || social.equals("Y")|| social.equals("yes") || social.equals("Yes")) {
							System.out.println("Please enter the artist's twitter handle: ");
							thandle = dvdinput.nextLine();
							System.out.println("Please enter the artist's URL: ");
							url = dvdinput.nextLine();
							actor = new Artist(lastin, in, new Date(birthday,birthmonth, birthyear), thandle, url);
							flag2 = false;
						} 
						else if(social.equals("n") || social.equals("N") || social.equals("no") || social.equals("No")){
							actor = new Artist(lastin, in, new Date(birthday, birthmonth, birthyear));
							flag2 = false;
						}
						else{
							System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
						}
						
					}
					artists.add(actor);
					members[k] = actor;
					flag = false;
				} else {
					System.out.println("Invalid choice, please use E or e for existing and N, n for new.");
				}
			}

		}
		
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Please enter the runtime hours: ");
		hour = dvdinput.nextInt();
		dvdinput.nextLine();
		System.out.println("Please enter the runtime minutes: ");
		minute = dvdinput.nextInt();
		dvdinput.nextLine();
		System.out.println("Please enter the runtime seconds: ");
		second = dvdinput.nextInt();
		dvdinput.nextLine();
		runtime = new time(hour, minute, second);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Please enter the director: ");
		flag = true;
			while (flag) {
			System.out.println("Would you like to add and existing artist [e] or a new artist [n]: ");
			in = dvdinput.nextLine();
			
				if (in.equals("E") || in.equals("e")) {
					String artistlist = "";
					for (int i = 0; i < artists.size(); i++) {
						artistlist = artistlist + (i + 1) + ": "+ artists.get(i).getFullName() + "\n";
					}
					System.out.println("Please input the number of your selection: ");
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					director = artists.get(sel);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artists' Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artists' Birthday: ");
					int birthday = dvdinput.nextInt();
					dvdinput.nextLine();

					
					boolean flag2 = true;
					while (flag2) {
						System.out.println("Does the artist have Social Media? [y/n]: ");
						String social = dvdinput.nextLine();
						if (social.equals("y") || social.equals("Y")|| social.equals("yes") || social.equals("Yes")) {
							System.out.println("Please enter the artist's twitter handle: ");
							thandle = dvdinput.nextLine();
							System.out.println("Please enter the artist's URL: ");
							url = dvdinput.nextLine();
							director = new Artist(lastin, in, new Date(birthday,birthmonth, birthyear), thandle, url);
							flag2 = false;
						} 
						else if(social.equals("n") || social.equals("N") || social.equals("no") || social.equals("No")){
							director = new Artist(lastin, in, new Date(birthday, birthmonth, birthyear));
							flag2 = false;
						}
						else{
							System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
						}
						
					}
					artists.add(director);
					flag = false;
				} else {
					System.out.println("Invalid choice, please use E or e for existing and N, n for new.");
				}
			}
			System.out.println("---------------------------------------------------------");
			System.out.println("Please enter the movies rating: ");
			rating = dvdinput.nextLine();
		
	}
	
	

	public static CD createCD() {
		String in = "";
		String title;
		int numtracks;
		String thandle;
		time runtime;
		String url;
		String[] tracks;
		Scanner cdinput = new Scanner(System.in);
		int swin;
		int year;
		Artist member=null;
		Artist[] members;
		Artist producer = null;
		int nummembers;
		boolean flag = true;
		int hour;
		int minute;
		int second;

		System.out.println("Please enter the Album Title: ");
		title = cdinput.nextLine();

		Artist band = makeBand();

		System.out.println("---------------------------------------------------------");
		System.out.println("Please enter the runtime hours: ");
		hour = cdinput.nextInt();
		cdinput.nextLine();
		System.out.println("Please enter the runtime minutes: ");
		minute = cdinput.nextInt();
		cdinput.nextLine();
		System.out.println("Please enter the runtime seconds: ");
		second = cdinput.nextInt();
		cdinput.nextLine();
		runtime = new time(hour, minute, second);

		System.out.println("---------------------------------------------------------");

		System.out.println("Please enter the number of band members: ");
		nummembers = cdinput.nextInt();
		cdinput.nextLine();
		members = new Artist[nummembers];

		for (int k = 0; k < nummembers; k++) {
			flag = true;
			while (flag) {
			System.out.println("Would you like to add and existing artist [e] or a new artist [n]: ");
			in = cdinput.nextLine();
			
				if (in.equals("E") || in.equals("e")) {
					String artistlist = "";
					for (int i = 0; i < artists.size(); i++) {
						artistlist = artistlist + (i + 1) + ": "+ artists.get(i).getFullName() + "\n";
					}
					System.out.println("Please input the number of your selection: ");
					int sel = cdinput.nextInt();
					cdinput.nextLine();
					members[k - 1] = artists.get(sel);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					String lastin = "";
					System.out.println("Please input First Name: ");
					in = cdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = cdinput.nextLine();
					System.out.println("Please input artists' Birthyear: ");
					int birthyear = cdinput.nextInt();
					cdinput.nextLine();
					System.out.println("Please input artists' Birthmonth: ");
					int birthmonth = cdinput.nextInt();
					cdinput.nextLine();
					System.out.println("Please input artists' Birthday: ");
					int birthday = cdinput.nextInt();
					cdinput.nextLine();

					
					boolean flag2 = true;
					while (flag2) {
						System.out.println("Does the artist have Social Media? [y/n]: ");
						String social = cdinput.nextLine();
						if (social.equals("y") || social.equals("Y")|| social.equals("yes") || social.equals("Yes")) {
							System.out.println("Please enter the artist's twitter handle: ");
							thandle = cdinput.nextLine();
							System.out.println("Please enter the artist's URL: ");
							url = cdinput.nextLine();
							member = new Artist(lastin, in, new Date(birthday,birthmonth, birthyear), thandle, url);
							flag2 = false;
						} 
						else if(social.equals("n") || social.equals("N") || social.equals("no") || social.equals("No")){
							member = new Artist(lastin, in, new Date(birthday, birthmonth, birthyear));
							flag2 = false;
						}
						else{
							System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
						}
						
					}
					artists.add(member);
					members[k] = member;
					flag = false;
				} else {
					System.out.println("Invalid choice, please use E or e for existing and N, n for new.");
				}
			}

		}

		System.out.println("---------------------------------------------------------");

		System.out.println("Would you like to add and existing artist [e] or a new artist [n](Producer): ");
		in = cdinput.nextLine();

		if (in.equals("E") || in.equals("e")) {
			String artistlist = "";
			for (int i = 0; i < artists.size(); i++) {
				artistlist = artistlist + (i + 1) + ": "
						+ artists.get(i).getFullName() + "\n";
			}
			System.out.println(artistlist);
			System.out.println("Please input the number of your selection: ");
			int sel = cdinput.nextInt();
			cdinput.nextLine();
			producer = artists.get(sel - 1);
			flag = false;
		} else if (in.equals("n") || in.equals("N")) {
			String lastin = "";
			System.out.println("Please input First Name: ");
			in = cdinput.nextLine();
			System.out.println("Please input Last Name: ");
			lastin = cdinput.nextLine();
			System.out.println("Please input artists' Birthyear: ");
			int birthyear = cdinput.nextInt();
			cdinput.nextLine();
			System.out.println("Please input artists' Birthmonth: ");
			int birthmonth = cdinput.nextInt();
			cdinput.nextLine();
			System.out.println("Please input artists' Birthday: ");
			int birthday = cdinput.nextInt();
			cdinput.nextLine();
			System.out.println("Does the artist have Social Media? [y/n]: ");
			String social = cdinput.nextLine();
			if (social.equals("y") || social.equals("Y")
					|| social.equals("yes") || social.equals("Yes")) {
				System.out
						.println("Please enter the artist's twitter handle: ");
				thandle = cdinput.nextLine();
				System.out.println("Please enter the artist's URL: ");
				url = cdinput.nextLine();
				producer = new Artist(in, lastin, new Date(birthday,
						birthmonth, birthyear), thandle, url);
			} else {
				producer = new Artist(in, lastin, new Date(birthday,
						birthmonth, birthyear));
			}
		}

		System.out.println("Please enter the number of tracks: ");
		numtracks = cdinput.nextInt();
		cdinput.nextLine();
		tracks = new String[numtracks];

		for (int i = 0; i < numtracks; i++) {
			System.out.println("Please enter the track name" + "[" + (i + 1)
					+ "]: ");
			tracks[i] = cdinput.nextLine();
		}

		return new CD(title, band, runtime, members, nummembers, producer,
				tracks, numtracks);

	}

	private static Artist makeBand() {
		String bandlist = "Bands: \n";
		String in = "";
		Artist band = null;
		boolean flag = true;
		int year;
		Scanner cdinput = new Scanner(System.in);
		int swin;

		while (flag) {
			System.out
					.println("Would you like to use an existing Band?[y/n]: ");
			in = cdinput.nextLine();
			if (in.equals("y") || in.equals("Y") || in.equals("yes")
					|| in.equals("Yes")) {
				for (int i = 0; i < Bands.size(); i++) {
					bandlist = bandlist + (i + 1) + ": "
							+ Bands.get(i).getFullName() + "\n";
				}
				System.out
						.println("Please input the number of your selection: ");
				swin = cdinput.nextInt();
				cdinput.nextLine();
				band = Bands.get(swin);
				flag = false;
			} else if (in.equals("n") || in.equals("N") || in.equals("no")|| in.equals("No")) {
				System.out.println("Please input Band Name: ");
				in = cdinput.nextLine();
				System.out.println("Please input the year formed: ");
				year = cdinput.nextInt();
				cdinput.nextLine();
				band = new Artist(in, "", new Date(0, 0, year));
				Bands.add(band);
				flag = false;
			} else {
				System.out
						.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
			}
		}

		return band;

	}

}
