import org.apache.log4j.Logger;

final class dUf extends dcW
{
  private static final Logger K = Logger.getLogger(dUf.class);

  public boolean a(alx paramalx) {
    long l = paramalx.AD();
    Su localSu = CA.Lv().bj(l);

    if (localSu == null) {
      K.error("Personnage id=" + l + " lors du traitement d'un " + alx.class.getSimpleName());
      return false;
    }

    lZ locallZ = new lZ();
    dju.a(locallZ, "characterName_" + localSu.getId(), localSu.getName());
    aEe localaEe = new aEe(bU.fH().getString("fight.callForHelp", new Object[] { locallZ.tP() }));
    localaEe.mm(4);
    CM.LV().a(localaEe);

    return false;
  }

  private void bJ(Su paramSu) {
    cew localcew = paramSu.aeL();
    String str = localcew.ata();
    localcew.eq("AnimEmoteCombat-Aide");
    localcew.a(new cGf(this, localcew, str));
  }
}