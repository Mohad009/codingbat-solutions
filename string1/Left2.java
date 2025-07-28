public class Left2 {
    public static String left2(String str) {
  if(str.length()<=2) return str;
  String f2=str.substring(0,2);
  return str.substring(2,str.length())+f2;
}

public static void main(String[] args) {
    System.out.println(Left2.left2("Angry"));
}
}
