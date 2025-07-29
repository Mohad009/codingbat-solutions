import java.util.Arrays;

public class SwapEnds {
    public static int[] swapEnds(int[] nums) {
  int l=nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1]=l;
  return nums;
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(SwapEnds.swapEnds(new int[]{1,3,4,6})));
}
}
