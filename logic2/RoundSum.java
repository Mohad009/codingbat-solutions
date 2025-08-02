public class RoundSum {
    public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}
public int round10(int num){
  int right=num%10;
  int round;
  if(right>=5) round=(num/10+1)*10;
  else round=(num/10)*10;
  return round;
}
public static void main(String[] args) {
    RoundSum r=new RoundSum();
    System.out.println(r.roundSum(6,4,4));
}
}
