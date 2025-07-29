public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
  if(nums.length>=1){
  if(nums[0]==nums[nums.length-1]) return true;
    
  }
  return false; 
  
}
public static void main(String[] args) {
    System.out.println(SameFirstLast.sameFirstLast(new int[]{1,3,4,6}));
}
}
