public class Right2 {
    public static String right2(String str) {
  if(str.length()<=2) return str;
  String l2=str.substring(str.length()-2,str.length());
  return l2+str.substring(0,str.length()-2);
}
public static void main(String[] args) {
    System.out.println(Right2.right2("Hello"));
}
}
