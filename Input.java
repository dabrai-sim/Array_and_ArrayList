import java.io.*;
import java.util.*;

class Input {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
// array.trim : separate elements based on \\s+ (space) (+) since there can be multiple spaces	
	public double[] arr(int size) throws IOException {
		double[] inputArray = new double[size];
		String array = br.readLine();
		// + : one or more spaces 
// * : In RegEx: * : zero or more, + : one or more // need one or more spaces
// saving of datatype: string
		String[] input = array.trim().split("\\s+");
		// Transferring to input array // parsing string to double : Double.parseDouble(input[i]);
		for(int i = 0;i < size; i++) {
			// parsing and putting into Double
			inputArray[i] = Double.parseDouble(input[i]);
		}
		return inputArray;
	}
}