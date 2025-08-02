public class PlusOut {
    public static String plusOut(String str, String word) {
  String result="";
  for(int i=0;i<str.length();i++){
    int len=str.length() - word.length();
    if(i<=len && str.substring(i,i+word.length()).equals(word)){
      result+=word;
      i+=word.length()-1;
    }else {
      
    result+="+";
    }
  }
  return result;
}
public static void main(String[] args) {
    System.out.println(PlusOut.plusOut("12xy34", "1"));
}
}
