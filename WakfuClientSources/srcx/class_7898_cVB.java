import org.apache.log4j.Logger;

public class cVB extends cMb
{
  private static final Logger K = Logger.getLogger(cVB.class);

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    if (paramdJO != dJO.lVv) {
      return false;
    }
    d(paramdJO);
    aRs.bhJ().bhK();
    a(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public csx[] am()
  {
    return new csx[] { aiI.dfO.avt() };
  }

  public String getName()
  {
    return "TODO Clem: Lit";
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    eu(true);
    ev(true);
    this.krb = true;
    this.haI = true;
  }
}