public class Has23 {
    public static boolean has23(int[] nums) {
  if(nums[0]==2 ||nums[0]==3|| nums[1]==2 ||nums[1]==3) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(Has23.has23(new int[]{4,6}));
}
}
