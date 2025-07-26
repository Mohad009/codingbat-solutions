public class EveryNth {
    public static String everyNth(String str, int n) {
  String newWord="";
  for(int i=0;i<str.length();i=i+n){
    newWord=newWord+str.charAt(i);
    
  }return newWord;
}
public static void main(String[] args) {
    System.out.println(EveryNth.everyNth("Mohammed", 2));
}
}
