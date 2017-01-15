import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class BadWords {
	public ArrayList<String> badList(){
		ArrayList<String> badwords = new ArrayList<String>();
		int i = 0;
		try{
			File bad = new File("C:\\Users\\Robert\\workspace\\Nicealizer\\src\\badwords.txt");
			Scanner in = new Scanner(bad).useDelimiter(":|1|,");
			while(in.hasNext()){
				badwords.add(in.nextLine());
				i++;
			}
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		return badwords;
	}
}
