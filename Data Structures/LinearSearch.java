public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5,6,8,9,11};
        int target = 9;

        int result = linearSearch(nums, target);
        if(result != -1)
            System.out.println("Number is found : "+ result);
        else
            System.out.println("Number not found");

    }

    public static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
