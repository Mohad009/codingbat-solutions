public class StartOz {
    public static String startOz(String str) {
  String s="";
  if (str.length() >= 1 && str.charAt(0)=='o') {
    s = s + str.charAt(0);
  }
  
  if (str.length() >= 2 && str.charAt(1)=='z') {
    s = s + str.charAt(1);
  }
  
  return s;
}
public static void main(String[] args) {
    System.out.println(StartOz.startOz("Zero"));
}
}
