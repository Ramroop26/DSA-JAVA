// class Solution {
//       public static int searchInsert(int nums [], int target) {
//         int left = 0, right = nums.length - 1;
//         int mid = (left + right) / 2;
//         while (left <= right) {
            

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right=  mid - 1;
//             }
             
//         }
//         return -1;
//     }
// public static void main(String [] args){
//     int nums [] ={10,20,30,40, 50};
//     int target = 0;

//     System.out.print(searchInsert(nums, target));
// }
//       }
    





// Search in Rotated Sorted Array

// class Solution {
//     public static int search(int[] nums, int target) {

//         for (int i = 0; i < nums.length; ++i) {
//             if (nums[i] == target) {
//                 return i;
//             }

//         }
//         return -1;

//     }
// }

class BinarySearch{
    static int BS(int arr [], int target){
        int low =0, high=arr.length-1;   
        while(low<=high){
            int mid = low+high/2;
            if(arr[mid] == target) return mid;
            else if(target>arr[mid]) low =mid+1;
            else high= mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int target = 40;
        System.out.print(BS(arr, target));
        
    }
}