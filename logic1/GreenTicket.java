public class GreenTicket {
    public static int greenTicket(int a, int b, int c) {
  if(a==b && a==c && b==c) return 20;
  else if(a==b || a==c || b==c) return 10;
  return 0;
}
public static void main(String[] args) {
    System.out.println(GreenTicket.greenTicket(1,1,2));
}
}
