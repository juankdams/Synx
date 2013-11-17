import java.util.Iterator;
import org.apache.log4j.Logger;

public class aTb extends dqt
{
  private final Iterable eQp;

  public aTb(int paramInt, Iterable paramIterable)
  {
    super(paramInt, dPD.mhY.bJ(), 0);
    this.eQp = paramIterable;
  }

  public long mC()
  {
    int i = 0;
    for (Iterator localIterator = this.eQp.iterator(); localIterator.hasNext(); ) {
      aKw localaKw = (aKw)localIterator.next();
      Su localSu = CA.Lv().bj(localaKw.eW());
      if ((localSu instanceof bKm))
      {
        bKm localbKm = (bKm)localSu;

        if ((localaKw.bch().DR()) && (!localbKm.isDead()) && (!localbKm.adF())) {
          f(localbKm);
          if (localbKm == byv.bFN().bFO()) {
            i = 1;
          }
        }
      }
    }
    int j = 0;
    if (i != 0) {
      try {
        j = byv.bFN().bFO().aeL().H("AnimLevelUp");

        if (j == 2147483647)
          j = 1500;
      }
      catch (Exception localException) {
        j = 0;
        K.error("Exception levee", localException);
      }
    }
    return j;
  }

  private boolean a(bKm parambKm, uP paramuP) {
    long l = paramuP.DQ();
    if (l <= 0L) {
      return false;
    }

    short s = paramuP.DO();
    parambKm.g(l, s);

    if (s <= 0) {
      return false;
    }

    if (parambKm == byv.bFN().bFO()) {
      try {
        bOU.gUc.b(new cuZ(parambKm.nU()));
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }

    return true;
  }

  private void f(bKm parambKm) {
    parambKm.aeg();
    parambKm.c(CG.bFH);
    parambKm.aeL().eq("AnimLevelUp");
    parambKm.aeL().es("AnimStatique");
  }

  protected void kO()
  {
    for (Iterator localIterator = this.eQp.iterator(); localIterator.hasNext(); ) {
      aKw localaKw = (aKw)localIterator.next();
      Su localSu = CA.Lv().bj(localaKw.eW());
      if ((localSu instanceof bKm))
      {
        bKm localbKm = (bKm)localSu;

        a(localbKm, localaKw.bch());
      }
    }
  }

  public static aTb c(bvT parambvT) { return new aTb(cXz(), parambvT.bDK()); }

}