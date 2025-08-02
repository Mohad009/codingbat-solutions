public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
    int BigNeeded=goal/5;           
    int bigUsed=Math.min(big,BigNeeded);
    int remaining=goal-(bigUsed*5);  
    
    if (remaining<=small) return remaining;
else return -1;
}
public static void main(String[] args) {
    System.out.println(MakeChocolate.makeChocolate(4,1,7));
}
}
