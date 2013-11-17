import org.apache.log4j.Logger;

public class cOX
{
  protected static final Logger K = Logger.getLogger(cOX.class);
  public static final String PACKAGE = "wakfu.mixDebugger";

  public static void pause(dbi paramdbi)
  {
    if (paramdbi.isSelected())
      bxU.bFg().alb();
    else
      bxU.bFg().alc();
  }

  public static void chooseSaveDirectory(cSx paramcSx) {
    bxU.bFg().bFh();
  }

  public static void save(cSx paramcSx) {
    bxU.bFg().bFi();
  }

  public static void setRefreshOn(cSx paramcSx) {
    bxU.bFg().bFj().ca(true);
  }

  public static void setRefreshOff(cSx paramcSx) {
    bxU.bFg().bFj().ca(false);
  }

  public static void forceRefresh(cSx paramcSx) {
    bxU.bFg().refresh(true);
  }

  public static void selectSoundGroup(cSx paramcSx, aKX paramaKX) {
    br localbr = (br)paramcSx.cIk();
    paramaKX.setVisible(localbr.getSelected());
  }

  public static void selectLogSoundGroup(cSx paramcSx, aKX paramaKX) {
    br localbr = (br)paramcSx.cIk();
    paramaKX.dE(localbr.getSelected());
  }
}