import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(nums[i])) {
               map.put(nums[i], map.get(nums[i])+1);
           } else{
               map.put(nums[i],1);
           }
        }
        int highestCount = 0;
        int mostCommonElement = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                mostCommonElement = entry.getKey();
            }
        }
        return mostCommonElement;
    }
}
