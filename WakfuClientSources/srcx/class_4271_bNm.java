import org.apache.log4j.Logger;

public class bNm extends cMb
{
  private static final Logger K = Logger.getLogger(bNm.class);

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    if (paramdJO == dJO.lVX) {
      byv.bFN().a(new JK(this));
    }
    a(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVX;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVX };
  }

  public csx[] am()
  {
    if (byv.bFN().bFO().nU() < 8)
      return null;
    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(coH.hWi.aw);
    localaXi.setName("nationSelectionBoard");
    localaXi.b(dJO.lVX);

    csx[] arrayOfcsx = { localaXi };
    return arrayOfcsx;
  }

  public String getName()
  {
    lZ locallZ = new lZ();
    locallZ.a(bU.fH().getString("nationSelectionBoard"));
    return locallZ.tP();
  }

  public void aJ()
  {
    super.aJ();
    D(true);
  }

  public void bc()
  {
    super.bc();
  }
}