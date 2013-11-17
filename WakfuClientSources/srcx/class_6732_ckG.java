import org.apache.log4j.Logger;

public class ckG extends cMb
{
  private static final Logger K = Logger.getLogger(ckG.class);
  private dvz hLW;

  protected cCH ak()
  {
    return new xK(this);
  }

  public csx[] am()
  {
    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(coH.hWf.aw);
    localaXi.setName("desc.mru.openSeedSpreader");
    localaXi.b(dJO.lVM);

    csx[] arrayOfcsx = { localaXi };
    return arrayOfcsx;
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());
    d(paramdJO);

    if (paramdJO == dJO.lVM) {
      this.hLW = new dvz(this);
      byv.bFN().a(this.hLW);
      a(paramdJO);
    }

    return true;
  }

  public dvz cmu()
  {
    return this.hLW;
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
    return 8;
  }

  public EA xN() {
    if (this.krh == null)
      this.krh = new cBc(this);
    return this.krh;
  }
}