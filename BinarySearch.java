public class BinarySearch {

    public static int[] binarySearch(int[]numbers, int target){
        int left_index = 0, right_index = numbers.length-1, mid_index = (right_index - left_index) / 2;
        while(numbers[mid_index] != target){

            if (numbers[mid_index]==target){
                return new int[]{mid_index};
            }
            
            if (numbers[mid_index] > target){
                right_index = mid_index;
            }

            if(numbers[mid_index] < target){
                left_index = mid_index;
            }
            if (right_index == left_index){
                return new int[]{-1};
            }
            mid_index = left_index + (right_index - left_index) / 2;
        }
        return new int[]{mid_index};
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int x = 10;
        int[] result;
        result = binarySearch(arr, x);
        if (result[0]== -1){
            System.out.println("No found index of "+ x);
        }
        else{
            System.out.println("The index of element is "  + result[0]);
        }
    }
}
 
