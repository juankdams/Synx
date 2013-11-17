import org.apache.log4j.Logger;

final class bXP extends dcW
{
  private static final Logger K = Logger.getLogger(bXP.class);

  public boolean a(avv paramavv) {
    if (bGN.gDt.gDs) {
      bGN.gDt.fHf.execute();
      bGN.gDt.fHf.reset();
      bGN.gDt.gDs = false;
    } else {
      K.warn("On reçoit une fin de creation de combat mais nous ne sommes pas en phase de creation");
      return true;
    }

    return false;
  }
}