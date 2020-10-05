
public class Lab1_Q2 {
	public static void main(String[] args){
		int nums[] = {2,7,11,15};
		
		int values[] = twoSum(nums, 18);

		System.out.println("Values = ");
		
		for(int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
	}

	public static int[] twoSum(int[] nums, int target) {
		
		int[] nums2 = new int[2];
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				
				
				if(nums[i] + nums[j] == target){
					nums2[count] = nums[i];
					count++;
					break;
				}
				
				
			}
		}
		
		return nums2;
	}
}
