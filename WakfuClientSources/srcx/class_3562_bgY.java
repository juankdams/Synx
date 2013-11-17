import org.apache.log4j.Logger;

public class bgY extends cWV
{
  private static final Logger K = Logger.getLogger(bgY.class);
  private Su fuR;
  private boolean ehC = false;

  public bgY(Su paramSu) {
    this.fuR = paramSu;
  }

  public int getType() {
    return 2;
  }

  public void f(cew paramcew)
  {
    super.f(paramcew);
    this.ehC = false;
    paramcew.eq(bts());
  }

  private static String a(cew paramcew, String paramString1, String paramString2) {
    if (paramcew.J(paramString1)) {
      return paramString1;
    }
    return paramString2;
  }

  public void g(cew paramcew)
  {
    if (this.ehC)
      return;
    this.ehC = true;

    if ((!bB) && (paramcew == null)) throw new AssertionError();

    h(paramcew);
    paramcew.es(a(paramcew, "AnimStatique02", "AnimStatique"));
    paramcew.et(a(paramcew, "AnimHit02", "AnimHit"));
    paramcew.eq(btt());
  }

  public void h(cew paramcew) {
    boolean bool1 = paramcew.J("AnimMarche02");
    boolean bool2 = paramcew.J("AnimCourse02");
    if ((bool1) || (bool2)) {
      cRD localcRD = bool1 ? dSI.dtd() : cRD.cHZ();
      bBb localbBb = bool2 ? cdo.cgl() : bBb.bJL();
      paramcew.a(new bQA(dFc.dgE(), localcRD, localbBb));
    } else {
      paramcew.a(dFc.dgE());
    }
  }

  public boolean a(cWV paramcWV) {
    if (!super.a(paramcWV))
      return false;
    return this.fuR.uO() == ((bgY)paramcWV).fuR.uO();
  }

  protected String bts() {
    return a(this.fuR.aeL(), "AnimStatique02-Fin", "AnimStatique");
  }

  protected String btt() {
    cew localcew = this.fuR.aeL();
    return a(localcew, "AnimStatique02-Debut", localcew.atp());
  }
}