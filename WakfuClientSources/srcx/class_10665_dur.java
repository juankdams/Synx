import org.apache.log4j.Logger;

public class dur
  implements Tr
{
  private static final Logger K = Logger.getLogger(dur.class);

  public cYm a(adG paramadG, rp paramrp) {
    bSl localbSl = paramrp.xZ();
    return up.a(paramadG, localbSl.getWorldX(), localbSl.getWorldY(), localbSl.getAltitude());
  }

  public boolean agw() {
    return false;
  }
}