public class WithoutX2 {
    public static String withoutX2(String str) {
  if(str.length() == 0) return str;
  if(str.length() == 1) {
    if(str.equals("x")) return "";
    else return str;
  }
  String result = "";
   if(!str.substring(0,1).equals("x")) result += str.substring(0,1);
  if(!str.substring(1,2).equals("x")) result += str.substring(1,2);
  if(str.length() > 2) result += str.substring(2);
  return result;
}
public static void main(String[] args) {
    System.out.println(WithoutX2.withoutX2("xxbadx"));
}
}
