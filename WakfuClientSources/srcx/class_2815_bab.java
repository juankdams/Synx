import java.util.HashSet;
import org.apache.log4j.Logger;

public class bab extends cMb
{
  private static final Logger K = Logger.getLogger(bab.class);
  private bMg fhw;

  public csx[] am()
  {
    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(coH.hWf.aw);
    localaXi.setName("desc.mru.openResourcesCollector");
    localaXi.b(dJO.lVM);

    csx[] arrayOfcsx = { localaXi };
    return arrayOfcsx;
  }

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(true);
    ev(true);
  }

  public void n(cYk paramcYk) {
    super.n(paramcYk);

    boG().add(paramcYk);
  }

  public boolean o(cYk paramcYk) {
    return paramcYk.bg(ML());
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());
    d(paramdJO);

    if (paramdJO == dJO.lVM) {
      this.fhw = new bMg(this);
      byv.bFN().a(this.fhw);
      a(paramdJO);
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVM;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVM };
  }

  public byte bY()
  {
    return 0;
  }

  public bMg boW()
  {
    return this.fhw;
  }
}