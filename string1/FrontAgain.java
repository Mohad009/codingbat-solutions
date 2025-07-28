public class FrontAgain {
    public static boolean frontAgain(String str) {
  if(str.length()<=1) return false;
  String f=str.substring(0,2);
  String l=str.substring(str.length()-2);
  if(f.equals(l)) return true;
  else return false;
}
public static void main(String[] args) {
    System.out.println(FrontAgain.frontAgain("edit"));
}
}
