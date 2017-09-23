
public class KGroups {
	static int k = 3;

	public KGroups() {
		// TODO Auto-generated constructor stub
	}

	static boolean isSubsetSum(int arr[], int n, int sum) {

		if (sum == 0)
			return true;
		if (n == 0 && sum != 0)
			return false;

		if (arr[n - 1] > sum)
			return isSubsetSum(arr, n - 1, sum);

		return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
	}

	static boolean seperate(int arr[], int n) {

		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		if (sum % k != 0)
			return false;

		return isSubsetSum(arr, n, sum / k);
	}

	/* Driver function to check for above function */
	public static void main(String[] args) {

		int arr[] = { 4, 1, 5, 9, 10 };
		int n = arr.length;

		if (seperate(arr, n) == true)
			System.out.println("Can be divided into " + k + " subsets of equal sum");
		else
			System.out.println("Can not be divided into " + k + " subsets of equal sum");
	}

}
