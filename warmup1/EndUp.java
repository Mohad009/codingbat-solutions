public class EndUp {
    public static String endUp(String str) {
  if (str.length() <= 3) return str.toUpperCase();
    int cut = str.length() - 3;
  String front = str.substring(0, cut);
  String back  = str.substring(cut);
  
  return front + back.toUpperCase();
}
public static void main(String[] args) {
    System.out.println(EndUp.endUp("Hello ,Friend"));
}
}
