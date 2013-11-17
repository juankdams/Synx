import org.apache.log4j.Logger;

public class cz extends cMb
{
  private static final Logger K = Logger.getLogger(cz.class);

  public boolean a(dJO paramdJO, bhL parambhL) {
    if (paramdJO != dJO.lVv) {
      return false;
    }
    d(paramdJO);
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

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    ix(true);
  }

  public void bc()
  {
    super.bc();
    eu(false);
    ev(false);
    D(false);
    ix(false);
  }

  public csx[] am()
  {
    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(coH.hWq.aw);

    return new csx[] { localcsl };
  }

  public String getName()
  {
    return bU.fH().getString("guild.ladder");
  }

  public void a(abc paramabc)
  {
  }
}