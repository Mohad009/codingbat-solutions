public class XyzMiddle {
    public static boolean xyzMiddle(String str) {
  for(int i=0;i<=str.length()-3;i++){
    String word=str.substring(i,i+3);
    if(word.equals("xyz")){
      int charsLeft = i;
      int charsRight = str.length() - (i + 3);
      if(Math.abs(charsLeft - charsRight) <= 1 ) return true;
    }
  }
  return false;
}
public static void main(String[] args) {
    System.out.println(XyzMiddle.xyzMiddle("AAxyzBB"));
}
}
