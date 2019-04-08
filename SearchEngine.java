
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

/* 
 * SearchEngine()
 * 		Searches through list of files for search word
 * (private)getWord()
 * 		OUT: String
 * 		Request word from user
 */

public class SearchEngine {
	
	private static String sw = "a";

	public static void main(String[] args) {
//		String sw = getWord();
		System.out.println("Searching for word: " +sw);
		String path			="../SearchEngine/Files";
		ReadFile rf  		= new ReadFile();
		File[] files 		= rf.listOfFiles(path);
		int[] occPerFile 	=rf.readFile(files, sw);
		WeightedList wl 	= new WeightedList(occPerFile, files);
		System.out.print("Unsorted: \t");
		wl.printList();
		wl.sort();
		System.out.print("Sorted: \t");
		wl.printList();
	}

	private static String getWord() {
		System.out.println("Word to search for: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sw = null;
        try {
            sw = reader.readLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		return sw;
	}
}