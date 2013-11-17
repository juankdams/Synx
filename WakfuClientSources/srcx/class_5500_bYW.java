import org.apache.log4j.Logger;

public class bYW
{
  public static final String PACKAGE = "wakfu.characterChoice";
  private static czv fyP;
  protected static final Logger K = Logger.getLogger(bYW.class);

  private static czv hpi = null;

  private static czv hpj = null;

  private static final ddy hpk = new bo();

  public static void selectCharacter(cSx paramcSx, bKm parambKm, czv paramczv)
  {
    if (parambKm.equals(bXb.cci().cck()))
      return;
    cgZ localcgZ = new cgZ();
    localcgZ.s(parambKm);
    localcgZ.d(16510);
    cjO.clE().j(localcgZ);
    if ((fyP != null) && (!fyP.isUnloading())) {
      fyP.getAppearance().setModulationColor(bNa.gRu);
    }
    fyP = paramczv;
  }

  public static void setImage(czv paramczv) {
    fyP = paramczv;
  }

  public static void deleteCharacter(cSx paramcSx, bKm parambKm)
  {
    cgZ localcgZ = new cgZ();
    localcgZ.s(parambKm);
    localcgZ.d(16511);
    cjO.clE().j(localcgZ);
  }

  public static void createNewCharacter(cSx paramcSx)
  {
    bzu.cf((short)16413);
  }

  public static void enterWorld(cSx paramcSx, bKm parambKm)
  {
    Object localObject;
    if ((paramcSx instanceof ctH)) {
      localObject = (ctH)paramcSx;
      switch (((ctH)localObject).getKeyCode()) {
      case 10:
        break;
      default:
        return;
      }
    }
    if (parambKm != null) {
      localObject = new cgZ();
      ((cgZ)localObject).s(parambKm);
      ((cgZ)localObject).d(16514);
      cjO.clE().j((cWG)localObject);
    }
  }

  public static void enterWorldDoubleClick(cSx paramcSx, bKm parambKm)
  {
    if (parambKm != null) {
      cgZ localcgZ = new cgZ();
      localcgZ.s(parambKm);
      localcgZ.d(16514);
      cjO.clE().j(localcgZ);
    }
  }

  public static void cancelCharacterChoice(cSx paramcSx)
  {
    bzu.cf((short)16414);
  }

  public static void onMouseOverDeletionButton(cSx paramcSx, bKm parambKm, auC paramauC, anG paramanG)
  {
    if (parambKm != null)
    {
      paramauC.setAnimName("AnimEmote-Defaite");

      ayw.popup(paramcSx, paramanG);
    }
  }

  public static void onMouseOutDeletionButton(cSx paramcSx, bKm parambKm, auC paramauC, anG paramanG)
  {
    if ((parambKm != null) && (!aVQ.blh().bli()))
    {
      paramauC.setAnimName(parambKm.aeL().atp());

      ayw.closePopup(paramcSx, paramanG);
    }
  }

  public static void onMouseOverCharacter(cSx paramcSx, bKm parambKm, auC paramauC, czv paramczv)
  {
    if (parambKm != dLE.doY().rv("characterChoice.selectedCharacter"))
    {
      paramauC.setAnimName("AnimEmote-Coucou");
    }

    a(true, paramczv);
  }

  public static void onMouseOutCharacter(cSx paramcSx, bKm parambKm, auC paramauC, czv paramczv)
  {
    if (parambKm != dLE.doY().rv("characterChoice.selectedCharacter"))
    {
      paramauC.setAnimName(parambKm.aeL().atp());
    }

    a(false, paramczv);
  }

  private static void a(boolean paramBoolean, czv paramczv)
  {
    if (paramczv == fyP)
      return;
    bNa localbNa1 = new bNa(paramBoolean ? bNa.gRu : bNa.gRx);
    bNa localbNa2 = new bNa(paramBoolean ? bNa.gRx : bNa.gRu);

    paramczv.setVisible(true);
    paramczv.J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, paramczv, 0, 500, 1, false, ddp.kWG);
    localgm.a(hpk);
    paramczv.a(localgm);

    if (paramBoolean) {
      if (hpi != null) {
        a(false, hpi);
        cdD();
      }
      hpi = paramczv;
    } else {
      if (hpj != null) {
        cdE();
      }
      hpj = paramczv;
      if ((hpi != null) && (hpi == hpj))
        cdD();
    }
  }

  private static void cdD()
  {
    if (hpi == null)
      return;
    hpi.J(gm.class);
    Jg localJg = hpi.getAppearance();
    if (localJg != null)
      localJg.setModulationColor(bNa.gRx);
    hpi = null;
  }

  private static void cdE() {
    if (hpj == null)
      return;
    hpj.J(gm.class);
    hpj.setVisible(false);
    Jg localJg = hpj.getAppearance();
    if (localJg != null) {
      localJg.setModulationColor(bNa.gRu);
    }
    hpj = null;
  }

  public static void onMouseOverAnimNewCharacter(cSx paramcSx, auC paramauC)
  {
  }

  public static void onMouseOutAnimNewCharacter(cSx paramcSx, auC paramauC)
  {
  }

  public static void validRename(cSx paramcSx, aTp paramaTp)
  {
    String str = paramaTp.getText();
    Su localSu = (Su)dLE.doY().rv("characterChoice.selectedCharacter");
    if ((paramcSx == null) || (paramcSx.mp() == CH.bGw) || (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() == 10)))
    {
      str = bXy.kF(paramaTp.getText());
      if (dJt.validateCharacterCreationForm(paramaTp)) {
        long l = localSu.getId();
        K.info("Demande de renommage du personnage characterId=" + l + " en " + str);

        cKt localcKt = new cKt();
        localcKt.g(l);
        localcKt.cf(str);
        byv.bFN().aJK().d(localcKt);
      } else {
        K.info("Formulaire invalide");
      }
    } else if ((paramcSx instanceof ctH)) {
      dLE.doY().t("renameCharater.dirty", Boolean.valueOf(!str.equals(localSu.getName())));
    }
  }
}