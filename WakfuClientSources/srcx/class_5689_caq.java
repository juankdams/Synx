import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class caq
{
  private static final Logger K = Logger.getLogger(caq.class);
  private char hrh;
  private boK hri;
  private WA fIk;
  private final ArrayList aBf = new ArrayList(1);

  public static final caq hrj = new caq();

  public void a(WA paramWA)
  {
    this.fIk = paramWA;
    if (this.hri != null)
      this.hri.a(paramWA);
  }

  public void K(char paramChar)
  {
    this.hrh = paramChar;
  }

  public void a(alq paramalq) {
    if (!this.aBf.contains(paramalq))
      this.aBf.add(paramalq);
  }

  public void ceB()
  {
    this.aBf.clear();
  }

  public void b(alq paramalq) {
    this.aBf.remove(paramalq);
  }

  public boolean a(cWG paramcWG) {
    if (!L(this.hrh)) {
      if (this.hri != null)
        reset();
      return true;
    }
    switch (paramcWG.getId()) {
    case 19995:
      aqQ localaqQ = (aqQ)paramcWG;
      if (this.hri != null) {
        this.hri.setLocation(localaqQ.aCX(), localaqQ.aCY());
      }
      else {
        dn(localaqQ.aCX(), localaqQ.aCY());
      }
      return false;
    case 19992:
      reset();
      return true;
    }

    return true;
  }

  private static boolean L(char paramChar) {
    if (aqQ.aDb()) {
      return true;
    }
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    return localaTL.isKeyDown(paramChar);
  }

  public void ceC() {
    reset();
    this.aBf.clear();
  }

  private void reset() {
    aWe localaWe = ceD();

    localaWe.a(new dur());
    localaWe.a(aZs.fgg);
    this.hri = null;

    for (int i = 0; i < this.aBf.size(); i++)
      ((alq)this.aBf.get(i)).aya();
  }

  private void dn(int paramInt1, int paramInt2)
  {
    aWe localaWe = ceD();

    this.hri = new boK(localaWe, paramInt1, paramInt2);
    this.hri.a(this.fIk);
    localaWe.a(this.hri);
    localaWe.a(aZs.fgi);

    for (int i = 0; i < this.aBf.size(); i++)
      ((alq)this.aBf.get(i)).axZ();
  }

  private aWe ceD()
  {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    return localaTL.cKV();
  }

  public void ceE() {
    try {
      K(ay.bd().getString("magicKey").toCharArray()[0]);
    } catch (Exception localException) {
      K.error("pas d'entrer pour magicKey", localException);
      K('\000');
    }
  }
}