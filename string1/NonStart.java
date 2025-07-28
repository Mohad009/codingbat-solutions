public class NonStart {
    public static String nonStart(String a, String b) {
  if(a.length()<=1 && b.length()<=1)
  {
    
    return "";
    
  }else if(b.length()<=1){
    String acut=a.substring(1,a.length()); 
    return acut.concat("");
  }else if(a.length()<=1){
    String bcut=b.substring(1,b.length()); 
    return bcut.concat("");
  }
  else{
    String acut=a.substring(1,a.length());
     String bcut=b.substring(1,b.length());
     return acut.concat(bcut);
    
  }


}
public static void main(String[] args) {
    System.out.println(NonStart.nonStart("Hello","Java"));
}
}
