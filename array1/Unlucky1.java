public class Unlucky1 {
    public static boolean unlucky1(int[] nums) {
    if(nums.length < 2) return false;
  if(nums[0] == 1 && nums[1] == 3) return true;
  if(nums.length >= 3 && nums[1] == 1 && nums[2] == 3) return true;
  if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(Unlucky1.unlucky1(new int[]{1,3,4,6}));
}
}
