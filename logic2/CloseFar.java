public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
    if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        return false;
}
public static void main(String[] args) {
    System.out.println(CloseFar.closeFar(1,2,3));
}
}
