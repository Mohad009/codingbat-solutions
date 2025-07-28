public class DeFront {
    public static String deFront(String str) {    
  if(str.length()<1) return str;
  String a=str.substring(0,1);
  String b=str.substring(1,2);
  if(str.charAt(0)=='a' && str.charAt(1)=='b') return str;
  else if(str.charAt(0)=='a') return a+str.substring(2);
  else if(str.charAt(1)=='b') return b+str.substring(2);
  return str.substring(2);
}
public static void main(String[] args) {
    System.out.println(DeFront.deFront("far"));
}
}
