public class WithoutEnd2 {
    public static String withouEnd2(String str) {
  if(str.length()<=2) return "";
  else return str.substring(1,str.length()-1);
}
public static void main(String[] args) {
    System.out.println(WithoutEnd2.withouEnd2("qwerty"));
}
}
