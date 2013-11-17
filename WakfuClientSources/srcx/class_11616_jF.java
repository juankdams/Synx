import org.apache.log4j.Logger;

public class jF
  implements cUq, qT
{
  public static jF aMl = new jF();
  private cSR aMm;
  private dJe aMn;
  protected static final Logger K = Logger.getLogger(jF.class);

  public void i(cTK paramcTK)
  {
  }

  public void a(aYr paramaYr, cTK paramcTK)
  {
  }

  public void b(int paramInt, aYr paramaYr)
  {
    czd.inP.a(new cJi(this, paramInt), new bDv[] { dFa.lOv });
  }

  private void a(cTK paramcTK, int paramInt)
  {
    if (paramInt == -1)
      return;
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    if (localbyz != paramcTK) {
      return;
    }

    cvY localcvY = localbyz.cJf();
    if (localcvY == null) {
      return;
    }

    aYr localaYr = localcvY.UI();
    ayn localayn = cSE.kEZ.yY(paramInt);
    if (localayn == null) {
      return;
    }
    if (!localbyz.adF())
      localbyz.bGR();
    dLE.doY().a(bWW.ccf(), new String[] { "boughtBuffs" });

    String str1 = localayn.getName();
    crV localcrV1 = localaYr.ix(paramInt);
    if (localcrV1 == null) {
      return;
    }
    if (localcrV1.size() > 1) {
      K.error("[DESIGN] pas prévu : on a plusieurs buffs différents sur un même mdc, impossible de créer le popup de notification pour le joueur");
      return;
    }
    if (this.aMm == null) {
      this.aMm = new cSR();
      this.aMn = new dJe();
    }
    crV localcrV2 = (crV)this.aMm.get(paramInt);

    if (localcrV2 == null) {
      this.aMm.put(paramInt, localcrV1);
      this.aMn.C(paramInt, -1L);
      return;
    }

    if ((this.aMn.get(paramInt) != -1L) && (System.currentTimeMillis() - this.aMn.get(paramInt) < 150000.0D)) {
      K.info("[DESIGN] Message de changement de bonus spamé sur le mdc d'id=" + paramInt);
      return;
    }
    cHN localcHN;
    Object localObject;
    String str2;
    String str3;
    if (localcrV2.size() == 0) {
      localcHN = dPR.mji.Do(localcrV1.wm(0));
      localObject = asP.a(localcHN, false);
      if (localObject == null)
        return;
      str2 = bU.fH().getString("notification.protectorBuffAddedTitle");

      str3 = cda.createLink(bU.fH().getString("notification.protectorBuffAddedText", new Object[] { str1, localObject }), ana.dqm);
    }
    else if (localcrV1.size() == 0) {
      localcHN = dPR.mji.Do(localcrV2.wm(0));
      localObject = asP.a(localcHN, false);
      if (localObject == null)
        return;
      str2 = bU.fH().getString("notification.protectorBuffRemovedTitle");

      str3 = cda.createLink(bU.fH().getString("notification.protectorBuffRemovedText", new Object[] { str1, localObject }), ana.dqm);
    }
    else
    {
      localcHN = dPR.mji.Do(localcrV1.wm(0));
      localObject = dPR.mji.Do(localcrV2.wm(0));
      str2 = asP.a(localcHN, false);
      str3 = asP.a((cHN)localObject, false);
      if ((str2 == null) || (str3 == null))
        return;
      String str4 = bU.fH().getString("notification.protectorBuffUpdatedTitle");

      String str5 = cda.createLink(bU.fH().getString("notification.protectorBuffUpdatedText", new Object[] { str1, str3, str2 }), ana.dqm);
    }

    this.aMm.put(paramInt, localcrV1);
    this.aMn.C(paramInt, System.currentTimeMillis());
  }

  public void clean() {
    if (this.aMm != null) {
      this.aMm.clear();
      this.aMn.clear();
    }
  }
}