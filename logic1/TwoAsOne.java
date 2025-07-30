public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
  int s1=a+b;
  int s2=a+c;
  int s3=b+c;
  if(s1==c) return true;
  else if(s2==b) return true;
  else if(s3==a) return true;
  else return false;
  
}
public static void main(String[] args) {
    System.out.println(TwoAsOne.twoAsOne(3,2,2));
}
}
