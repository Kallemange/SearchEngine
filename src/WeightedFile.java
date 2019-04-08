import java.io.File;

/*
 * WeightedFile(int, File)
 * 		IN: File weight, File name
 * print()
 * 		OUT: print(name+ val)
 * getValue()
 * 		OUT: return weight
 */
public class WeightedFile {
	int _val;
	File _name;
		
		public WeightedFile(int val, File name) {
			_val=val;
			_name=name;
		}
		
		public void print() {
			System.out.print(_name.getName()+": "+_val);
		}
	
		public int getValue() {
			return _val;
		}
}
