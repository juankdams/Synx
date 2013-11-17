import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bNT extends cMb
{
  private static final Logger K = Logger.getLogger(bNT.class);

  public void aJ()
  {
    super.aJ();
    x((short)0);
    setVisible(true);
    eu(true);
    ev(true);
    D(true);
  }

  public String getName()
  {
    return bU.fH().getString("ie.dimensionalBagAdminConsole");
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  protected cCH ak()
  {
    return cCH.ivi;
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);

    byv localbyv = WakfuClientInstance.awy().awz();

    switch (cUt.av[paramdJO.ordinal()])
    {
    case 1:
      if (!localbyv.c(dFk.dgK()))
        localbyv.a(dFk.dgK());
      else {
        localbyv.b(dFk.dgK());
      }
      return true;
    case 2:
      if (!localbyv.c(beO.bsr()))
        localbyv.a(beO.bsr());
      else {
        localbyv.b(beO.bsr());
      }

      return true;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv, dJO.lWa };
  }

  public csx[] am()
  {
    byz localbyz = byv.bFN().bFO();
    boolean bool = localbyz.bHa() == localbyz.bHb();
    aXi localaXi1 = (aXi)aiI.dfP.avt();
    localaXi1.b(dJO.lVv);
    localaXi1.iT(coH.hXa.aw);
    localaXi1.setName("desc.mru.manageRooms");
    localaXi1.setEnabled(bool);

    aXi localaXi2 = (aXi)aiI.dfP.avt();
    localaXi2.b(dJO.lWa);
    localaXi2.iT(coH.hWf.aw);
    localaXi2.setName("desc.mru.manageBagAppearance");
    localaXi2.setEnabled(bool);

    return new csx[] { localaXi1, localaXi2 };
  }

  public byte bY()
  {
    return 4;
  }
}