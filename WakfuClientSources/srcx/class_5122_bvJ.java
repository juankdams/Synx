public class bvJ
  implements dBv
{
  public static final String gge = "creatureXpGain";
  public static final String ggf = "creatureLevelGain";
  public static final String ggg = "previousXpValue";
  public static final String[] bF = { "creatureXpGain", "creatureLevelGain", "previousXpValue" };
  private final aMp ggh;
  private final long ggi;
  private final int ggj;

  public bvJ(byte paramByte, long paramLong, int paramInt)
  {
    QT localQT = byv.bFN().bFO().bGo();
    this.ggh = ((aMp)localQT.aj(paramByte));
    this.ggi = paramLong;
    this.ggj = paramInt;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("creatureXpGain"))
      return bDy();
    if (paramString.equals("creatureLevelGain"))
      return bBG();
    if (paramString.equals("previousXpValue")) {
      return this.ggj > 0 ? null : Float.valueOf(this.ggh.ble().d(this.ggh.nU(), this.ggh.ayX() - this.ggi));
    }

    return this.ggh.getFieldValue(paramString);
  }

  private Object bBG() {
    return this.ggj > 0 ? bU.fH().getString("levelGain", new Object[] { Integer.valueOf(this.ggj) }) : null;
  }

  private Object bDy() {
    if (this.ggi >= 0L) {
      return '+' + bU.fH().getString("xpGain", new Object[] { Long.valueOf(this.ggi) });
    }
    return bU.fH().getString("xpGain", new Object[] { Long.valueOf(this.ggi) });
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public int bDz() {
    return this.ggj;
  }
}