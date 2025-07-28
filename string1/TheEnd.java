public class TheEnd {
    public static String theEnd(String str, boolean front) {
  if(front && str.length()!=0) return str.substring(0,1);
  else return str.substring(str.length()-1,str.length());
}
public static void main(String[] args) {
    System.out.println(TheEnd.theEnd("Hahaha", true));
}
}
