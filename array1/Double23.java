public class Double23 {
    public static boolean double23(int[] nums) {
  if(nums.length<=1) return false;
  if(nums[0]==nums[1] &&(nums[0]==2 || nums[0]==3)) return true;
  return false;

}
public static void main(String[] args) {
    System.out.println(Double23.double23(new int[]{1,3,4,6}));
}
}
