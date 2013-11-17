import org.apache.log4j.Logger;

public class cLP extends cGj
{
  public static final String bHJ = "id";
  public static final String bC = "name";
  public static final String iLh = "slogan";
  public static final String iLi = "ballotCount";
  public static final String cvZ = "guildName";
  public static final String iLj = "rankDescription";
  public static final String iLk = "wakfuValue";
  public static final String iLl = "wakfuStasisDescription";
  public static final String iLm = "wakfuStasisColor";
  public static final String ceZ = "isEnabled";
  public static final String iLn = "actorDescriptorLibrary";
  public static final String iLo = "isGovernor";
  static final String[] hpV = { "id", "name", "guildName", "rankDescription", "wakfuValue", "wakfuStasisDescription", "wakfuStasisColor", "actorDescriptorLibrary", "isGovernor" };

  static final String[] iLp = { "slogan", "ballotCount", "isEnabled" };

  private static final String[] bwd = new String[iLp.length + hpV.length];

  protected static final Logger K = Logger.getLogger(cLP.class);
  private bgr iLq;
  private cew cwb;
  private static final int iLr = 10;

  public cLP(bgr parambgr)
  {
    this.iLq = parambgr;
  }

  public bgr cEO() {
    return this.iLq;
  }

  public void clear() {
    this.cwb.cbD().release();
    this.cwb = null;
  }

  public String[] getFields() {
    return bwd;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return this.iLq.getName();
    if (paramString.equals("id"))
      return Long.valueOf(this.iLq.getId());
    if (paramString.equals("slogan"))
      return ((Qy)this.iLq).acf();
    if (paramString.equals("ballotCount")) {
      aYr localaYr = bPE.bWu().UI();
      int i = localaYr.aNc().aNb();
      short s = ((Qy)this.iLq).acg();
      return i == 0 ? null : bU.fH().getString("election.ballotDescription", new Object[] { Integer.valueOf(s * 100 / i), Short.valueOf(s) });
    }
    if (paramString.equals("wakfuStasisDescription")) {
      float f = Math.abs(this.iLq.bta());
      return String.format(" : %d ", new Object[] { Integer.valueOf((int)(f * 100.0F)) }) + "%";
    }if (paramString.equals("wakfuStasisColor"))
      return this.iLq.bta() < 0.0F ? clP.gHj : clP.hOw;
    if (paramString.equals("wakfuValue"))
      return Float.valueOf(this.iLq.bta());
    if (paramString.equals("rankDescription"))
      return bU.fH().getString(dwC.dbQ().BQ(this.iLq.bsZ()).agf());
    if (paramString.equals("guildName"))
      return this.iLq.CD() == 0L ? null : this.iLq.uo();
    if (paramString.equals("actorDescriptorLibrary")) {
      if (this.cwb == null) {
        this.cwb = xc.a(this.iLq);
      }
      return this.cwb;
    }if (paramString.equals("isGovernor"))
      return Boolean.valueOf(false);
    if (paramString.equals("isEnabled")) {
      return Boolean.valueOf((this.iLq != null) && (!((Qy)this.iLq).ach()));
    }
    return null;
  }

  static
  {
    System.arraycopy(iLp, 0, bwd, 0, iLp.length);
    System.arraycopy(hpV, 0, bwd, iLp.length, hpV.length);
  }
}