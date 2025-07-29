public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
  int []rotated={nums[1],nums[2],nums[0]};
  return rotated;
}
public static void main(String[] args) {
    System.out.println(RotateLeft3.rotateLeft3(new int[]{1,3,4}));
}
}
