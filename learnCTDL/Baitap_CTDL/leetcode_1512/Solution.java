import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> numbersMap = new HashMap<>();
	int counter = 0;
	
	for(int keys : nums){
		numbersMap.put(keys,numbersMap.getOrDefault(keys,0)+1);
	}
	
	for(int keys : numbersMap.keySet()){
		int values = numbersMap.get(keys);

		if(values > 1){
			counter += values * (values - 1) / 2;
		}
	}
	
	return counter;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
}