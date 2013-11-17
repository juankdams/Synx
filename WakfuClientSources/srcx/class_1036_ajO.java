import org.apache.log4j.Logger;

public class ajO extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(ajO.class);
  private int djr;
  private bCb djs;
  private final cCH kC;

  public ajO()
  {
    this.kC = new JV(this, 4);
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void a(abc paramabc)
  {
  }

  public int axd() {
    return this.djr;
  }

  public boolean sO()
  {
    return false;
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    a(paramdJO);
    return true;
  }

  public void al()
  {
    super.al();
    this.djs = ((bCb)aKY.epr.a(cdc.hvZ, Integer.parseInt(this.fgH)));
  }

  public byte bY()
  {
    return 8;
  }

  public dJO eR()
  {
    return dJO.lVH;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVH, dJO.lVI };
  }

  public csx[] am()
  {
    byz localbyz = byv.bFN().bFO();
    if ((localbyz.Jv()) && (!localbyz.aDj()))
      return csx.icw;
    dik localdik = (dik)aiI.dgk.avt();
    localdik.Ah(this.djs.gC());
    return new csx[] { localdik };
  }

  public void bc()
  {
    super.bc();
    D(false);
    ev(false);
    this.djs = null;
  }

  public void aJ()
  {
    super.aJ();
    D(true);
    ev(true);
    this.djr = 0;
    if ((!bB) && (this.djs != null)) throw new AssertionError();
  }

  public String getName()
  {
    return bU.fH().b(101, this.djs.getId(), new Object[0]);
  }

  public String axe() {
    return bU.fH().b(102, this.djs.axd(), new Object[0]);
  }

  public diP tj()
  {
    return null;
  }
}