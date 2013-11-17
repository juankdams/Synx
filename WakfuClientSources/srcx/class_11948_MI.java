import org.apache.log4j.Logger;

public class MI
{
  public static final String PACKAGE = "wakfu.spellsRestat";
  protected static Logger K = Logger.getLogger(MI.class);

  public static void showSpellDetailPopup(cEv paramcEv, dRq paramdRq)
  {
    apX localapX = null;
    if ((paramcEv.getItemValue() instanceof apX))
      localapX = (apX)paramcEv.getItemValue();
    else if ((paramcEv.getItemValue() instanceof dSR))
    {
      localapX = new apX((dSR)paramcEv.getItemValue(), (short)0, -1L);
    }
    if (localapX != null) {
      dLE.doY().t("describedSpell", localapX);
      anG localanG = (anG)paramdRq.getElementMap().fi("spellDetailPopup");
      if ((paramcEv.mp() == CH.bGg) && (!bsP.getInstance().isDragging()))
        ayw.popup(paramcEv, localanG);
      else if (paramcEv.mp() == CH.bGf)
        ayw.closePopup(paramcEv, localanG);
    }
  }

  public static void openSpellDescription(cEv paramcEv)
  {
    int i = paramcEv.getButton();
    if (i == 3)
      return;
    apX localapX1 = (apX)paramcEv.getItemValue();
    if ((localapX1 instanceof boI))
      localapX1 = ((boI)localapX1).byq();
    apX localapX2 = (apX)dLE.doY().br("describedSpell", "spellsRestatDialog");
    if ((localapX2 != null) && (localapX2.bsP() == localapX1.bsP())) {
      return;
    }
    aSP localaSP = new aSP();
    localaSP.b(localapX1.k(false, true));
    localaSP.nS(i);
    localaSP.a("spellsRestatDialog");
    localaSP.d(16409);
    cjO.clE().j(localaSP);
    dLE.doY().a("describedSpell", localapX1, "spellsRestatDialog");
  }

  private static void b(dOc paramdOc) {
    paramdOc.getAppearance().setModulationColor(new bNa(0.4F, 0.5F, 0.62F, 1.0F));
  }

  public static void onMouseOverSpell(cSx paramcSx, dRq paramdRq)
  {
    b(paramdRq);
  }

  public static void onMouseOutSpell(cSx paramcSx, dRq paramdRq, Object paramObject) {
    if (((paramObject instanceof dSR)) && (((dSR)paramObject).isSelected()))
      return;
    if (((paramObject instanceof apX)) && (((dSR)((apX)paramObject).bsL()).isSelected())) {
      return;
    }
    paramdRq.getAppearance().setModulationColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
  }

  public static void improveSpell(cSx paramcSx, boI paramboI) {
    launchSpellLevelModification(paramcSx, paramboI, true);
  }

  public static void decreaseSpell(cSx paramcSx, boI paramboI) {
    launchSpellLevelModification(paramcSx, paramboI, false);
  }

  public static void launchSpellLevelModification(cSx paramcSx, boI paramboI, boolean paramBoolean) {
    if (dmO.lli.isRunning()) {
      return;
    }
    cek localcek = new cek();
    localcek.a(paramboI);
    localcek.d(paramBoolean ? 19351 : 19352);

    dmO.lli.a(localcek, (biy)paramcSx.cIl());
  }

  public static void valid(cSx paramcSx) {
    bzu.cf((short)19353);
  }

  public static void reset(cSx paramcSx) {
    bzu.cf((short)19354);
  }
}