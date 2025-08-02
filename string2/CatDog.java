public class CatDog {
    public static boolean catDog(String str) {
    int count1=0;
    int count2=0;
  for(int i=0; i<=str.length()-3;i++){
  if(str.substring(i,i+3).equals("cat")) count1++;
  if(str.substring(i,i+3).equals("dog")) count2++;
  }
  return count1==count2;
}
public static void main(String[] args) {
    System.out.println(CatDog.catDog("catdog"));
}
}
