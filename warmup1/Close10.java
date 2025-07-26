public class Close10 {
    public static int close10(int a, int b) {
  int diffa=Math.abs(10-a);
  int diffb=Math.abs(10-b);
  if(diffa==diffb) return 0;
  else if(diffa>diffb) return b;
  return a;
}
public static void main(String[] args) {
    System.out.println(Close10.close10(15, 12));
}
}
