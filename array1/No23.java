public class No23 {
    public static boolean no23(int[] nums) {
    if(nums[0]!=2 && nums[0]!=3&& nums[1]!=2 &&nums[1]!=3) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(No23.no23(new int[]{1,3}));
}
}
