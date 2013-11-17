public final class aiJ
  implements ajv
{
  private final int aw;
  private final dEE cQV;
  private final String dgD;
  private final String dgE;
  private final dpg[] dgF;
  private final boolean dgG;
  private boolean dgH;
  private final boolean dgI;
  private final short aEd;
  private final short aEe;
  private final short aOl;
  private final short az;

  aiJ(int paramInt, dEE paramdEE, dpg[] paramArrayOfdpg, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    this.aw = paramInt;
    this.cQV = paramdEE;
    this.dgI = paramBoolean2;
    this.aEd = paramShort1;
    this.aEe = paramShort2;
    this.aOl = paramShort3;
    this.az = paramShort4;
    this.dgD = (paramString1 != null ? paramString1.intern() : null);
    this.dgE = (paramString2 != null ? paramString2.intern() : null);
    this.dgF = paramArrayOfdpg;
    this.dgG = paramBoolean1;
  }

  aiJ(aiJ paramaiJ, dEE paramdEE, dpg[] paramArrayOfdpg) {
    this.aw = paramaiJ.aw;
    this.cQV = paramdEE;
    this.dgD = paramaiJ.dgD;
    this.dgE = paramaiJ.dgE;
    this.dgG = paramaiJ.dgG;
    this.dgI = paramaiJ.dgI;
    this.aEd = paramaiJ.aEd;
    this.aEe = paramaiJ.aEe;
    this.aOl = paramaiJ.aOl;
    this.az = paramaiJ.az;
    this.dgF = paramArrayOfdpg;
  }

  public aXM avv() {
    return dHn.lSk.CH(this.cQV.getId());
  }

  public boolean Q() {
    return this.dgH;
  }

  void cm(boolean paramBoolean) {
    this.dgH = paramBoolean;
  }

  public int getId() {
    return this.aw;
  }

  public dEE aoq() {
    return this.cQV;
  }

  public String getShortDescription() {
    return this.dgD;
  }

  public String avw() {
    return this.dgE;
  }

  public dpg[] avx() {
    return this.dgF;
  }

  public boolean avy() {
    return this.dgG;
  }

  public void reset() {
    this.dgH = false;
  }

  public boolean avz() {
    return this.dgI;
  }

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public short IB() {
    return this.aOl;
  }

  public short D() {
    return this.az;
  }
}