import org.apache.log4j.Logger;

public class cPT
{
  private static final Logger K = Logger.getLogger(cPT.class);
  private final long aTz;
  private final int kzy;
  private final int kzz;
  private final int aJA;
  private final bZA aB;
  private final bZA kzA;
  private final boolean kzB;
  private dIk aD;

  public cPT(long paramLong, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.aTz = paramLong;
    this.kzy = paramInt1;
    this.kzz = paramInt2;
    this.aJA = paramInt3;
    this.kzB = paramBoolean;

    bZA localbZA1 = null;
    try {
      localbZA1 = aVj.hn(paramString1);
    } catch (Exception localException1) {
      K.error("[LD] Erreur au chargement du critère " + paramString1 + " du BoatLink " + paramLong, localException1);
    }
    this.aB = localbZA1;
    bZA localbZA2 = null;
    try {
      localbZA2 = aVj.hn(paramString2);
    } catch (Exception localException2) {
      K.error("[LD] Erreur au chargement du critère " + paramString2 + " du BoatLink " + paramLong, localException2);
    }
    this.kzA = localbZA2;
  }

  public long getId() {
    return this.aTz;
  }

  public int cGW() {
    return this.kzy;
  }

  public int cGX() {
    return this.kzz;
  }

  public int qW() {
    return this.aJA;
  }

  public boolean cGY() {
    return this.kzB;
  }

  public bZA F() {
    return this.aB;
  }

  public boolean a(dhJ paramdhJ, aZK paramaZK) {
    return (this.aB == null) || (this.aB.i(paramdhJ, paramaZK, this, paramdhJ.ayL()));
  }

  public boolean b(dhJ paramdhJ, aZK paramaZK) {
    return (this.kzA == null) || (this.kzA.i(paramdhJ, paramaZK, this, paramdhJ.ayL()));
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