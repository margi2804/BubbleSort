package bubbleSort;
import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String args[]) {

	    // create an array
	    int[] data = { -8, 77, 18, -13, -9 };

	    // create an object of Main class
	    mainFunction bs = new mainFunction();

	    bs.bubbleSort(data);
	    System.out.println("Sorted Array :");

	    // call toString() of Arrays class
	    // to convert data into the string
	    System.out.println(Arrays.toString(data));
	  }

}
