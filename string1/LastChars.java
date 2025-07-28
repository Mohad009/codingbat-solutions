public class LastChars {
    public static String lastChars(String a, String b) {
 String afchar;
 String blchar;
 if(a.length()==0)afchar="@";
 else afchar=a.substring(0,1);
 
  if(b.length()==0)blchar="@";
 else blchar=b.substring(b.length() - 1);
 
 return afchar+blchar;
}
public static void main(String[] args) {
    System.out.println(LastChars.lastChars("You", "o"));
}
}
