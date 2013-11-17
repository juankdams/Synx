import org.apache.log4j.Logger;

final class ayu extends dcW
{
  private static Logger K = Logger.getLogger(ayu.class);

  public boolean a(Ei paramEi) {
    byz localbyz = byv.bFN().bFO();

    if ((!localbyz.adF()) || (paramEi.a() != ((arl)this.kLP).getId())) {
      K.warn("Message LOCK_FIGHT_MESSAGE reçu hors combat.");
      return false;
    }

    if (((arl)this.kLP).ad(localbyz) != paramEi.MP().Fx()) {
      return false;
    }
    ((arl)this.kLP).a(paramEi.MP());

    return false;
  }
}