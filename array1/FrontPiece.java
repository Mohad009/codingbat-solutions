import java.util.Arrays;

public class FrontPiece {
    public static int[] frontPiece(int[] nums) {
  if(nums.length<2) return nums;
  return new int[]{nums[0],nums[1]};
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(FrontPiece.frontPiece(new int[]{1,3,4,6})));
}
}
