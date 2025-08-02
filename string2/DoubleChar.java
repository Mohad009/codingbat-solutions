public class DoubleChar{
public static String doubleChar(String str) {
  String dc="";
  for(int i=0; i<str.length();i++){
    dc+=str.charAt(i);
    dc+=str.charAt(i);
  }
  return dc;
}
public static void main(String[] args) {
    System.out.println(DoubleChar.doubleChar("Hello"));
}
}

