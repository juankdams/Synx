import java.util.Comparator;

public class FI
{
  private static final int bNO = 200;
  private static final int bNP = 10;
  public static final int bNQ = 20;
  private static final Comparator bEa = new ph();

  private final Ej bNR = new Ej(4, bEa);

  public void a(cLE paramcLE) {
    this.bNR.add(paramcLE);
  }

  public boolean i(dGy paramdGy) {
    int i = 0; for (int j = this.bNR.size(); i < j; i++) {
      cLE localcLE = (cLE)this.bNR.get(i);
      if (!paramdGy.d(localcLE))
        return false;
    }
    return true;
  }

  public boolean a(dGy paramdGy, int paramInt, lX paramlX) {
    int i = 0; for (int j = this.bNR.size(); i < j; i++) {
      cLE localcLE = (cLE)this.bNR.get(i);
      if (!localcLE.a(paramInt, paramlX))
        return false;
      if (!paramdGy.d(localcLE))
        return false;
    }
    return true;
  }

  public String toString()
  {
    return "RewardList{m_rewards=" + this.bNR.size() + '}';
  }

  public static int eK(int paramInt)
  {
    if ((!bB) && ((paramInt <= 0) || (paramInt > 200))) throw new AssertionError();
    return (paramInt - 1) / 10;
  }

  public static int eL(int paramInt) {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 20))) throw new AssertionError();
    return paramInt * 10 + 1;
  }

  public static int eM(int paramInt) {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 20))) throw new AssertionError();
    return (paramInt + 1) * 10;
  }
}