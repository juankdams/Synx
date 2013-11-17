import java.util.ArrayList;

public class HM
{
  private static final bep[] beo = bep.brZ();
  private static final cZc[] bQa = new cZc[32];

  final ArrayList bQb = new ArrayList();
  static final HM bQc = new HM();

  dhM eU(int paramInt)
  {
    for (int i = this.bQb.size() - 1; i >= 0; i--) {
      if (((dhM)this.bQb.get(i)).ldE == paramInt) {
        return (dhM)this.bQb.get(i);
      }
    }
    return null;
  }

  public dhM eV(int paramInt)
  {
    for (int i = this.bQb.size() - 1; i >= 0; i--) {
      if (((dhM)this.bQb.get(i)).ldE <= paramInt) {
        return (dhM)this.bQb.get(i);
      }
    }
    return null;
  }

  static HM a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    tF localtF = cwO.dV(paramInt1, paramInt2);
    if (localtF == null) {
      return bQc;
    }
    int i = localtF.BV().a(paramInt1, paramInt2, beo, 0);
    if (i == 0) {
      return bQc;
    }

    int j = localtF.BV().a(paramInt1, paramInt2, bQa, 0);

    HM localHM = new HM();

    for (int k = 0; k < i; k++) {
      int m = beo[k].aOl;
      int n = m - beo[k].io;
      if (m >= paramInt3)
      {
        if (n <= paramInt4)
        {
          if (n < paramInt3) {
            n = paramInt3;
          }

          boolean bool = (paramBoolean) && (!localtF.i(paramInt1, paramInt2, (short)m));
          if (m > paramInt4) {
            bool = false;
          }
          if (beo[k].flI == -1) {
            bool = false;
          }

          localHM.bQb.add(new dhM(n, m, bool, bQa[k].gPY));
        }
      }
    }
    return localHM;
  }

  static
  {
    for (int i = 0; i < bQa.length; i++)
      bQa[i] = new cZc();
  }
}