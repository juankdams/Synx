import java.util.List;
import org.apache.log4j.Logger;

public class cPi extends dWf
{
  private static final cWh aGJ = new cWh(new ec[] { new bpq("Nothing", new dou[0]) });

  public static final aBW aGK = new dmJ();

  private cPi(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    super(paramLong, paramInt1, paramInt2, paramBoolean, paramIterable);
  }

  public void b(List paramList)
  {
  }

  public cQY pt()
  {
    return cQY.kCR;
  }

  public boolean a(bkt parambkt)
  {
    dhJ localdhJ1 = (dhJ)parambkt.bDq();
    dhJ localdhJ2 = parambkt.Na();
    if (localdhJ2 == null) {
      K.error("Attacker null lors du test de loi d'incruste !!!");
      return false;
    }
    dhJ localdhJ3 = parambkt.Nb();
    if (localdhJ2 == null) {
      K.error("Defender null lors du test de loi d'incruste !!!");
      return false;
    }
    dhJ localdhJ4 = localdhJ1.Fx() == localdhJ2.Fx() ? localdhJ2 : localdhJ3;
    if ((!(localdhJ1 instanceof dcw)) || (!(localdhJ4 instanceof dcw)))
      return false;
    long l1 = ((dcw)localdhJ1).c(go.aEq);
    long l2 = ((dcw)localdhJ4).c(go.aEq);
    return (parambkt.MZ() != dTw.mqi) && ((l1 <= 0L) || (l2 <= 0L) || (l1 != l2));
  }
}