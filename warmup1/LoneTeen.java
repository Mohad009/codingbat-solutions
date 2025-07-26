public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
  boolean at=(a<=19 && a>=13);
  boolean bt=(b<=19 && b>=13);
  if((at && !bt) ||(!at && bt)) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(LoneTeen.loneTeen(15, 20));
}
}
