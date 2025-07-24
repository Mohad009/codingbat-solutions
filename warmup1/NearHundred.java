public class NearHundred {
    public static boolean nearHundred(int n) {
  boolean w=false;
  if(Math.abs(n-100)<=10 || Math.abs(n-200) <=10) w=true;
  else w=false;
  return w;
}
public static void main(String[] args) {
 System.out.println(NearHundred.nearHundred(87));   
}
}
