public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(noDoubles && die1==die2 && die1==6) return die1+1;
  else if(noDoubles && die1==die2) return die1+(die2+1);
  else return die1+die2;
}
public static void main(String[] args) {
    System.out.println(WithoutDoubles.withoutDoubles(3, 3, false));
}
}
