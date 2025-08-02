public class XyzThere {
    public static boolean xyzThere(String str) {

  for(int i=0;i<=str.length()-3;i++){
    if(str.substring(i,i+3).equals("xyz")){
      if(i==0 || str.charAt(i-1)!='.') return true;
    }
  }
  return false;
}
public static void main(String[] args) {
    System.out.println(XyzThere.xyzThere("abc.xyz"));
}
}
