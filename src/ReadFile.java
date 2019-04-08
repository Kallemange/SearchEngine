import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Read File()
 * Methods:
 * (private) wordCount(String[], String) 
 * 		IN: String of words to search. Searchword 
 * 		OUT: occurrences of word
 * 		Searches String[] for String 
 * listOfFiles(String) 
 * 		IN: path to files. 
 * 		OUT: File[]
 * 		Creates File[] containing all files to search
 * readFile(File[], String)
 * 		IN: File[] to be searched, String to search for
 * 		OUT: int Occurences of word in document
 * 		Counts occurences of searchword in file
 */
public class ReadFile {
	
	private int wordCount(String[] line, String sw) {
		int occurences=0;
		
		for (String word:line) {
			if (word.equals(sw)) {
				++occurences;
			}
		}
		return occurences;
	}
	
	public File[] listOfFiles(String path) {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		{
			System.out.print("Files in folder: ");
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.print(file.getName()+ ", ");
		    
		    }
		}
		System.out.print("\n");
		}
		return listOfFiles;
	}
	
	public int[] readFile(File[] fileList, String word) {
		BufferedReader br = null;
		FileReader fr = null;
		int[] listOfOcc = new int[fileList.length];
		int counter	= 0;
		
		for (File file:fileList) {
			int totalNo=0;
			
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				totalNo+=(wordCount(sCurrentLine.split(" "), word));
			}
			listOfOcc[counter]=totalNo;
			counter++;

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
}
		
	}
	return listOfOcc;
	
}
}