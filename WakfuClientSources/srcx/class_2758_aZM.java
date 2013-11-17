public class aZM extends cGj
{
  public static final String bC = "name";
  public static final String RI = "description";
  public static final String fgO = "score";
  public static final String fgP = "finished";
  public static final String fgQ = "succeeded";
  public static final String[] bF = { "name", "score", "finished", "succeeded" };
  private boolean cBd;
  private boolean fgR;
  private JF fgS;

  public aZM(JF paramJF)
  {
    this.fgS = paramJF;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return this.fgS.getName();
    }
    if (paramString.equals("description")) {
      return this.fgS.getDescription();
    }
    if (paramString.equals("score")) {
      return bU.fH().getString("arcadeDungeon.points", new Object[] { Integer.valueOf(Dz()) });
    }
    if (paramString.equals("finished")) {
      return Boolean.valueOf(this.cBd);
    }
    if (paramString.equals("succeeded")) {
      return Boolean.valueOf(this.fgR);
    }
    return null;
  }

  public String getName() {
    return this.fgS.getName();
  }

  public String getDescription() {
    return this.fgS.getDescription();
  }

  public void bz(boolean paramBoolean) {
    this.cBd = paramBoolean;
    dLE.doY().a(this, new String[] { "finished" });
  }

  public void ew(boolean paramBoolean) {
    this.fgR = paramBoolean;
    dLE.doY().a(this, new String[] { "succeeded" });
  }

  public int Dz() {
    return Math.round(this.fgS.W() * buI.bCs().bCu().cfo());
  }
}