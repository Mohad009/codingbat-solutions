import java.util.Arrays;

public class MidThree {
    public static int[] midThree(int[] nums) {
  int l =nums.length;
  if(l==3) return new int[]{nums[0],nums[1],nums[2]};
  else if(l==5)return new int[]{nums[1],nums[2],nums[3]};
  return new int[]{nums[2],nums[3],nums[4]};
  
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(MidThree.midThree(new int[]{1,3,4,6,3})));
}
}
