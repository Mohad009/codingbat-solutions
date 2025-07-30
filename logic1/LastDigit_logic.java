public class LastDigit_logic {
    public static boolean lastDigit(int a, int b, int c) {
  int r1=a%10;
  int r2=b%10;
  int r3=c%10;
  return (r1 == r2) || (r1 == r3) || (r2 == r3);
}
public static void main(String[] args) {
    System.out.println(LastDigit_logic.lastDigit(23, 19, 12));
}
}
