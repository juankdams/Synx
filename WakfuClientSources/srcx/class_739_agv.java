import org.apache.log4j.Logger;

public class agv
  implements dQR
{
  private static final Logger K = Logger.getLogger(agv.class);
  private final int aw;
  private final bZA aB;
  private final short aA;
  private final int dah;
  private final int dai;
  private final int daj;
  private dIk aD = null;

  public agv(int paramInt1, short paramShort, String paramString, int paramInt2, int paramInt3, int paramInt4) {
    this.aw = paramInt1;
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramString);
    } catch (Exception localException) {
      K.error("Impossible de compiler le critère " + paramString + " sur le cannonlink " + paramInt1, localException);
    }
    this.aB = localbZA;
    this.aA = paramShort;
    this.dah = paramInt2;
    this.dai = paramInt3;
    this.daj = paramInt4;
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

  public int getId() {
    return this.aw;
  }

  public bZA F() {
    return this.aB;
  }

  public short G() {
    return this.aA;
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