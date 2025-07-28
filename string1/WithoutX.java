public class WithoutX {
    public static String withoutX(String str) {
  if(str.length() == 0) return str;
  String result = str;
  if(str.length() > 0 && str.substring(0,1).equals("x"))
    result = result.substring(1);
  if(result.length() > 0 && result.substring(result.length()-1).equals("x"))
    result = result.substring(0, result.length()-1);
  return result;
}
public static void main(String[] args) {
    System.out.println(WithoutX.withoutX("xbad"));
}
}
