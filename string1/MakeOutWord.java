public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
  String open=out.substring(0,2);
  String close=out.substring(2,out.length());
  return open+word+close;
}
public static void main(String[] args) {
    System.out.println(MakeOutWord.makeOutWord("{{}}", "hehe"));
}
}
