import java.util.Arrays;

public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
  int half=nums.length/2;
  return new int[]{nums[half-1],nums[half]};
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(MakeMiddle.makeMiddle(new int[]{1,3,4,6})));
}
}
