import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class apH extends dqt
  implements bBz
{
  private ArrayList dvL;
  private Su Rl;
  private static final bOO aCJ = new bOO(new dHU());

  public static apH a(int paramInt1, int paramInt2, int paramInt3, Collection paramCollection)
  {
    try
    {
      apH localapH = (apH)aCJ.Mm();
      localapH.tX(paramInt1);
      localapH.tY(paramInt2);
      localapH.tZ(paramInt3);
      localapH.dvL = new ArrayList(paramCollection);

      return localapH;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public static apH a(int paramInt1, int paramInt2, int paramInt3, Su paramSu)
  {
    try {
      apH localapH = (apH)aCJ.Mm();
      localapH.tX(paramInt1);
      localapH.tY(paramInt2);
      localapH.tZ(paramInt3);
      localapH.Rl = paramSu;

      return localapH;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public void release()
  {
    try {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ() {
  }

  public void bc() {
    this.dvL = null;
    this.Rl = null;
  }

  private apH() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    int i = 75;
    int j;
    if ((this.dvL != null) && (this.dvL.size() > 0)) {
      for (j = this.dvL.size() - 1; j >= 0; j--) {
        Su localSu = (Su)this.dvL.get(j);

        int k = P(localSu);
        if (k > i) {
          i = k;
        }
      }
    }
    if (this.Rl != null) {
      j = P(this.Rl);
      if (j > i)
        i = j;
    }
    return i;
  }

  private int P(Su paramSu)
  {
    if ((paramSu instanceof byo)) {
      byo localbyo = (byo)paramSu;
      cew localcew = localbyo.aeL();
      localcew.dK((byte)-1);
      return bOJ.aF(paramSu);
    }
    if ((paramSu instanceof bKm)) {
      if (paramSu == byv.bFN().bFO()) {
        aWc.blo().blJ();
      }
      paramSu.aeL().chk();
      bOJ.aE(paramSu);
      return 0;
    }

    return 0;
  }

  protected void kO()
  {
    release();
  }
}