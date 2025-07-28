public class AtFirst {
    public static String atFirst(String str) {
  if(str.length()<2) {
    if(str.length()==0) return "@@";
    else return str+"@";
  }
  return str.substring(0,2);
}
public static void main(String[] args) {
    System.out.println(AtFirst.atFirst("My"));
}
}
