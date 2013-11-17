public class bDn extends cGj
{
  public static final String gyO = "xp";
  public static final String bsP = "level";
  public static final String gyP = "percentageInLevel";
  public static final String gyQ = "previousPercentageInLevel";
  public static final String[] bF = { "xp", "level", "percentageInLevel", "previousPercentageInLevel" };
  private final cOB gyR;
  private final short cZu;
  private final short gyS;
  private final String gyT;
  private final float gyU;
  private final float gyV;

  public bDn(cOB paramcOB, short paramShort, long paramLong, Long paramLong1, int paramInt)
  {
    this(paramcOB, paramShort, paramShort, paramLong, paramLong1, paramInt);
  }

  public bDn(cOB paramcOB, short paramShort1, short paramShort2, long paramLong, Long paramLong1, int paramInt) {
    this.gyR = paramcOB;
    this.cZu = paramShort1;
    this.gyS = paramShort2;
    this.gyT = f(paramShort1, paramLong);
    this.gyU = g(paramShort1, paramLong);

    if (paramLong1 == null)
      this.gyV = this.gyU;
    else if (paramLong1.longValue() < 0L) {
      this.gyV = this.gyU;
    }
    else if ((paramLong1.longValue() == -1L) || (paramInt > 0))
      this.gyV = -1.0F;
    else
      this.gyV = g(paramShort1, paramLong - paramLong1.longValue());
  }

  private String f(short paramShort, long paramLong)
  {
    return bU.fH().iK(this.gyR.cH(paramLong)) + '/' + bU.fH().iK(this.gyR.aq(paramShort));
  }

  private float g(short paramShort, long paramLong)
  {
    return this.gyR.d(paramShort, paramLong);
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if ("xp".equals(paramString)) {
      return this.gyT;
    }
    if ("level".equals(paramString)) {
      return Short.valueOf(this.gyS);
    }
    if ("percentageInLevel".equals(paramString)) {
      return Float.valueOf(this.gyU);
    }
    if ("previousPercentageInLevel".equals(paramString)) {
      return Float.valueOf(this.gyV);
    }
    return null;
  }

  public short nU() {
    return this.cZu;
  }
}