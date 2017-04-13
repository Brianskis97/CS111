import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//C:\Users\Brian\Documents\CS-111\map1.txt

public class fourcolor {

	public static int[][] adj;
	public static int map[];
	public final static int[] colors = { 1, 2, 3, 4 }; // 1=red, 2=blue,
														// 3=green, 4=yellow

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
		

		// for (int i = 0; i<map.length; i++){
		// map[i]=-1;
		// }

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols - 1; j++) {
				adj[i][j] = (int) Integer.parseInt(String.valueOf(linesin[i].charAt(j)));
			}
		}

		fileread.close();
		input.close();
		colormap(0);
		System.out.println("The completed color map (1=red, 2=blue, 3=green, 4=yellow): ");
		for (int i = 0; i < map.length; i++) {
			System.out.print(map[i]);
			System.out.print(" ");
		}

	}//END main

	/**
	 * Fills map according to 4 color problem
	 * 
	 * @param mark marks the section of the image currently being colored
	 * 
	 * @return returns true if it could be filled, false if it could not be
	 */
	
	public static boolean colormap(int mark) {

		
		boolean flag = true;
		boolean flf = true;
		int c = 0;

		if (isdone() || mark >= map.length) {

			return true;

		}

		while (flag) {
			flag = false;
			while (flf) {
				if (islegalcolor(mark, colors[c])) {
					
					map[mark] = colors[c];
					flf = false;
				} else if (c < 3) {
					c = c + 1;
				} else {
					flf = false;
					return false;
				}

			}

			flag = !colormap(mark + 1);
		}

		return true;

	}// END colormap

	/**
	 * Checks if the color can be placed on a certain spot
	 * 
	 * @param pos marks position which is currently being compared
	 * @param color the color which is being tested
	 * @return true if the color can be placed, otherwise false
	 */
	
	public static boolean islegalcolor(int pos, int color) {

		boolean flag = true;

		for (int i = 0; i < adj[0].length; i++) {

			if (adj[pos][i] == 1) {
				if (map[i] == color) {
					
					flag = false;
				}
			}
		} // END for i
		return flag;

	}// END islegal

	/**
	 * 	Checks if colormap has filled the entire map
	 * @return true if the map is full, otherwise false
	 */
	
	public static boolean isdone() {
		for (int i = 0; i < map.length; i++) {
			if (map[i] == 0) {
				return false;
			}
		}
		return true;
	}// END isdone

}// END CLASS
