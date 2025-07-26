public class HasTeen {
    public static boolean hasTeen(int a, int b, int c) {
  if(a<=19 && a>=13) return true;
  else if(b<=19 && b>=13) return true;
  else if(c<=19 && c>=13) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(HasTeen.hasTeen(5, 6, 22));
}
}
