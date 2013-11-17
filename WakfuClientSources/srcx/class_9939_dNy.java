import org.apache.log4j.Logger;

public class dNy extends dqt
  implements bBz
{
  private int eru;
  private static final bOO aCJ = new bOO(new dfD());

  public static dNy J(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      dNy localdNy = (dNy)aCJ.Mm();
      localdNy.tX(paramInt1);
      localdNy.tY(paramInt2);
      localdNy.tZ(paramInt3);
      localdNy.eru = paramInt4;
      return localdNy;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut sur un UpdateWalletAction : ", localException);
    }
  }

  public void release()
  {
    try
    {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ()
  {
    this.eru = 0;
  }

  public void bc()
  {
  }

  private dNy()
  {
    super(0, 0, 0);
  }

  protected long mC()
  {
    byv.bFN().bFO().bHb().fO().BC(this.eru);
    return 0L;
  }

  protected void kO()
  {
    release();
  }
}