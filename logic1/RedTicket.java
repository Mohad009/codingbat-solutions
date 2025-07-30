public class RedTicket {
    public static int redTicket(int a, int b, int c) {
  if(b!=a && c!=a) return 1;
  if(a==2 && b==2 && c==2) return 10;
  else if(a==b && a==c && b==c) return 5;
  else return 0;
}
public static void main(String[] args) {
    System.out.println(RedTicket.redTicket(0,0,0));
}
}
