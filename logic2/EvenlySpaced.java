public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
    int min=Math.min(Math.min(a,b), c);
    int max=Math.max(Math.max(a,b), c);
    int mid=a+b+c-min-max;  
    
    return (mid-min)==(max-mid);
}
public static void main(String[] args) {
    System.out.println(EvenlySpaced.evenlySpaced(4,6,3));
}
}
