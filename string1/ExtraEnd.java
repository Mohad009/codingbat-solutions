public class ExtraEnd {
    public static String extraEnd(String str) {
  String l=str.substring(str.length()-2,str.length());
  return l+l+l;
}
public static void main(String[] args) {
    System.out.println(ExtraEnd.extraEnd("Good"));
}
}
