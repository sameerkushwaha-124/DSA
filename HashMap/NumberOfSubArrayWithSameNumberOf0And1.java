package HashMap;

import java.util.HashMap;

public class NumberOfSubArrayWithSameNumberOf0And1 {
    int maxLen(int[] arr, int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0, res = 0;
        for (int i = 0; i<n; i++){
            if(arr[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                res = Math.max(res,i-idx);
            }else{
                map.put(sum,i);
            }
        }
        return res;
    }
}
