import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//C:\Users\Brian\Documents\CS-111\map1.txt

public class fourcolor {

	public static int[][] adj;
	public static int map[];
	public final static int[] colors = {1,2,3,4}; // 1=red, 2=blue, 3=green, 4=yellow
	

	public static void main(String[] args) throws FileNotFoundException {
		File adjin;
		Scanner fileread;
		Scanner input = new Scanner(System.in);
		String filepath;
		String[] linesin;
		int rows = 0;
		int cols = 0;

		System.out.println("Please enter the file path: ");
		filepath = input.nextLine();
		adjin = new File(filepath);
		fileread = new Scanner(adjin);

		while (fileread.hasNextLine()) {
			fileread.nextLine();
			rows = rows + 1;
		}
		linesin = new String[rows];
		fileread = new Scanner(adjin);
		for (int i = 0; i < rows; i++) {
			linesin[i] = fileread.nextLine();
		}

		for (int i = 0; i < rows; i++) {
			linesin[i] = linesin[i].replaceAll("\\s", "");
		}

		cols = linesin[0].length();
		adj = new int[rows][cols];
		map = new int[rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols - 1; j++) {
				adj[i][j] = (int) Integer.parseInt(String.valueOf(linesin[i].charAt(j)));
			}
		}

		fileread.close();
		input.close();

	}
	
	public static void colormap(){
		
	}
	
	
}