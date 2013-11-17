import org.apache.log4j.Logger;

public class aju
{
  public static final String PACKAGE = "wakfu.controlCenterFight";
  private static final Logger K = Logger.getLogger(aju.class);

  public static void openCloseStateBar(cSx paramcSx)
  {
    aep.openCloseStateBar(paramcSx);
  }

  public static void dropCommand(cSx paramcSx, String paramString)
  {
    aep.dropCommand(paramcSx, paramString);
  }

  public static void fightSetDirection(arl paramarl, short paramShort)
  {
    if (!dLE.doY().getBooleanProperty("isInFightPlacement")) {
      if ((paramarl.aDp().Ia() == byv.bFN().bFO()) || (paramarl.aDp().Ia().adL() == byv.bFN().bFO()))
      {
        bzu.cf(paramShort);
      }

    }
    else if (!paramarl.aDp().AP()) {
      K.info("Changement d'orientation inutile en phase de placement. Aucune action effecutée");
      bzu.cf(paramShort);
    }
  }

  private static void p(short paramShort1, short paramShort2)
  {
    arl localarl = byv.bFN().bFO().aeQ();

    if (localarl != null) {
      fightSetDirection(localarl, paramShort2);
    }
    else
    {
      bzu.cf(paramShort1);
    }
  }

  public static void setSouthEastDirection(cSx paramcSx)
  {
    p((short)16708, (short)18004);
  }

  public static void setSouthWestDirection(cSx paramcSx)
  {
    p((short)16709, (short)18005);
  }

  public static void setNorthWestDirection(cSx paramcSx)
  {
    p((short)16707, (short)18003);
  }

  public static void setNorthEastDirection(cSx paramcSx)
  {
    p((short)16710, (short)18006);
  }
}