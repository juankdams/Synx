import org.apache.log4j.Logger;

public class dbV extends mC
  implements dBv
{
  protected static final Logger K = Logger.getLogger(dbV.class);
  public static final short kUr = 0;
  public static final short kUs = 1;
  public static final short kUt = 2;
  public static final short kUu = 4;
  public static final short kUv = 8;
  private short dYr = 0;

  private boolean gjv = false;
  private short aSi = 0;
  private byte aHn = 0;
  private String kUw;
  private boolean kUx = false;
  private long gCz;
  public static final String kUy = "notify";
  public static final String aIE = "type";
  public static final String gMv = "illustrationUrl";
  public static final String kUz = "commentary";
  public static final String kUA = "commentaryEdition";
  public static final String bsP = "level";
  public static final String[] bF = { "notify", "type", "illustrationUrl", "commentary", "commentaryEdition", "level" };

  public static final String[] aOb = new String[bF.length + mC.bF.length];

  public dbV(String paramString1, String paramString2, boolean paramBoolean1, long paramLong1, boolean paramBoolean2, short paramShort, byte paramByte, String paramString3, long paramLong2)
  {
    super(paramString1, paramString2, paramBoolean1, paramLong1);
    this.gjv = paramBoolean2;
    this.aSi = paramShort;
    this.aHn = paramByte;
    this.kUw = paramString3;
    this.gCz = paramLong2;
  }

  public dbV(long paramLong, String paramString1, String paramString2) {
    super(paramLong, paramString1, paramString2);
  }

  public void dX(short paramShort)
  {
    this.dYr = ((short)(paramShort | this.dYr));
  }

  public void dY(short paramShort)
  {
    this.dYr = ((short)((paramShort ^ 0xFFFFFFFF) & this.dYr));
  }

  public boolean dZ(short paramShort)
  {
    return (this.dYr & paramShort) != 0;
  }

  public boolean cNA() {
    return this.dYr == 0;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("notify"))
      return Boolean.valueOf(cNB());
    if (paramString.equals("type"))
      return Short.valueOf(this.dYr);
    if (paramString.equals("commentary"))
      return (this.kUw != null) && (this.kUw.length() > 0) ? this.kUw : null;
    if (paramString.equals("commentaryEdition"))
      return Boolean.valueOf(this.kUx);
    if (paramString.equals("level"))
      return this.gCz == -1L ? "-" : Short.valueOf(PF.abu().cF(this.gCz));
    if (paramString.equals("illustrationUrl")) {
      if (this.aSi == -1)
        return null;
      try
      {
        return String.format(ay.bd().getString("breedContactListIllustrationPath"), new Object[] { Short.valueOf(this.aSi), Byte.valueOf(this.aHn) });
      } catch (bdh localbdh) {
        K.error(localbdh.getMessage(), localbdh);
      }
    }
    return super.getFieldValue(paramString);
  }

  public boolean cNB() {
    return this.gjv;
  }

  public void setNotify(boolean paramBoolean) {
    this.gjv = paramBoolean;
  }

  public String[] getFields()
  {
    return aOb;
  }

  public String cNC() {
    return this.kUw;
  }

  public void oP(String paramString) {
    this.kUw = paramString;
  }

  public boolean cND() {
    return this.kUx;
  }

  public void iW(boolean paramBoolean) {
    this.kUx = paramBoolean;
  }

  public void F(short paramShort) {
    this.aSi = paramShort;
  }

  public void cO(byte paramByte) {
    this.aHn = paramByte;
  }

  public void aM(long paramLong) {
    this.gCz = paramLong;
  }

  public void bot() {
    dLE.doY().a(this, aOb);
  }

  static
  {
    System.arraycopy(bF, 0, aOb, 0, bF.length);
    System.arraycopy(mC.bF, 0, aOb, bF.length, mC.bF.length);
  }
}