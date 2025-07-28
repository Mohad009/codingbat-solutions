public class FirstLast6 {
    public static boolean firstLast6(int[] nums) {
if(nums[0]==6 || nums[nums.length-1]==6) return true;
return false;

}
public static void main(String[] args) {
    System.out.println(FirstLast6.firstLast6(new int[]{1,3,4,6}));
}
}
