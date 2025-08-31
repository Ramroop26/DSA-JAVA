// class Solution {
//     public static int searchInsert(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;

//         while (left <= right) {
//             int mid = (left + right) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return left;
//     }
// }

// Search in Rotated Sorted Array

class Solution {
    public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;

    }
}
