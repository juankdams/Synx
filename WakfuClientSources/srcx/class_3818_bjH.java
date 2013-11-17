import java.util.HashMap;

public class bjH
{
  private static final bjH fAe = new bjH();

  private final HashMap fAf = new HashMap();

  public static bjH buV()
  {
    return fAe;
  }

  public dwN fC(long paramLong)
  {
    return (dwN)this.fAf.get(Long.valueOf(paramLong));
  }

  public void fD(long paramLong)
  {
    this.fAf.remove(Long.valueOf(paramLong));
  }

  public void a(dwN paramdwN)
  {
    this.fAf.put(Long.valueOf(paramdwN.sN()), paramdwN);
  }
}