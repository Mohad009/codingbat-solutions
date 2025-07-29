

public class MaxTriple {
    public static int maxTriple(int[] nums) {
  int half=nums.length/2;
  int last=nums[nums.length-1];
  if(nums[0]>nums[half] && nums[0]>last) return nums[0];
  else if(nums[half]>nums[0] && nums[half]>last) return nums[half];
  return last;
}
public static void main(String[] args) {
    System.out.println(MaxTriple.maxTriple(new int[]{1,3,4,6,7}));
}
}
