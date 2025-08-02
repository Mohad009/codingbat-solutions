public class OneTwo {
    public static String oneTwo(String str) {
  String newWord="";
  for(int i=0; i<=str.length()-3;i+=3){
    String chars=str.substring(i,i+3);
    String fchar=chars.substring(0,1);
    newWord+=chars.substring(1)+fchar;
  }
  return newWord;
}
public static void main(String[] args) {
    System.out.println(OneTwo.oneTwo("abc"));
}
}
