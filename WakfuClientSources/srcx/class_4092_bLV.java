import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bLV extends cMb
  implements dBv
{
  protected static final Logger K = Logger.getLogger(bLV.class);
  public static final String gPs = "taxPercentage";

  public void aJ()
  {
    super.aJ();
    D(true);
    eu(false);
    ev(true);
  }

  public String getName()
  {
    return bU.fH().getString("ie.dimensionalBagLogConsole");
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
    switch (zP.av[paramdJO.ordinal()]) {
    case 1:
      K.info("Demande de récupération du log de transactions local");
      byv localbyv = WakfuClientInstance.awy().awz();
      bUw localbUw = new bUw();
      localbyv.aJK().d(localbUw);
      return true;
    }
    return false;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public csx[] am()
  {
    byz localbyz = byv.bFN().bFO();
    boolean bool = localbyz.bHa() == localbyz.bHb();
    csx localcsx = aiI.dfO.avt();
    localcsx.setEnabled(bool);
    return new csx[] { localcsx };
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("taxPercentage")) {
      return String.format("%.2f%%", new Object[] { Float.valueOf(0.1F) });
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public String[] getFields() {
    return null;
  }
}