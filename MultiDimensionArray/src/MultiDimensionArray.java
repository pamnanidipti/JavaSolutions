import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MultiDimensionArray {

	public MultiDimensionArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[][] hours = { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1 } };

		ArrayList<Integer> dimensions = new ArrayList<Integer>();
		getDimensions(hours, dimensions);
		int[] dims = new int[dimensions.size()];
		// System.out.println("dims length: "+dims.length);
		for (int i = 0; i < dims.length; i++) {
			dims[i] = dimensions.get(i);
			// System.out.println("dims i "+dims[i]);
		}
		int total = 0;
		for (int i = 0; i < dims[0]; i++) {
			for (int j = 0; j < dims[1]; j++) {
				total += hours[i][j];
			}
		}
		System.out.println("Total Sum: " + total);
	}

	public static void getDimensions(Object array, List<Integer> dimensions) {
		if (array != null && array.getClass().isArray()) {
			dimensions.add(Array.getLength(array));
			if (Array.getLength(array) > 0) {
				getDimensions(Array.get(array, 0), dimensions);
			}
		}
	}
}
