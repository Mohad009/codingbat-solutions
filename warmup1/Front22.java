public class Front22 {
    public static String front22(String str) {
  if(str.length()<=1) return str+str+str;
  String f2=str.substring(0,2);
  return f2+str+f2;
}
public static void main(String[] args) {
    System.out.println(Front22.front22("Hello"));
}
}
