

public class SumDouble {
    public static int sumDouble(int a, int b) {
  int dsum=0;
  if(a==b) dsum=(a*2)+(b*2);
  else dsum=a+b;
  return dsum;
}
public static void main(String []args){
    System.out.println(SumDouble.sumDouble(3, 3));
}
}
