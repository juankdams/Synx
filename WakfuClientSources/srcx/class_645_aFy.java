public enum aFy
{
  private static int ebJ;
  private static int ebK;
  public static final aFy[] ebL;
  private final bPr ebM;
  private final short ebN;
  private final byte ebO;
  private byte ebP;
  private byte ebQ;
  private final boolean ebR;

  private aFy(bPr paramByte, short paramBoolean, byte arg5, boolean arg6)
  {
    this.ebM = paramByte;
    this.ebN = paramBoolean;
    byte b;
    this.ebO = b;
    boolean bool;
    this.ebR = bool;
  }

  public bPr aRM() {
    return this.ebM;
  }

  public boolean VD() {
    return this.ebR;
  }

  public short aRN()
  {
    return this.ebN;
  }

  public byte aRO()
  {
    return this.ebO;
  }

  public short aRP()
  {
    return (short)this.ebP;
  }

  public short aRQ() {
    return (short)this.ebQ;
  }

  public static int aRR()
  {
    return ebJ;
  }

  public static int aRS() {
    return ebK;
  }

  public static aFy[] aRT() {
    return ebL;
  }

  public static byte a(aFy paramaFy) {
    byte b = 0;
    for (aFy localaFy : values()) {
      if (localaFy == paramaFy) {
        break;
      }
      b = (byte)(b + localaFy.aRO());
    }
    return b;
  }

  public static byte b(aFy paramaFy) {
    byte b = 0;
    for (aFy localaFy : aRT()) {
      if (localaFy == paramaFy) {
        break;
      }
      b = (byte)(b + localaFy.aRO());
    }
    return b;
  }

  static
  {
    ebJ = 0;
    ebK = 0;

    int i = 0;
    for (aFy localaFy1 : values()) {
      localaFy1.ebP = a(localaFy1);
      ebJ += localaFy1.aRO();
      if (localaFy1.VD()) {
        i++;
        ebK += localaFy1.aRO();
      }
    }

    ebL = new aFy[i];
    int j = 0;
    aFy localaFy2;
    for (localaFy2 : values()) {
      if (localaFy2.VD()) {
        ebL[j] = localaFy2;
        j++;
      }
    }

    for (localaFy2 : aRT())
      localaFy2.ebQ = b(localaFy2);
  }
}