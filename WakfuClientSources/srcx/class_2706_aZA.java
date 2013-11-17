import java.util.Date;

public class aZA extends cGj
{
  public static final aZA fgu = new aZA();
  public static final String cTv = "title";
  public static final String fgv = "isEmpty";
  public static final String fgw = "timeStateText";
  public static final String dQQ = "remainingTime";
  private Date fgx = new Date();

  public void j(long paramLong, boolean paramBoolean) {
    if (paramLong > 0L) {
      this.fgx.setTime(System.currentTimeMillis() + paramLong);
      if (paramBoolean)
        bos();
    }
  }

  public void bos() {
    cAo.cxf().b(beK.bsq());
    cAo.cxf().a(beK.bsq(), 1000L, -1);
    bot();
  }

  private short azB() {
    long l = System.currentTimeMillis();
    return (short)(int)Math.max(0L, (this.fgx.getTime() - l) / 1000L);
  }

  public void Pp() {
    dLE.doY().a(this, new String[] { "timeStateText", "remainingTime" });
  }

  public void bot()
  {
    dLE.doY().a(this, new String[] { "title", "isEmpty", "timeStateText", "remainingTime" });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title"))
      return bU.fH().getString("challenge.state.waitingNext");
    if (paramString.equals("isEmpty"))
      return Boolean.valueOf(true);
    if (paramString.equals("timeStateText")) {
      lZ locallZ = new lZ();
      locallZ.tI().a(bU.fH().getString("challenge.remainingTime", new Object[] { bhc.bN(azB()) })).tJ();
      return locallZ.tP();
    }if (paramString.equals("remainingTime"))
      return bhc.bN(azB());
    if (paramString.equals("isChaos")) {
      return Boolean.valueOf(false);
    }
    return null;
  }
}