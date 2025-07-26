public class LastDigit {
    public static boolean lastDigit(int a, int b) {
  int lDigita=a%10;
  int lDigitb=b%10;
  if(lDigita==lDigitb) return true;
  else return false;
}
public static void main(String[] args) {
    System.out.println(LastDigit.lastDigit(100, 20));
}
}
