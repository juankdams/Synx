import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dCm extends cMb
{
  protected static final Logger K = Logger.getLogger(dCm.class);

  public void aJ()
  {
    super.aJ();
    D(true);
    eu(false);
    ev(true);
  }

  public String getName()
  {
    return bU.fH().getString("ie.dimensionalBagPermissionsConsole");
  }

  public void a(abc paramabc)
  {
  }

  protected cCH ak()
  {
    return cCH.ivi;
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    switch (aSM.av[paramdJO.ordinal()]) {
    case 1:
      byv localbyv = WakfuClientInstance.awy().awz();
      abl localabl = abl.anK();
      if (!localbyv.c(localabl))
        localbyv.a(localabl);
      else {
        localbyv.b(localabl);
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
    return new dJO[] { dJO.lVv };
  }

  public csx[] am() {
    byz localbyz = byv.bFN().bFO();
    boolean bool = localbyz.bHa() == localbyz.bHb();
    csx localcsx = aiI.dfO.avt();
    localcsx.setEnabled(bool);
    return new csx[] { localcsx };
  }
}