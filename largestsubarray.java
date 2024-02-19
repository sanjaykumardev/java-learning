// 
// import java.io;
// import java.util;

class largestsubarray {
	// Driver Code
	public static void main(String[] args)
	{
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is "
						+ maxSubArraySum(a));
	}

	// Function Call
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int maxvalue = Integer.MIN_VALUE, max_ending_here
											= 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (maxvalue < max_ending_here)
				maxvalue = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return maxvalue;
	}
}
