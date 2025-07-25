public class Front3 {
    public static String front3(String str) {
  if(str.length()<=3) return str+str+str;
  String f=str.substring(0,3);
  return f+f+f;
}
public static void main(String[] args) {
    System.out.println(Front3.front3("Hello"));
}
}
