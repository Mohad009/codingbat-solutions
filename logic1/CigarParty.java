public class CigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend && cigars>60) return true;
  else if(cigars<=60 && cigars >=40) return true;
  return false;
}
public static void main(String[] args) {
    System.out.println(CigarParty.cigarParty(55, false));
}
}