import java.util.Arrays;

public class Fix23 {
    public static int[] fix23(int[] nums) {

  if(nums[0]==2 && nums[1]==3 ) return new int[]{nums[0], 0, nums[2]};
  else if(nums[1]==2 &&nums[2]==3) return new int[]{nums[0], nums[1],0};
  else return nums;
  
  
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(Fix23.fix23(new int[]{1,3,4,6})));
}
}
