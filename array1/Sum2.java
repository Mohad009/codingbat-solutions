public class Sum2 {
    public static int sum2(int[] nums) {
  if (nums.length==0) return 0;
  if(nums.length<2) return nums[0];
  return nums[0]+nums[1];
  
}
public static void main(String[] args) {
    System.out.println(Sum2.sum2(new int[]{1,3,4,6}));
}
}
