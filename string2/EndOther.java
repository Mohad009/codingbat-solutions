public class EndOther {
    public static boolean endOther(String a, String b) {
  String la=a.toLowerCase();
  String lb=b.toLowerCase();
  if(la.length()>lb.length()){
    if(lb.equals(la.substring(la.length()-lb.length())))return true;
  }
    if(lb.length()>la.length()){
    if(la.equals(lb.substring(lb.length()-la.length())))return true;
  }else if(lb.length()==la.length()) {if(la.equals(lb)) return true;}
  return false;
}
public static void main(String[] args) {
    System.out.println(EndOther.endOther("abC", "HiaBc"));
}
}
