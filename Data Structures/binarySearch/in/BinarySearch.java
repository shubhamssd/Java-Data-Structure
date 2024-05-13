package binarySearch.in;

public class BinarySearch {
    public static void main(String[] args) {                  //binarySearch.in.BinarySearch vs LinearSerach = binarySearch.in.BinarySearch easily won coz its takes less steps to execution or searching
        int[] nums = {5,6,8,9,11};
        int target = 11;
        int result = binarySearch(nums, target);
        if(result != -1)
            System.out.println("Number is found in index : "+ result);
        else
            System.out.println("Number not found");

    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}
