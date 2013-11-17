public class apD extends cGj
  implements Comparable
{
  public static final String NAME = "name";
  public static final String dvB = "categoryName";
  public static final String POINTS = "points";
  public static final String dvC = "percentPoints";
  public static final String ciu = "iconUrl";
  public static final String AF = "cost";
  public static final String aLh = "description";
  public static final String dvD = "activated";
  public static final String dvE = "isRight";
  public static final String dvF = "locked";
  public static final String[] bF = { "name", "categoryName", "points", "percentPoints", "iconUrl", "cost", "description", "activated", "isRight", "locked" };
  private dWf dvG;
  private beG dvH = beG.frR;

  public int compareTo(Object paramObject) {
    if ((paramObject instanceof apD)) {
      int i = aBy().TL();
      apD localapD = (apD)paramObject;
      int j = localapD.aBy().TL();
      return i == j ? getName().compareTo(localapD.getName()) : i - j;
    }
    return 0;
  }

  public apD(dWf paramdWf)
  {
    this.dvG = paramdWf;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("categoryName")) {
      if (this.dvG.TL() >= -5)
        return bU.fH().getString("nation.lawMinorDeliquency");
      if (this.dvG.TL() >= -20) {
        return bU.fH().getString("nation.lawMajorDeliquency");
      }
      return bU.fH().getString("nation.lawCrimeDeliquency");
    }
    int i;
    if (paramString.equals("points")) {
      i = this.dvG.TL();
      return i > 0 ? "+" + i : Integer.valueOf(i);
    }if (paramString.equals("percentPoints")) {
      i = this.dvG.TM();
      if (i == 0)
        return null;
      return i + "%";
    }if (paramString.equals("iconUrl"))
      return ay.bd().f(this.dvG.getId());
    if (paramString.equals("cost"))
      return Integer.valueOf(this.dvG.TN());
    if (paramString.equals("description"))
      return bU.fH().b(98, (int)this.dvG.getId(), new Object[0]);
    if (paramString.equals("activated")) {
      if (beG.frR == this.dvH)
        return Boolean.valueOf(apR());
      return Boolean.valueOf(aBz());
    }if (paramString.equals("locked"))
      return Boolean.valueOf(this.dvG.isLocked());
    if (paramString.equals("isRight")) {
      return Boolean.valueOf(this.dvG.TL() > 0);
    }
    return null;
  }

  private String getName() {
    return bU.fH().b(97, (int)this.dvG.getId(), new Object[0]);
  }

  private boolean apR() {
    return bPE.bWu().UI().bnz().jm(this.dvG.getId());
  }

  public dWf aBy() {
    return this.dvG;
  }

  public void a(dWf paramdWf) {
    this.dvG = paramdWf;
  }

  public boolean aBz()
  {
    return (this.dvH == beG.frT) || ((this.dvH == beG.frR) && (apR()));
  }

  public void cG(boolean paramBoolean) {
    this.dvH = (paramBoolean ? beG.frT : beG.frS);
    dLE.doY().a(this, new String[] { "activated" });
  }

  public void clean() {
    this.dvH = beG.frR;
    dLE.doY().a(this, new String[] { "activated" });
  }
}