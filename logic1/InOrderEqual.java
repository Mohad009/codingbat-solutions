public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk) return a<=b && b<=c && a<=c;
  else return a<b && b<c && a<c;
}
public static void main(String[] args) {
    System.out.println(InOrderEqual.inOrderEqual(2, 5, 11, false));
}
}
