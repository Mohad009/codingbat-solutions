public class MixString {
    public static String mixString(String a, String b) {
  int len=Math.max(a.length(),b.length());
  String newWord="";
  for(int i=0;i<len;i++){
    if(i<a.length()) newWord+=a.charAt(i);
    if(i<b.length()) newWord+=b.charAt(i);
  }return newWord;
}
public static void main(String[] args) {
    System.out.println(MixString.mixString("Hi", "Friend"));
}
}
