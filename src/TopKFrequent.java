import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * LeetCode Problem 347  Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2]. 
 * @author wilso663
 */
class Pair{
    int num;
    int count;
    public Pair(int num, int count){
        this.num=num;
        this.count=count;
    }
}
 
public class TopKFrequent {

	public static void main(String[] args) {
		int[] testArr = {1,1,1,2,2,3,4,4,4,4,5,5,5};
		List<Integer> lst = TopKFrequent(testArr,3);
		System.out.println(lst);
	}
	public static List<Integer> TopKFrequent(int[] nums, int k){
		//count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
 
      //get the max frequency
        int max = 0;
        for(Entry<Integer, Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }
     
        //initialize an array of ArrayList. index is frequency, value is list of numbers
        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
        for(int i=1; i<=max; i++){
            arr[i]=new ArrayList<Integer>();
        }
     
        for(Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int number = entry.getKey();
            arr[count].add(number);
        }
     
        List<Integer> result = new ArrayList<Integer>();
     
        //add most frequent numbers to result
        for(int j=max; j>=1; j--){
            if(arr[j].size()>0){
                for(int a: arr[j]){
                    result.add(a);
                }
            }
     
            if(result.size()==k)
                break;
        }
     
        return result;

	}

}
