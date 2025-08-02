public class ZipZap {
    public static String zipZap(String str) {
  String result="";
  if(str.length()<3) return str;
  
  for (int i = 0; i < str.length(); i++) {
    if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
          result = result + "zp";
          i = i + 2;
} else {
         result = result + str.charAt(i);
          }
        }


return result;
}
public static void main(String[] args) {
    System.out.println(ZipZap.zipZap("zopzop"));
}
}
