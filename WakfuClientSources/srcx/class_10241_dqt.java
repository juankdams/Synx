import org.apache.log4j.Logger;

public abstract class dqt extends bSR
  implements dUd
{
  private static int bRu = 0;
  private static final int lrX = 30000;
  protected long aPT;

  public static int cXz()
  {
    if (bRu == 2147483647)
      bRu = 0;
    else {
      bRu += 1;
    }
    return bRu;
  }

  public dqt(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }

  public final void run() {
    long l = mC();
    if (l > 30000L) {
      K.error("Attention ! Une action " + getClass().getSimpleName() + " dure plus d'une minute : " + l + " ms ça parait long, il y a peut etre un probleme");

      l = 0L;
    }
    if (l == 0L)
      bZw();
    else if (l > 0L)
      this.aPT = cAo.cxf().a(this, l, -1, 1);
  }

  protected abstract long mC();

  public boolean a(cWG paramcWG)
  {
    if (paramcWG.getId() == -2147483648) {
      bZw();
      return false;
    }

    return true;
  }

  public long getId() {
    return -1L;
  }

  public void a(long paramLong)
  {
  }
}