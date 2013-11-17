import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ccQ extends dqt
  implements bBz
{
  private ArrayList hvB;
  private static final bOO aCJ = new bOO(new bWI());

  public static ccQ a(int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    try
    {
      ccQ localccQ = (ccQ)aCJ.Mm();
      localccQ.tX(paramInt1);
      localccQ.tY(paramInt2);
      localccQ.tZ(paramInt3);
      localccQ.Q(paramArrayList);

      return localccQ;
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
    this.hvB = null;
  }

  private ccQ() {
    super(0, 0, 0);
  }

  protected long mC() {
    for (cvW localcvW : this.hvB) {
      byv.bFN().a(localcvW);
    }
    return 0L;
  }

  protected void kO() {
    release();
  }

  public void Q(ArrayList paramArrayList) {
    this.hvB = paramArrayList;
  }
}