import java.util.HashMap;
/*Given nums = [2, 7, 11, 15], target = 9,
*
*Because nums[0] + nums[1] = 2 + 7 = 9,
*return [0, 1]
*/

public class TwoSums{
	public int[] twoSum(int[] nums,int target){
		for(int i=0;i < nums.length; i ++){
			for(int j =i+1;j <nums.length; j ++){
				if (nums[j]==target - nums[i]){
					int[] result={i ,j};
					return result;
				}
			}
		}
		int[] result1={-1,-1};
		return result1;
	}
	public int[] twoSum1(int[] nums,int target){
		HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();
		for(int i=0;i <nums.length;i ++){
			if(result.get(target -nums[i])!=null){
				return new int[]{result.get(target-nums[i]),i};
			}
			result.put(nums[i],i);
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
			TwoSums ts=new TwoSums();
			int[] nums={2,7,11,15};
			int target=9;
			int[] data=ts.twoSum1(nums,target);
			for ( int element:data ) {
				System.out.println(element);
			}
	}
}