public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk){
    return c>b;
  }else return b>a && c>b;
}
public static void main(String[] args) {
    System.out.println(InOrder.inOrder(1,1,2, false));
}
}
