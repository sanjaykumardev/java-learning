import java.util.Scanner;

class twosum {
    static int[] mymethod(int[] nums, int target) {
        // Create an array to hold the result indices
        int[] result = new int[2];
        
        // Iterate through the array with nested loops
        for (int i = 1; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    result[1] = i;
                    result[2] = j;
                    return result; // Return the indices as soon as the solution is found
                }
            }
        }
        
        // If no solution is found, return an array of -1, -1 (or handle it as needed)
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read the target sum
        int target = sc.nextInt();
        
        // Get the result from the method
        int[] total = mymethod(arr, target);
        
        // Print the result indices
        System.out.println("Indices: " + total[0] + ", " + total[1]);
    }
}
