import org.apache.log4j.Logger;

class dRf extends cGj
{
  public static final String mlR = "lastTimerChange";
  public static final String mlS = "formatedLastTimerChange";
  public static final String RH = "iconUrl";
  public static final String fvb = "remainingTime";
  public static final String RI = "description";
  public final String[] bF = { "description", "iconUrl", "remainingTime" };

  private long mlT = 0L;
  private boolean mlU = true;

  private dRf(avS paramavS) {  } 
  public String[] getFields() { return this.bF; }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("lastTimerChange"))
      return Long.valueOf(this.mlT);
    if (paramString.equals("formatedLastTimerChange")) {
      if (this.mlT == 0L) {
        return null;
      }
      int i = this.mlT < 0L ? 1 : 0;
      String str = (i != 0 ? "-" : "") + bXW.l(kb.I(Math.abs(this.mlT) / 1000L));
      avS.i().info("Formated last timer : " + str);
      return str;
    }if (paramString.equals("iconUrl"))
      return ay.bd().C(-1);
    if (paramString.equals("description"))
      return bU.fH().getString("nation.pvp.prisonerOf", new Object[] { drZ() });
    if (paramString.equals("remainingTime")) {
      if (this.mlU)
        return "-";
      kb localkb = kb.I(this.mlV.getRemainingTime() / 1000L);
      return bXW.l(localkb);
    }
    return null;
  }

  private String drZ() {
    return bU.fH().b(39, avS.a(this.mlV).HN(), new Object[0]);
  }

  public void ln(boolean paramBoolean) {
    this.mlU = paramBoolean;
  }

  public void kU(long paramLong) {
    this.mlT = paramLong;
    avS.i().info("LastTimerChange : " + paramLong);
    dLE.doY().a(this, new String[] { "lastTimerChange", "formatedLastTimerChange" });
  }
}