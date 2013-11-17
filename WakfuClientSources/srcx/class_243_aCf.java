import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class aCf extends cMb
{
  private static final Logger K = Logger.getLogger(aCf.class);

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(false);
    ev(false);
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    switch (is.av[paramdJO.ordinal()]) {
    case 1:
      if (this.aTn == 1) {
        d(paramdJO);
        sM();

        byz localbyz = WakfuClientInstance.awy().awz().bFO();
        localbyz.bHa().dcf();

        return true;
      }

      break;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVA;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVA };
  }

  public byte bY()
  {
    return 0;
  }
}