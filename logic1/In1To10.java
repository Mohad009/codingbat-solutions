public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode){
    if(n<=1 || n>=10) return true;
  }else if(n>=1 && n<=10) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(In1To10.in1To10(11, true));
}
}
