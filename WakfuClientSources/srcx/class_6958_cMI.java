import org.apache.log4j.Logger;

public class cMI
  implements Qh, bcG
{
  protected static final Logger K = Logger.getLogger(cMI.class);

  public static cMI krY = new cMI();

  public void initialize() {
    ayg.aJQ().b(this);
  }

  public void a(dMM paramdMM, cfb paramcfb1, cfb paramcfb2) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.aeQ() == null)
    {
      if ((paramdMM instanceof cew)) {
        Su localSu = ((cew)paramdMM).cbD();
        if ((localSu instanceof bKm))
          ((bKm)localSu).adq();
      }
    }
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.aeQ() == null)
    {
      if ((paramdMM instanceof cew)) {
        Su localSu = ((cew)paramdMM).cbD();
        if ((localSu instanceof bKm))
          ((bKm)localSu).adq();
      }
    }
  }
}