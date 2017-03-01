import java.util.ArrayList;
public class Tester{
	public static void main(String[] args){
		String[] testname = {"TARS", "CASE"};
		String[] features = {"features"};
		String[] sound = {"Sound"};
		Artist test = new Artist("Sweeney", "Brian", new Date(27,5,1997));
		//System.out.println(test.toString());
		String[] test2 = {"hello", "my", "name", "is", "brian"};		
		Artist Mat = new Artist("McConaughey", "Matthew", new Date(4,11,1969));
		DVD interstellar = new DVD("Interstellar", Mat, 2.82, testname, 2, "Person", "PG-13", features, 1, true, false, sound, 1);
		System.out.println(interstellar.toString());
		interstellar.playMedia();
		System.out.println("---------------------------------------------------------");
		System.out.println(interstellar.toString());
		ArrayList<Media> testing = new ArrayList<Media>();
		System.out.println("---------------------------------------------------------");
		testing.add(interstellar);
		System.out.println(testing.get(0).toString());
	}
}
