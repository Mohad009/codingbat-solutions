public class MissingChar {
    public static String missingChar(String str, int n) {
 String f=str.substring(0,n);
 String b=str.substring(n+1,str.length());
 return f+b;
}
public static void main(String[] args) {
    System.out.println(missingChar("Hello",3));
}
}
