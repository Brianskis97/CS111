import java.util.Scanner;
import java.util.ArrayList;

public class MediaApp {

	private static ArrayList<Video> videos = new ArrayList<Video>();
	private static ArrayList<Audio> music = new ArrayList<Audio>();
	private static ArrayList<Artist> artists = new ArrayList<Artist>();
	private static ArrayList<Artist> Bands = new ArrayList<Artist>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		int choice;
		while (running){
			System.out.println("1. Create CD" + "\n"
			+ "2. Create DVD" + "\n"
			+ "3. List all media" + "\n"
			+ "4. List info on specific media" + "\n"
			+ "5. Play Media" + "\n"
			+ "6. View number of plays for specific media" + "\n"
			+ "7. View major artist details for specific media" + "\n"
			+ "8. Quit");
			
			System.out.println("What would you like to do?(enter the number of your choice): ");
			choice = input.nextInt();
			input.nextLine();
			switch (choice){
				case 1: createCD();
						break;
				case 2: createDVD();
						break;
				case 3: System.out.println(listAll());
						System.out.println("---------------------------------------------------------");
						break;
				case 4: System.out.println(getData());
						System.out.println("---------------------------------------------------------");
						break;
				case 5: playMedia();
						break;
				case 6: listPlays();
						break;
				case 7: artistDetails();
						break;
				case 8: running = false;
						break;
				case 42: System.out.println("The answer to life, the universe and everything in it!");
							break;
				default: System.out.println("Only options from the list please");
			}
			
			System.out.println("---------------------------------------------------------");			
			
		}				
	}
	
	public static void artistDetails(){
		Scanner input = new Scanner(System.in);
		String choice = "";
		
		int num;
		boolean flag = true;
		while (flag){
			System.out.println("Do you want to view major artist details for a video(v) or music(m)?: ");
			choice = input.nextLine();
			if((choice.equals("v") || choice.equals("V") || choice.equals("Video") || choice.equals("video"))&&videos.size()>0){
				System.out.println(listDVD());
				System.out.println("Which dvd do you view major artist of? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				System.out.println(videos.get(num).getMajorArtist());
				flag = false;
			}
			else if((choice.equals("m") || choice.equals("M") || choice.equals("music") || choice.equals("Music"))&&music.size()>0)
			{
				System.out.println(listCD());
				System.out.println("Which CD do you want view major artist of? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				System.out.println(music.get(num).getMajorArtist());
				flag = false;
			}
			else{
				System.out.println("Invalid Input!");
				if(music.size()>0 && videos.size() <= 0){
					System.out.println("You don't have any videos!");
				}
				if(music.size()<=0 && videos.size() > 0){
					System.out.println("You don't have any music!");
				}
			}
			
			if(music.size()<=0 && videos.size() <= 0){
				System.out.println("You don't have anything!");
				flag = false;
			}
		}
	}
	
	public static void listPlays(){
		Scanner input = new Scanner(System.in);
		String choice = "";
		
		int num;
		boolean flag = true;
		while (flag){
			System.out.println("Do you want to view number of plays for a video(v) or music(m)?: ");
			choice = input.nextLine();
			if((choice.equals("v") || choice.equals("V") || choice.equals("Video") || choice.equals("video"))&&videos.size()>0){
				System.out.println(listDVD());
				System.out.println("Which dvd do you view number of views? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				System.out.println(videos.get(num).getNumPlays());
				flag = false;
			}
			else if((choice.equals("m") || choice.equals("M") || choice.equals("music") || choice.equals("Music"))&&music.size()>0)
			{
				System.out.println(listCD());
				System.out.println("Which CD do you want view number of plays? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				System.out.println(music.get(num).getNumPlays());
				flag = false;
			}
			else{
				System.out.println("Invalid Input!");
				if(music.size()>0 && videos.size() <= 0){
					System.out.println("You don't have any videos!");
				}
				if(music.size()<=0 && videos.size() > 0){
					System.out.println("You don't have any music!");
				}
			}
			
			if(music.size()<=0 && videos.size() <= 0){
				System.out.println("You don't have anything!");
				flag = false;
			}
		}
	}
	
	public static void playMedia(){
		Scanner input = new Scanner(System.in);
		String choice = "";
		
		int num;
		boolean flag = true;
		while (flag){
			System.out.println("Do you want to play a video(v) or music(m)?: ");
			choice = input.nextLine();
			System.out.println("---------------------------------------------------------");
			if((choice.equals("v") || choice.equals("V") || choice.equals("Video") || choice.equals("video"))&&videos.size()>0){
				System.out.println(listDVD());
				System.out.println("Which dvd do you want to play? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				videos.get(num).playMedia();
				flag = false;
			}
			else if((choice.equals("m") || choice.equals("M") || choice.equals("music") || choice.equals("Music"))&&music.size()>0)
			{
				System.out.println(listCD());
				System.out.println("Which CD do you want to play? (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				music.get(num).playMedia();
				flag = false;
			}
			else{
				System.out.println("Invalid Input!");
				if(music.size()>0 && videos.size() <= 0){
					System.out.println("You don't have any videos!");
				}
				if(music.size()<=0 && videos.size() > 0){
					System.out.println("You don't have any music!");
				}
			}
			
			if(music.size()<=0 && videos.size() <= 0){
				System.out.println("You don't have anything!");
				flag = false;
			}
		}
		
				
		
	}
	
	public static String getData(){
		Scanner input = new Scanner(System.in);
		String choice = "";
		
		int num;
		boolean flag = true;
		String output = "";
		while (flag){
			System.out.println("Do you want to view details on a video(v) or music(m)?: ");
			choice = input.nextLine();
			System.out.println("---------------------------------------------------------");
			if((choice.equals("v") || choice.equals("V") || choice.equals("Video") || choice.equals("video"))&&videos.size()>0){
				System.out.println(listDVD());
				System.out.println("Which dvd do you want info on (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				output = videos.get(num).toString();
				flag = false;
			}
			else if((choice.equals("m") || choice.equals("M") || choice.equals("music") || choice.equals("Music"))&&music.size()>0)
			{
				System.out.println(listCD());
				System.out.println("Which CD do you want info on (input number of choice): ");
				num= input.nextInt();
				System.out.println("---------------------------------------------------------");
				input.nextLine();
				output = music.get(num).toString();
				flag = false;
			}
			else{
				System.out.println("Invalid Input!");
				if(music.size()>0 && videos.size() <= 0){
				System.out.println("You don't have any videos!");
				}
				if(music.size()<=0 && videos.size() > 0){
					System.out.println("You don't have any music!");
				}
			}
			
			if(music.size()<=0 && videos.size() <= 0){
				System.out.println("You don't have anything!");
				flag = false;
			}
		}
		
		return output;
				
	}
	
	public static String listAll(){
		String collection = "";
		for (int i = 0; i < videos.size(); i++){
			collection = collection + i + ": " + videos.get(i).getTitle() + "\n";
		}
		for (int i = videos.size(); i < music.size()+videos.size(); i++){
			collection =collection + i + ": " + music.get(i-videos.size()).getTitle() + "\n";
		}
		return collection;		
	}
	
	public static String listDVD(){
		String collection = "";
		for (int i = 0; i < videos.size(); i++){
			collection = collection + i + ": " + videos.get(i).getTitle() + "\n";
		}
		return collection;
	}
	
	public static String listCD(){
		String collection = "";
		for (int i = 0; i < music.size(); i++){
			collection =collection + i + ": " + music.get(i).getTitle() + "\n";
		}
		return collection;
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
		boolean wide= false;
		boolean TV= false;
		boolean flag;
		String thandle;
		String url;
		String rating;
		int numsound;
		String[]sound = {};
		String[] special = {};
		
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
					System.out.println(artistlist);
					System.out.println("Please input the number of your selection: ");
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					actor = artists.get(sel-1);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artist's Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthday: ");
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
					System.out.println(artistlist);
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					members[k] = artists.get(sel-1);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artist's Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthday: ");
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
							members[k] = new Artist(lastin, in, new Date(birthday,birthmonth, birthyear), thandle, url);
							flag2 = false;
						} 
						else if(social.equals("n") || social.equals("N") || social.equals("no") || social.equals("No")){
							members[k] = new Artist(lastin, in, new Date(birthday, birthmonth, birthyear));
							flag2 = false;
						}
						else{
							System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
						}
						
					}
					artists.add(members[k]);
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
					System.out.println(artistlist);
					int sel = dvdinput.nextInt();
					dvdinput.nextLine();
					director = artists.get(sel-1);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					lastin = "";
					System.out.println("Please input First Name: ");
					in = dvdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = dvdinput.nextLine();
					System.out.println("Please input artist's Birthyear: ");
					int birthyear = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthmonth: ");
					int birthmonth = dvdinput.nextInt();
					dvdinput.nextLine();
					System.out.println("Please input artist's Birthday: ");
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
			System.out.println("---------------------------------------------------------");
			System.out.println("How many Special features are there?: ");
			int features = dvdinput.nextInt();
			dvdinput.nextLine();
			special = new String[features];
			if(features >0){
				for(int i = 0; i<features; i++){
					System.out.println("Please enter feature " + i + ": ");
					special[i] = dvdinput.nextLine();
				}
			}
			
			System.out.println("---------------------------------------------------------");
			
			
			flag = true;
			while(flag){
				System.out.println("Does the DVD support widescreen?[y/n]: ");
				String yesno = dvdinput.nextLine();
				if (yesno.equals("y") || yesno.equals("Y") || yesno.equals("yes")|| yesno.equals("Yes")){
					wide = true;
					flag = false;
				}
				else if(yesno.equals("n") || yesno.equals("Y") || yesno.equals("no")|| yesno.equals("No")){
					wide = false;
					flag = false;
				}
				else{
					System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
				}
			}
			
			System.out.println("---------------------------------------------------------");
			
			
			flag = true;
			while(flag){
				System.out.println("Does the DVD support TV format?[y/n]: ");
				String yesno = dvdinput.nextLine();
				if (yesno.equals("y") || yesno.equals("Y") || yesno.equals("yes")|| yesno.equals("Yes")){
					TV = true;
					flag = false;
				}
				else if(yesno.equals("n") || yesno.equals("Y") || yesno.equals("no")|| yesno.equals("No")){
					TV = false;
					flag = false;
				}
				else{
					System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
				}
			}
			
			System.out.println("---------------------------------------------------------");
			
			System.out.println("How many Sound Options are there?: ");
			numsound = dvdinput.nextInt();
			dvdinput.nextLine();
			sound = new String[numsound];
			if(numsound>0){
				for(int i = 0; i<features; i++){
					System.out.println("Please enter option " + i + ": ");
					sound[i] = dvdinput.nextLine();
				}
			}
			
			System.out.println("---------------------------------------------------------");
			
			DVD output = new DVD(title, actor, runtime, members, nummembers, director, rating, special, features, wide, TV, sound, numsound);
			videos.add(output);
			
			return output;
			
		
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
		System.out.println("Please enter the runtime hours(int): ");
		hour = cdinput.nextInt();
		cdinput.nextLine();
		System.out.println("Please enter the runtime minutes(int): ");
		minute = cdinput.nextInt();
		cdinput.nextLine();
		System.out.println("Please enter the runtime seconds(int): ");
		second = cdinput.nextInt();
		cdinput.nextLine();
		runtime = new time(hour, minute, second);

		System.out.println("---------------------------------------------------------");

		System.out.println("Please enter the number of band members: ");
		nummembers = cdinput.nextInt();
		cdinput.nextLine();
		members = new Artist[nummembers];
		
		System.out.println("Please enter the band members: ");

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
					System.out.println(artistlist);
					System.out.println("Please input the number of your selection: ");
					int sel = cdinput.nextInt();
					cdinput.nextLine();
					members[k] = artists.get(sel-1);
					flag = false;
				} else if (in.equals("n") || in.equals("N")) {
					String lastin = "";
					System.out.println("Please input First Name: ");
					in = cdinput.nextLine();
					System.out.println("Please input Last Name: ");
					lastin = cdinput.nextLine();
					System.out.println("Please input artist's Birthyear: ");
					int birthyear = cdinput.nextInt();
					cdinput.nextLine();
					System.out.println("Please input artist's Birthmonth: ");
					int birthmonth = cdinput.nextInt();
					cdinput.nextLine();
					System.out.println("Please input artist's Birthday: ");
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
			System.out.println("---------------------------------------------------------");
		}


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
			System.out.println("Please input artist's Birthyear: ");
			int birthyear = cdinput.nextInt();
			cdinput.nextLine();
			System.out.println("Please input artist's Birthmonth: ");
			int birthmonth = cdinput.nextInt();
			cdinput.nextLine();
			System.out.println("Please input artist's Birthday: ");
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
				producer = new Artist(in, lastin, new Date(birthday,birthmonth, birthyear), thandle, url);
			} else {
				producer = new Artist(in, lastin, new Date(birthday,birthmonth, birthyear));
			}
			artists.add(producer);
		}
		System.out.println("---------------------------------------------------------");

		System.out.println("Please enter the number of tracks: ");
		numtracks = cdinput.nextInt();
		cdinput.nextLine();
		tracks = new String[numtracks];
		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < numtracks; i++) {
			System.out.println("Please enter the track name" + "[" + (i + 1)
					+ "]: ");
			tracks[i] = cdinput.nextLine();
			System.out.println("---------------------------------------------------------");
		}
		CD output = new CD(title, band, runtime, members, nummembers, producer, tracks, numtracks);
		music.add(output);
		return output;

	}

	private static Artist makeBand() {
		String bandlist = "Bands: \n";
		String in = "";
		Artist band = null;
		boolean flag = true;
		int year;
		Scanner cdinput = new Scanner(System.in);
		int swin;
		System.out.println("---------------------------------------------------------");
		while (flag) {
			System.out
					.println("Would you like to use an existing Band?[y/n]: ");
			in = cdinput.nextLine();
			if (in.equals("y") || in.equals("Y") || in.equals("yes")|| in.equals("Yes")) {
				for (int i = 0; i < Bands.size(); i++) {
					bandlist = bandlist + (i + 1) + ": "+ Bands.get(i).getFullName() + "\n";
				}
				System.out.println("Please input the number of your selection: ");
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
				System.out.println("Invalid choice, please use Y,y,Yes or yes for yes and N, n , No, or no for no.");
			}
			System.out.println("---------------------------------------------------------");
		}

		return band;

	}

}
