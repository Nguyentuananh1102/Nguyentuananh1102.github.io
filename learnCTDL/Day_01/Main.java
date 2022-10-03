
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    // public static int[] insertFirst(int[] arr1, int x){
    // int[] arr2 = new int[arr1.length + 1];
    //
    // }

    // public static int[] insertFirst(int[] arr1, int x){
    //     int[] array2 = new int[arr1.length + 1];
    //     for(int i = 0 ; i < array2.length ; i ++){
    //         if (i == array2.length - 1) {
    //             array2[1] = x;
    //             }else {
    //                 array2[i] = arr1[i];
    //             }
    //         }
    //     }

    public static void main(String[] args) {
        int[] array1 = { 5, 7, 1, 9, 3, 2 };
        int temp = array1[0];
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    temp = array1[j];
                    array1[j] = array1[i];
                    array1[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được xếp theo thứ tự tăng dần là: ");
        show(array1);

        // int i = 1;
        // int j = 10;
        // do{
        //     if(i>j){
        //         break;
        //     }
        //     j--;
        // }while(++i)
    }

    public static void show(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int  i : nums){
            if(countDigit(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    
    public int countDigit(int number){
//         int count = 0;
//         while(number != 0){
//             number = number/10;
//             count++;
//         }

//         return count;
        
        String temp = String.valueOf(number);
        return temp.length();
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i + 1 ; j < nums.length; j ++) {
                if( result[i] + result[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        } return result;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0, edge = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (edge > 0) {
                    if (nums[edge] != val) {
                        nums[i] = nums[edge];
                        edge--;
                        break;
                    }
                    edge--;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }
}