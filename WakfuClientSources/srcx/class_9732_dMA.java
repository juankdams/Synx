public class dMA
{
  public static final byte mcC = 1;
  public static final byte mcD = 2;
  public static final byte mcE = 4;
  public static final byte mcF = 8;
  public static final byte mcG = 16;
  public static final byte mcH = 32;
  public static final byte mcI = 64;
  public static final byte mcJ = -128;
  static final float mcK = 0.0039063F;
  static final float mcL = 0.007874016F;
  short aDx;

  void d(aYQ paramaYQ)
  {
  }

  public final void bP(short paramShort)
  {
    this.aDx = paramShort;
  }

  public float ahj() {
    return 1.0F;
  }

  public float ahk() {
    return 0.0F;
  }

  public float ahl() {
    return 0.0F;
  }

  public float ahm() {
    return 1.0F;
  }

  public float ahn() {
    return 0.0F;
  }

  public float aho() {
    return 0.0F;
  }

  public float ahs() {
    return 0.0F;
  }

  public float aht() {
    return 0.0F;
  }

  public float ahu() {
    return 0.0F;
  }

  public float ahv() {
    return 0.0F;
  }

  public float fh() {
    return 1.0F;
  }

  public float fi() {
    return 1.0F;
  }

  public float fj() {
    return 1.0F;
  }

  public float fk() {
    return 1.0F;
  }

  public final boolean dpo() {
    return (ahj() != 1.0F) || (ahk() != 0.0F) || (ahl() != 0.0F) || (ahm() != 1.0F);
  }

  public final boolean dpp()
  {
    return (ahn() != 0.0F) || (aho() != 0.0F);
  }

  public final boolean dpq() {
    return (ahs() != 0.0F) || (aht() != 0.0F) || (ahu() != 0.0F) || (ahv() != 0.0F);
  }

  public final boolean dpr() {
    return (fh() != 1.0F) || (fi() != 1.0F) || (fj() != 1.0F) || (fk() != 1.0F);
  }

  public void a(axM paramaxM1, axM paramaxM2) {
    paramaxM2.dNd = paramaxM1.dNd;
    paramaxM2.dMX = paramaxM1.dMX;
    paramaxM2.dMZ = paramaxM1.dMZ;
    paramaxM2.dMY = paramaxM1.dMY;
    paramaxM2.dNa = paramaxM1.dNa;

    paramaxM2.dNe = paramaxM1.dNe;
    paramaxM2.dNb = paramaxM1.dNb;
    paramaxM2.dNc = paramaxM1.dNc;

    paramaxM2.bOZ = paramaxM1.bOZ;
    paramaxM2.bPa = paramaxM1.bPa;
    paramaxM2.bPb = paramaxM1.bPb;
    paramaxM2.bPc = paramaxM1.bPc;
  }
}