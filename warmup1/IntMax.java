public class IntMax {
    public static int intMax(int a, int b, int c) {
  if(a>b && a>c)return a;
  else if(b>a && b>c) return b;
  return c;
}
public static void main(String[] args) {
    System.out.println(IntMax.intMax(15,20,33));
}
}
