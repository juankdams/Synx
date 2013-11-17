import org.apache.log4j.Logger;

public class dJt
{
  public static final String PACKAGE = "wakfu.characterCreation";
  private static boolean lUY = false;

  protected static final Logger K = Logger.getLogger(dJt.class);
  private static bKm hER;
  public static final int ktc = 0;
  public static final int ktd = 7;

  public static void setCreateCharacterFlag(boolean paramBoolean)
  {
    lUY = paramBoolean;
  }

  public static void cancelCharacterCreation(cSx paramcSx)
  {
    bzu.cf((short)16513);
  }

  public static boolean validateCharacterCreationForm(aTp paramaTp)
  {
    if (paramaTp != null) {
      String str1 = paramaTp.getText();
      String str2 = bXy.kF(str1);
      if (!str2.equals(str1))
        paramaTp.setTextImmediate(str2);
      return eX.checkNameValidity(str2);
    }
    return false;
  }

  public static void stopCharacterNameTween(cSx paramcSx) {
    Jd.Ss().Sx();
  }

  public static void createCharacter(cSx paramcSx, aTp paramaTp)
  {
    stopCharacterNameTween(paramcSx);
    if ((paramcSx == null) || (paramcSx.mp() == CH.bGw) || (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() == 10)))
    {
      if (validateCharacterCreationForm(paramaTp)) {
        if (!lUY)
        {
          cgZ localcgZ = new cgZ();
          localcgZ.a(paramaTp.getText());
          localcgZ.d(16512);
          cjO.clE().j(localcgZ);
          lUY = true;
        }
      }
      else K.info("Formulaire invalide");
    }
  }

  public static void setCharacterSex(dbi paramdbi)
  {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      cgZ localcgZ = new cgZ();
      localcgZ.a(Byte.valueOf(localaHd.getValue()).byteValue());
      localcgZ.d(16516);
      cjO.clE().j(localcgZ);
    }
  }

  public static void setCharacterHairColorIndex(cSx paramcSx, Integer paramInteger1, Integer paramInteger2)
  {
    cgZ localcgZ = new cgZ();
    localcgZ.ar(bCO.l(paramInteger1.byteValue(), paramInteger2.byteValue()));

    localcgZ.d(16517);
    cjO.clE().j(localcgZ);

    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    dRq localdRq1 = (dRq)localcpa.fi("eastContainer");
    dRq localdRq2 = (dRq)localcpa.fi("colorFactorContainer");
    ccG localccG = (ccG)localcpa.fi("hairColorsList");
    localdRq2.setY(localccG.getY(localdRq1) + localccG.getHeight() + 5);
    localdRq2.setX(localccG.getX(localdRq1) - 10);
  }

  public static void setCharacterSkinColorIndex(cSx paramcSx, Integer paramInteger1, Integer paramInteger2)
  {
    cgZ localcgZ = new cgZ();
    localcgZ.ar(bCO.l(paramInteger1.byteValue(), paramInteger2.byteValue()));

    localcgZ.d(16518);
    cjO.clE().j(localcgZ);

    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    dRq localdRq1 = (dRq)localcpa.fi("eastContainer");
    dRq localdRq2 = (dRq)localcpa.fi("colorFactorContainer");
    ccG localccG = (ccG)localcpa.fi("skinColorsList");
    localdRq2.setY(localccG.getY(localdRq1) + localccG.getHeight() + 5);
    localdRq2.setX(localccG.getX(localdRq1) - 10);
  }

  public static void setCharacterPupilColorIndex(cSx paramcSx, Integer paramInteger1, Integer paramInteger2)
  {
    cgZ localcgZ = new cgZ();
    localcgZ.ar(bCO.l(paramInteger1.byteValue(), paramInteger2.byteValue()));
    localcgZ.d(16524);
    cjO.clE().j(localcgZ);
  }

  public static void setRandomCharacterName(cSx paramcSx, aTp paramaTp)
  {
    bKm localbKm = (bKm)dLE.doY().rv("characterCreation.editablePlayerInfo");
    localbKm.setName(dlV.cTw().cTF());
    paramaTp.setText(localbKm.getName());
    Jd.Ss().Sx();
  }

  public static void openMainSpellDescription(cEv paramcEv, ccG paramccG, anG paramanG)
  {
    if ((paramcEv.getItemValue() != null) && ((paramcEv.getItemValue() instanceof dSR))) {
      dLE localdLE = cBQ.cxL().coO().czu();
      localdLE.t("characterCreation.describedMainSpell", paramcEv.getItemValue());
      ayw.popup(paramanG, paramccG);
    }
  }

  public static void validDetailedColorChoice(cSx paramcSx) {
    dLE localdLE = dLE.doY();
    localdLE.t("characterCreation.skinColorChosen", null);
    localdLE.t("characterCreation.hairColorChosen", null);
    localdLE.t("characterCreation.pupilColorChosen", null);
  }

  public static void changeDirectionClockWise(dMr paramdMr, auC paramauC)
  {
    if (paramdMr.getButton() != 1) {
      return;
    }
    if (Jd.Ss().SL()) {
      return;
    }
    int i = paramauC.getDirection() + 1 > 7 ? 0 : paramauC.getDirection() + 1;
    paramauC.setAnimName("AnimStatique");
    paramauC.setDirection(i);
    bKm localbKm = (bKm)dLE.doY().rv("characterCreation.editablePlayerInfo");
    localbKm.c(CG.eu(i));
  }

  public static void changeDirectionCounterClockwise(dMr paramdMr, auC paramauC)
  {
    if (paramdMr.getButton() != 1) {
      return;
    }
    if (Jd.Ss().SL()) {
      return;
    }
    int i = paramauC.getDirection() - 1 < 0 ? 7 : paramauC.getDirection() - 1;
    paramauC.setAnimName("AnimStatique");
    paramauC.setDirection(i);
    bKm localbKm = (bKm)dLE.doY().rv("characterCreation.editablePlayerInfo");
    localbKm.c(CG.eu(i));
  }

  public static void cancelDetailedColorChoice(cSx paramcSx) {
    Jd.Ss().SH();
    validDetailedColorChoice(paramcSx);
  }

  public static void selectBreed(cEv paramcEv)
  {
    dcT localdcT = new dcT();
    localdcT.d(16515);
    localdcT.b((UT)paramcEv.getItemValue());
    cjO.clE().j(localdcT);
  }

  public static void overBreed(cEv paramcEv) {
    dLE.doY().t("characterCreation.breedOver", paramcEv.getItemValue());
  }

  public static void outBreed(cEv paramcEv) {
    dLE.doY().t("characterCreation.breedOver", null);
  }

  public static void setNextHairStyle(cSx paramcSx)
  {
    bzu.cf((short)16525);
  }

  public static void setPreviousHairStyle(cSx paramcSx) {
    bzu.cf((short)16526);
  }

  public static void setNextDressStyle(cSx paramcSx) {
    bzu.cf((short)16527);
  }

  public static void setPreviousDressStyle(cSx paramcSx) {
    bzu.cf((short)16528);
  }

  public static void setRandomCharacterColors(cSx paramcSx)
  {
    bzu.cf((short)16529);
  }
}