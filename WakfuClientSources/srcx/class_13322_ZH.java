import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ZH extends dqt
  implements bBz
{
  private static final Logger K = Logger.getLogger(ZH.class);

  private final ArrayList cMd = new ArrayList();
  private final ArrayList cMe = new ArrayList();
  private boolean cMf = true;

  private static final bOO aCJ = new bOO(new cdd());

  public static ZH a(int paramInt1, int paramInt2, int paramInt3, Su paramSu, cYk paramcYk, boolean paramBoolean)
  {
    ZH localZH = a(paramInt1, paramInt2, paramInt3, paramSu, paramcYk);
    localZH.cMf = paramBoolean;
    return localZH;
  }

  public static ZH a(int paramInt1, int paramInt2, int paramInt3, Su paramSu, cYk paramcYk) {
    try {
      ZH localZH = (ZH)aCJ.Mm();
      localZH.tX(paramInt1);
      localZH.tY(paramInt2);
      localZH.tZ(paramInt3);
      localZH.cMd.add(paramSu);
      localZH.cMe.add(paramcYk);
      localZH.cMf = false;
      return localZH;
    } catch (Exception localException) {
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
    this.cMf = true;
  }

  public void bc() {
    this.cMd.clear();
    this.cMe.clear();
  }

  private ZH() {
    super(0, 0, 0);
  }

  protected long mC() {
    int i = 0;
    for (Su localSu : this.cMd) {
      cYk localcYk = (cYk)this.cMe.get(i);
      boolean bool = false;
      if (this.cMf)
        bool = localSu.aeL().b(localcYk, false, false);
      if (!bool)
        localSu.b(localcYk.getX(), localcYk.getY(), localcYk.IB(), false);
      i++;
    }
    return 0L;
  }

  protected void kO() {
    release();
  }

  public void a(Su paramSu, cYk paramcYk) {
    this.cMd.add(paramSu);
    this.cMe.add(paramcYk);
  }
}