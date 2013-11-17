import org.apache.log4j.Logger;

public class aNn extends CU
{
  private static final Logger K = Logger.getLogger(aNn.class);
  private final bZA etv;
  private final int dah;
  private final int dai;
  private final int daj;
  private dIk aD;

  public aNn(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    super(paramLong, paramInt1);
    this.dah = paramInt2;
    this.dai = paramInt3;
    this.daj = paramInt4;
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramString);
    } catch (Exception localException) {
      K.error("Impossible de compiler le critère " + paramString + " sur le zaap " + paramLong, localException);
    }
    this.etv = localbZA;
  }

  public aNn(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, dFN paramdFN) {
    super(paramLong, paramInt1, paramInt5, paramdFN);
    this.dah = paramInt2;
    this.dai = paramInt3;
    this.daj = paramInt4;
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramString);
    } catch (Exception localException) {
      K.error("Impossible de compiler le critère " + paramString + " sur le zaap " + paramLong, localException);
    }
    this.etv = localbZA;
  }

  public int arR() {
    return this.dah;
  }

  public int arS() {
    return this.dai;
  }

  public int arT() {
    return this.daj;
  }

  public boolean af(dhJ paramdhJ) {
    return (this.etv == null) || (this.etv.i(paramdhJ, null, this, paramdhJ.ayL()));
  }

  public void b(dIk paramdIk) {
    this.aD = paramdIk;
  }

  public boolean H() {
    return (this.aD != null) && (!dzp.qF(this.aD.bTI()));
  }

  public dIk I() {
    return this.aD;
  }
}