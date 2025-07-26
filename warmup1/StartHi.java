public class StartHi {
    public static boolean startHi(String str) {
  if(str.length()<=1) return false;
  if(str.substring(0,2).equals("hi")) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(StartHi.startHi("Mohammed"));
}
}
