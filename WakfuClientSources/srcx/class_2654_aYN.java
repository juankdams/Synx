import org.apache.log4j.Logger;

public class aYN extends cMb
{
  protected static final Logger K = Logger.getLogger(aYN.class);
  private static final byte feI = 0;
  private static final byte feJ = 1;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    a(paramdJO);

    boolean bool = getState() == 1;

    wy localwy = new wy();
    localwy.aj(bool);
    byv.bFN().aJK().d(localwy);

    aWc.blo().eO(bool ? 600143L : 600142L);

    d(paramdJO);
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

  public csx[] adN()
  {
    byz localbyz = byv.bFN().bFO();
    boolean bool = localbyz.bHa() == localbyz.bHb();
    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.b(dJO.lVv);
    if (getState() == 0) {
      localaXi.iT(coH.hWE.aw);
      localaXi.setName("desc.mru.dimensionalBag.unlock");
    } else {
      localaXi.iT(coH.hWF.aw);
      localaXi.setName("desc.mru.dimensionalBag.lock");
    }
    localaXi.setEnabled(bool);
    return new csx[] { localaXi };
  }

  public short OL()
  {
    return (short)(int)(bY() * 10.0F);
  }

  public void aJ()
  {
    super.aJ();
    x((short)0);
    eu(true);
    ev(true);
    ix(true);
    iz(false);
    iy(true);
  }

  public String getName()
  {
    return bU.fH().getString("bleh");
  }

  public void a(abc paramabc)
  {
  }
}