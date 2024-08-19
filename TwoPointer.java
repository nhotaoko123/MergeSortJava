import java.util.Arrays;

public class TwoPointer {
    public static int[] twopointer(int[] numbers, int target) {
        int left_index = 0, right_index = numbers.length - 1;
        if (numbers[right_index] < target){
            return new int[]{};
        }

        while(numbers[left_index] != target || right_index != target){
            if (left_index < target){
                left_index ++;
            }

            if(right_index > target){
                right_index --;
            }

            if(numbers[left_index] == target){
                return new int[]{left_index + 1};
            }
            else if (numbers[right_index] == target){
                return new int[]{right_index + 1};
            }
        }
        return new int[]{};

    }

    public static void main(String[] args){
        int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int target = 56;
        int[]target_index;
        target_index = twopointer(arr, target);
        System.out.println(Arrays.toString(target_index));
    }
}
