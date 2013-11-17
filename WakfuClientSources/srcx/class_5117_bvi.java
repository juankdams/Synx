import org.apache.log4j.Logger;

public class bvi
  implements bwt
{
  protected static final Logger K = Logger.getLogger(bvi.class);

  public static final bvi geZ = new bvi();

  public cVo a(aRX paramaRX, btq parambtq) {
    cMb localcMb = (cMb)acs.aoN().gh(parambtq.gbV);
    if ((localcMb != null) && ((localcMb instanceof EA))) {
      EA localEA = (EA)localcMb;
      localEA.a(paramaRX);
      localEA.b(parambtq);
      return localEA;
    }
    K.error("Impossible de créer un RoomContent de templateId=" + parambtq.gbV);
    return null;
  }
}