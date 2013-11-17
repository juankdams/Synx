import org.apache.log4j.Logger;

public class dAo extends dqt
{
  private final cbQ lHh;
  private boolean lHi = false;

  public boolean hyJ = false;
  private static final int lHj = 15;

  public dAo(int paramInt1, int paramInt2, int paramInt3, aoL paramaoL)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.lHh = new cbQ();
    cHu localcHu = paramaoL.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      long l = localcHu.bic();
      this.lHh.add(l);
      fw.aCz.a(l, this);
    }
  }

  public long mC()
  {
    try {
      int i = ddE();
      if (!this.lHi) {
        return 0L;
      }
      return i;
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }return 0L;
  }

  public void gP(boolean paramBoolean)
  {
    this.hyJ = paramBoolean;
  }

  private int ddE() {
    int i = 0;
    int j = 0; for (int k = this.lHh.size(); j < k; j++) {
      long l = this.lHh.get(j);
      Su localSu = CA.Lv().bj(l);

      if (localSu != null)
      {
        if (fw.aCz.b(l, this))
        {
          cYk localcYk = fw.aCz.B(l);
          fw.aCz.A(l);

          if ((this.hyJ) || (localSu.c(dKm.lXf))) {
            localSu.q(localcYk.getX(), localcYk.getY(), localcYk.IB());
          }
          else if (localSu.ML().ac(localcYk) > 15) {
            localSu.q(localcYk.getX(), localcYk.getY(), localcYk.IB());
          }
          else
          {
            byz localbyz = byv.bFN().bFO();
            if (localSu == localbyz) {
              this.lHi = true;
              localbyz.fD(false);
              bG(localSu);
            }

            cew localcew = localSu.aeL();
            localcew.chh();

            cuB localcuB = localcew.c(localcYk, false, false);

            int m = localcuB.csW();
            int n = localcew.caw().b(localcew, m).a(localcew);
            int i1 = m * n;
            if ((localcuB.csX()) && (m > 0)) {
              if (i < i1)
                i = i1;
              localcew.a(localcuB, true);
            } else {
              localSu.q(localcYk.getX(), localcYk.getY(), localcYk.IB());
            }
          }
        }
      }
    }
    return i;
  }

  private void bG(Su paramSu) {
    aFh localaFh = new aFh(this, paramSu);

    paramSu.aeL().b(localaFh);
  }

  private void bH(Su paramSu) {
    if (paramSu == byv.bFN().bFO())
      aYX.bnY().boa();
  }

  protected void kO()
  {
    byz localbyz = byv.bFN().bFO();
    if (this.lHh.N(localbyz.getId()))
      localbyz.fD(true);
  }
}