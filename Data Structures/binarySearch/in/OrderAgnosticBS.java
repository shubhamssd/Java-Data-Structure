package binarySearch.in;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={-12, -8, -3, 0, 1, 3 ,5,7, 8,16};
        int target = 0;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; ///check if arr is ascending order or not
        
        while(start <= end){
             int mid = start + (end - start)/2;
             
             if(arr[mid] == target){
                 return mid;
             }

             if(isAsc){
                 if (target < arr[mid]){
                     end = mid -1;
                 }else {
                     start = mid + 1;
                 }
             }else{
                 if (target > arr[mid]){
                     end = mid -1;
                 }else{
                     start = mid + 1;
                 }
             }
        }
        return -1;
    }
}



