import java.io.File;
import java.util.Arrays;

/*
 * List of WeightedFile( int[], File[])
 * printList() 
 * 		OUT: Prints all elements in list
 * sort() 
 * 		Sorts all elements according to weight 
 */
public class WeightedList {
	WeightedFile[] files;
	
	public WeightedList (int[] weight, File[] name) {
		files = new WeightedFile[weight.length];
		for (int i=0; i<weight.length; i++) {
			files[i]= new WeightedFile(weight[i], name[i]);
		
	}
		
	}
	public void printList() {
		int i=0;
		System.out.print("[");
		for (WeightedFile f: files) {
			i++;
			if (f.getValue()>0) {
				if (i>1) {
					System.out.print(", ");
				}
				f.print();
			}
		
		}
		System.out.print("]\n");
	}
	
	public void sort() {
		Arrays.sort(files, new SortByCost());
	}
	
}