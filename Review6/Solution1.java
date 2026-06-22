public class Solution1 {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int pivot = 0;

        while (pivot <= high) {
            if (nums[pivot] == 0) {
                int temp = nums[low];
                nums[low] = nums[pivot];
                nums[pivot] = temp;
                low++;
                pivot++;
            } else if (nums[pivot] == 1) {
                pivot++;
            } else { // nums[pivot] == 2
                int temp = nums[high];
                nums[high] = nums[pivot];
                nums[pivot] = temp;
                high--;
            }
        }
    }
}
