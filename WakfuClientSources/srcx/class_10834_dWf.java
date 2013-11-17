import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class dWf
{
  protected static final Logger K = Logger.getLogger(dWf.class);
  private final long aTz;
  private final int bTU;
  private final int bTW;
  private final boolean coU;
  private final int mvq;
  private int bTV;

  protected dWf(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, Iterable paramIterable)
  {
    this.aTz = paramLong;
    this.bTU = paramInt1;
    this.bTW = paramInt2;
    this.coU = paramBoolean;
    this.mvq = amI.b(paramIterable);
  }

  public long getId() {
    return this.aTz;
  }

  public int TL() {
    return this.bTU;
  }

  public int TN() {
    return this.bTW;
  }

  public boolean isLocked() {
    return this.coU;
  }

  public void El(int paramInt) {
    this.bTV = paramInt;
  }

  public int TM() {
    return this.bTV;
  }

  public boolean TP() {
    return a(amI.dpq);
  }

  public boolean TQ() {
    return a(amI.dpr);
  }

  public boolean TR() {
    return a(amI.dps);
  }

  private boolean a(amI paramamI) {
    return (this.mvq & paramamI.mask) == paramamI.mask;
  }

  public abstract void b(List paramList);

  public abstract cQY pt();

  public abstract boolean a(bvD parambvD);

  public static List T(List paramList) {
    if ((paramList == null) || (paramList.isEmpty())) {
      return Collections.emptyList();
    }

    for (int i = paramList.size() - 1; i >= 0; i--) {
      dWf localdWf = (dWf)paramList.get(i);
      if (localdWf.TL() < 0) {
        paramList.remove(localdWf);
      }
    }
    return paramList;
  }

  public static List U(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return Collections.emptyList();
    }

    for (int i = paramList.size() - 1; i >= 0; i--) {
      dWf localdWf = (dWf)paramList.get(i);
      if (localdWf.TL() > 0) {
        paramList.remove(localdWf);
      }
    }
    return paramList;
  }
}