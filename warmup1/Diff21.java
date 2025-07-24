

public class Diff21 {
public static int diff21(int n) {
  int sub=0;
  if(n>21)sub=2*(Math.abs(n-21));
  else sub=21-n;
  return sub;
}
public static void main(String []args){
    System.out.println(Diff21.diff21(34));
}
}
