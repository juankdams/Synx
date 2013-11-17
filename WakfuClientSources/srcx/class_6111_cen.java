import org.apache.log4j.Logger;

public class cen
{
  private static final Logger K = Logger.getLogger(cen.class);

  public static final cen hyv = new cen(doC.lpc);
  private final int bJt;
  private final int hyw;
  private final float[] hyx = new float[ceU.values().length];
  private final byte[] bJI;
  private final short hyy;
  private doC hyz = doC.lpc;
  private final crI hyA = new crI();
  private final cTD hyB = new cTD();

  public cen(int paramInt1, int paramInt2, float[] paramArrayOfFloat, byte[] paramArrayOfByte, short paramShort) {
    this.hyw = paramInt1;
    this.bJI = paramArrayOfByte;
    this.hyy = paramShort;
    if (this.hyx.length == paramArrayOfFloat.length) {
      System.arraycopy(paramArrayOfFloat, 0, this.hyx, 0, this.hyx.length);
    }
    this.bJt = paramInt2;
  }

  public cen(doC paramdoC) {
    this(46, 46, new float[] { 1.0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F }, bPR.EMPTY_BYTE_ARRAY, (short)0);

    this.hyz = paramdoC;
  }

  void a(cLO paramcLO) {
    paramcLO.a(new ccb(this));

    this.hyz = new dHV(paramcLO);
  }

  public short afM() {
    return this.hyy;
  }

  int b(eu parameu) {
    return this.hyA.h(parameu);
  }

  public float a(ceU paramceU) {
    return this.hyx[paramceU.ordinal()];
  }

  public int afz() {
    return this.hyA.h(eu.ayX);
  }

  public aYV afA() {
    return bMF.bUo().fk(this.hyw);
  }

  int afJ() {
    return this.bJt;
  }

  int a(int paramInt, eu parameu) {
    int i = this.hyA.h(parameu);
    float f = this.hyB.get(parameu.bJ());
    return i + (int)Math.floor(paramInt * f);
  }

  doC afL() {
    return this.hyz;
  }

  private bTI dG(byte paramByte) {
    if ((!bB) && ((paramByte < 0) || (paramByte >= this.bJI.length))) throw new AssertionError("Index de spellElement invalide");
    return bTI.dx(this.bJI[paramByte]);
  }

  public boolean c(bTI parambTI) {
    for (int i = 0; i < this.bJI.length; i++)
      if (this.bJI[i] == parambTI.bJ())
        return true;
    return false;
  }

  public void l(dGy paramdGy) {
    for (int i = 0; i < this.bJI.length; i++) {
      bTI localbTI = dG((byte)i);
      if (!paramdGy.d(localbTI))
        return;
    }
  }

  public void a(eu parameu, int paramInt) {
    this.hyA.a(parameu, paramInt);
  }
}