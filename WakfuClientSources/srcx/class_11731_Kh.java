import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import org.apache.log4j.Logger;

public class Kh extends dqt
  implements bBz
{
  private static final Logger K = Logger.getLogger(Kh.class);
  private ckT aCI;
  private int bWz;
  private long bWA;
  private static final bOO aCJ = new bOO(new dcv());

  public static Kh a(int paramInt1, int paramInt2, int paramInt3, ckT paramckT, int paramInt4, long paramLong)
  {
    try
    {
      Kh localKh = (Kh)aCJ.Mm();
      localKh.tX(paramInt1);
      localKh.tY(paramInt2);
      localKh.tZ(paramInt3);
      localKh.aCI = paramckT;
      localKh.bWz = paramInt4;
      localKh.bWA = paramLong;
      return localKh;
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
    this.aCI = null;
    this.bWz = 0;
    this.bWA = 0L;
  }

  private Kh() {
    super(0, 0, 0);
  }

  protected long mC()
  {
    if ((this.aCI instanceof arl)) {
      aIH localaIH = WakfuClientInstance.awy().awB();
      try
      {
        boolean bool = localaIH.a(bmz.fEs);
        if (bool) {
          AlphaMaskCommand.eW(true);
        }
        dtV.proceedHideFightOccluders(localaIH.a(bmz.fEt));
      } catch (Exception localException1) {
        K.error("Exception levee", localException1);
      }

      long l1 = System.currentTimeMillis();
      long l2 = this.bWz - (l1 - this.bWA);
      try {
        ((arl)this.aCI).zB((int)l2);
      } catch (Exception localException2) {
        K.error("Erreur lors du début du placement : ", localException2);
      }
    } else if ((this.aCI instanceof czN)) {
      ((czN)this.aCI).a(dzm.lFJ);
    }
    return 0L;
  }

  protected void kO()
  {
    release();
  }
}