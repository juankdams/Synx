import java.util.Map;
import org.apache.log4j.Logger;

public class atX extends dqt
  implements cB
{
  public static final int dFN = -1;
  public static final int dFO = -1;
  private int bbt = -1;
  private hQ[] dFP;
  private Map dFQ;
  private int dFR = -1;
  protected boolean dFS = true;

  private final dSC dFT = new dSC(1);
  private static final String dFU = "execution_Time";
  protected bXf boY;
  private final boolean dFV;

  public atX(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);

    this.dFV = false;
  }

  public atX() {
    super(-2147483648, -2147483648, -2147483648);

    this.dFV = false;
  }

  public void c(hQ[] paramArrayOfhQ) {
    if (this.dFP == null) {
      this.dFP = paramArrayOfhQ;
      return;
    }
    int i = this.dFP.length;

    hQ[] arrayOfhQ = new hQ[i + paramArrayOfhQ.length];

    System.arraycopy(this.dFP, 0, arrayOfhQ, 0, i);
    System.arraycopy(paramArrayOfhQ, 0, arrayOfhQ, i, paramArrayOfhQ.length);

    this.dFP = arrayOfhQ;
  }

  public int zM()
  {
    return this.bbt;
  }

  public void ko(int paramInt) {
    this.bbt = paramInt;
  }

  public void d(Map paramMap) {
    this.dFQ = paramMap;
  }

  public long mC()
  {
    if (this.dFV) {
      K.error("Interruption d'une boucle infinie dans une action de script actionId=" + eo() + " scriptId=" + zM());
      return 0L;
    }

    if ((this.bbt != 0) && (this.bbt != -1)) {
      try {
        this.boY = dlD.cTt().a(this.bbt, this.dFP, this.dFQ, this, false);
        if (this.boY != null) {
          bFB localbFB = (bFB)this.dFT.get("execution_Time");

          if ((localbFB != null) && (localbFB.bNs() == bxT.gjb)) {
            this.dFS = false;
            return ((Double)localbFB.getValue()).longValue();
          }

          this.dFR = this.boY.getId();
          this.dFS = true;
          return -1L;
        }
      } catch (AssertionError localAssertionError) {
        K.error("ERREUR CRITIQUE DANS UN SCRIPT", localAssertionError);
      }
    }
    this.dFR = -1;
    bZw();
    return -1L;
  }

  public void b(bXf parambXf) {
    if ((this.dFR != parambXf.getId()) && (this.dFR != -1)) {
      K.error("on tente de finir une action de script(" + this.dFR + ") demandé par la fin d'un autre script(" + parambXf.getId() + ")");
    }

    parambXf.d(this);

    bFB localbFB = (bFB)this.dFT.get("execution_Time");
    if ((localbFB != null) && (localbFB.bNs() == bxT.gjb)) {
      this.dFS = false;
      return;
    }

    this.dFR = -1;
    if (this.dFS) {
      bZw();
      this.dFS = false;
    }

    this.boY = null;
  }

  public void a(bXf parambXf, baB parambaB, String paramString) {
    if ((!bB) && (this.dFR != parambXf.getId()) && (this.dFR != -1)) throw new AssertionError();
    parambXf.d(this);

    this.dFR = -1;
    bZw();
  }

  public void c(bXf parambXf) {
    this.dFT.put("execution_Time", parambXf.kD("execution_Time"));
  }

  public int aFX() {
    return this.dFR;
  }

  protected void kO()
  {
  }
}