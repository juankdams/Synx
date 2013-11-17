import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ahl extends dqt
  implements bBz
{
  private List dbC;
  private String bU;
  private long dbD;
  private static final bOO aCJ = new bOO(new YL());

  public static ahl a(int paramInt1, int paramInt2, int paramInt3, List paramList, String paramString, int paramInt4)
  {
    try
    {
      ahl localahl = (ahl)aCJ.Mm();
      localahl.tX(paramInt1);
      localahl.tY(paramInt2);
      localahl.tZ(paramInt3);
      localahl.dbC = paramList;
      localahl.bU = paramString;
      localahl.dbD = paramInt4;

      return localahl;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  private ahl()
  {
    super(0, 0, 0);
  }

  public void release() {
    try {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ() {
  }

  public void bc() {
    this.dbC = null;
    this.bU = null;
    this.dbD = 0L;
  }

  protected long mC()
  {
    if ((this.dbC == null) || (this.dbC.isEmpty()))
      return 0L;
    for (int i = 0; i < this.dbC.size(); i++) {
      Su localSu = (Su)this.dbC.get(i);
      localSu.aeL().eq(this.bU);
    }
    return this.dbD;
  }

  protected void kO() {
    release();
  }

  public void F(Su paramSu) {
    if (this.dbC == null)
      this.dbC = new ArrayList();
    this.dbC.add(paramSu);
  }
}