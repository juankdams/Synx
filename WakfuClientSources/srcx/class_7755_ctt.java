import org.apache.log4j.Logger;

public class ctt extends dqt
  implements bBz
{
  private Iterable ido;
  private Su ehe;
  private Su idp;
  private static final bOO aCJ = new bOO(new bli());

  public static ctt a(int paramInt1, int paramInt2, int paramInt3, Iterable paramIterable, Su paramSu)
  {
    try
    {
      ctt localctt = (ctt)aCJ.Mm();
      localctt.tX(paramInt1);
      localctt.tY(paramInt2);
      localctt.tZ(paramInt3);
      localctt.ido = paramIterable;
      localctt.ehe = paramSu;

      return localctt;
    } catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public static ctt a(int paramInt1, int paramInt2, int paramInt3, Su paramSu1, Su paramSu2)
  {
    try {
      ctt localctt = (ctt)aCJ.Mm();
      localctt.tX(paramInt1);
      localctt.tY(paramInt2);
      localctt.tZ(paramInt3);
      localctt.idp = paramSu1;
      localctt.ehe = paramSu2;

      return localctt;
    } catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
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
  }

  public void bc()
  {
    this.ido = null;
    this.ehe = null;
    this.idp = null;
  }

  private ctt() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    cYk localcYk = this.ehe.ML();
    if (this.ido != null) {
      for (Su localSu : this.ido) {
        b(localcYk, localSu);
      }
    }

    if (this.idp != null) {
      b(localcYk, this.idp);
    }
    return 100L;
  }

  private static void b(cYk paramcYk, Su paramSu) {
    cYk localcYk = paramSu.ML();
    paramSu.c(cEi.m(paramcYk.getX() - localcYk.getX(), paramcYk.getY() - localcYk.getY()));
  }

  protected void kO()
  {
    release();
  }
}