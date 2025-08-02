public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
  int bigNo=Math.min(big,goal/5);
  int r=goal-bigNo*5;
  return small>=r;
}
public static void main(String[] args) {
    System.out.println(MakeBricks.makeBricks(3,2,10));
}
}
