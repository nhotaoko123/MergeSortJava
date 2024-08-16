public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        // Calculate the total sum of the array elements
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // The right sum for index i is totalSum minus leftSum minus nums[i]
            int rightSum = totalSum - leftSum - nums[i];

            // If left sum equals right sum, we've found the pivot index
            if (leftSum == rightSum) {
                return i;
            }

            // Update the left sum for the next iteration
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};

        System.out.println("Pivot Index of nums1: " + pivotIndex(nums1)); // Expected output: 3
        System.out.println("Pivot Index of nums2: " + pivotIndex(nums2)); // Expected output: -1
        System.out.println("Pivot Index of nums3: " + pivotIndex(nums3)); // Expected output: 0
    }
}
