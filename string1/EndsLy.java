public class EndsLy {
    public static boolean endsLy(String str) {
  if(str.length()<2) return false;
  String last2 = str.substring(str.length()-2, str.length());
  return last2.equals("ly");
}
public static void main(String[] args) {
    System.out.println(EndsLy.endsLy("quaitly"));
}
}
