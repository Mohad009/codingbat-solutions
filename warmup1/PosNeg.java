public class PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {
  boolean r=false;
  if(((a<0 && b>0) || a>0 && b<0) && negative==false) r=true;
  else if( negative==true){
    if(a<0 && b<0) r=true;
    
  }else r=false;
  return r;
}
public static void main(String[] args) {
 System.out.println(PosNeg.posNeg(-4,3 ,true));   
}
}
