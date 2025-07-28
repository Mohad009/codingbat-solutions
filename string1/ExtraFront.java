public class ExtraFront {
    public static String extraFront(String str) {
  if(str.length()<=2) return str+str+str;
  else return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
}
public static void main(String[] args) {
    System.out.println(ExtraFront.extraFront("Good"));
}
}
