public class LessBy10 {
    public static boolean lessBy10(int a, int b, int c) {
  int d1=Math.abs(a-b);
  int d2=Math.abs(a-c);
  int d3=Math.abs(b-c);
  return d1>=10 || d2>=10 || d3>=10;
}
public static void main(String[] args) {
    System.out.println(LessBy10.lessBy10(11,2,7));
}
}
