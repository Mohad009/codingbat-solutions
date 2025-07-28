public class SeeColor {
    public static String seeColor(String str) {
  if(str.length()!=0 && (str.charAt(0)=='r'||str.charAt(0)=='b') ){
      if(str.contains("red")) return "red";
      else if(str.contains("blue")) return "blue";
  }

 return "";
}
public static void main(String[] args) {
    System.out.println(SeeColor.seeColor("xxred"));
}
}
