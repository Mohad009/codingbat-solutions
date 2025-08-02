public class BobThere {
    public static boolean bobThere(String str) {
  for(int i=0;i<=str.length()-3;i++){
    String word=str.substring(i,i+3);
    if(word.charAt(0)=='b' && word.charAt(2)=='b') return true;
  }
  return false;
}
public static void main(String[] args) {
    System.out.println(BobThere.bobThere("bac"));
}
}
