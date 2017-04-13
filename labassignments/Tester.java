import java.util.ArrayList;
public class Tester{
	public static void main(String[] args){
		Artist TARS = new Artist("T.A.R.S.", "", new Date(4,4,2200));
		Artist CASE = new Artist("C.A.S.E.", "", new Date(4,4,2200));
		Artist[] testname = {TARS, CASE};
		String[] features = {"features"};
		String[] sound = {"Sound"};
		Artist test = new Artist("Sweeney", "Brian", new Date(27,5,1997));
		//System.out.println(test.toString());
		String[] test2 = {"hello", "my", "name", "is", "brian"};		
		Artist Mat = new Artist("McConaughey", "Matthew", new Date(4,11,1969));
		DVD interstellar = new DVD("Interstellar", Mat, new time(2, 31, 0), testname, 2, test, "PG-13", features, 1, true, false, sound, 1);
		Artist eagles = new Artist("The Eagles", "", new Date(0,0,1971));
		String[] tracks = {"Hotel California", "Life in the Fast Lane"};
		
		System.out.println(interstellar.toString());
		interstellar.playMedia();
		System.out.println("---------------------------------------------------------");
		System.out.println(interstellar.toString());
		ArrayList<Media> testing = new ArrayList<Media>();
		System.out.println("---------------------------------------------------------");
		testing.add(interstellar);
		System.out.println(testing.get(0).toString());
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		CD california = new CD("Hotel California", eagles, new time(0, 45, 32), testname, 2, test, tracks, tracks.length);
		System.out.println(california.toString());
		
	}
}
