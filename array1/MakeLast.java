import java.util.Arrays;
public class MakeLast {
    public static int[] makeLast(int[] nums) {
  int []arr1=new int[nums.length*2];
  arr1[arr1.length-1]=nums[nums.length-1];
  return arr1;
}
public static void main(String[] args) {
    System.out.println(Arrays.toString(MakeLast.makeLast(new int[]{1,3,4,6})));
}
}
