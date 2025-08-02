public class GetSandwich {
    public static String getSandwich(String str) {
    int firstBreadIndex = -1;
    int lastBreadIndex = -1;
      for(int i = 0; i <= str.length() - 5; i++) {
      String brd=str.substring(i,i+5);
      if(brd.equals("bread")){
        if(firstBreadIndex==-1) firstBreadIndex=i;
        lastBreadIndex=i;
      }
      
    }
  if(firstBreadIndex==-1 || firstBreadIndex==lastBreadIndex) return "";

  return str.substring(firstBreadIndex+5,lastBreadIndex);
}
public static void main(String[] args) {
    System.out.println(GetSandwich.getSandwich("xxbreadyy"));
}
}
