public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
  if(nums[0]>nums[2]) return new int[]{nums[0],nums[0],nums[0]};
  return new int[]{nums[2],nums[2],nums[2]};
}
public static void main(String[] args) {
    System.out.println(MaxEnd3.maxEnd3(new int[]{2,11,3}));
}
}
