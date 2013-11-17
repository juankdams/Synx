import org.apache.log4j.Logger;

public final class cby
  implements adL
{
  protected static final Logger K = Logger.getLogger(cby.class);

  private static final cby htf = new cby();

  public static cby cfu() {
    return htf;
  }

  public bWG b(Jz paramJz)
  {
    bJw localbJw = bto.bBQ().bZ(paramJz.bxv);
    if (localbJw != null) {
      bWG localbWG = new bWG(localbJw);
      localbWG.aQ(paramJz.bUp);
      localbWG.cR(paramJz.bUq);
      return localbWG;
    }
    K.error("Aucune aptitude de referenceId=" + paramJz.bxv);
    return null;
  }
}