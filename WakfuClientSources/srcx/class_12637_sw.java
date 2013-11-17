import org.apache.log4j.Logger;

public class sw
{
  public static final String PACKAGE = "wakfu.characterBook.spellsPage";
  protected static Logger K = Logger.getLogger(sw.class);

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

  public static void addToShortcuts(cEv paramcEv)
  {
    if ((paramcEv.mp() == CH.bGd) && (paramcEv.getButton() == 1) && (paramcEv.ey()))
    {
      apX localapX = (apX)paramcEv.getItemValue();
      if (((dSR)localapX.bsL()).bHY()) {
        return;
      }

      cMa localcMa = new cMa();
      localcMa.setItem(localapX);
      localcMa.yx(-1);
      localcMa.setPosition(-1);
      localcMa.d(16700);
      localcMa.c(true);
      cjO.clE().j(localcMa);
    }
  }

  public static void closeDialog(cSx paramcSx)
  {
    if (byv.bFN().c(dPm.dqv()))
      byv.bFN().b(dPm.dqv());
  }

  public static void openSpellDescription(int paramInt, apX paramapX, String paramString)
  {
    aSP localaSP = new aSP();
    localaSP.b(paramapX.k(false, true));
    localaSP.nS(paramInt);
    localaSP.a(paramString);
    localaSP.d(16409);
    cjO.clE().j(localaSP);
    if (paramInt == 1)
      dLE.doY().a("describedSpell", paramapX, "spellsDialog");
  }

  public static void openSpellDescription(int paramInt, apX paramapX)
  {
    openSpellDescription(paramInt, paramapX, "spellsDialog");
  }

  public static void openSpellDescription(cEv paramcEv)
  {
    apX localapX;
    if ((paramcEv.getItemValue() instanceof apX))
      localapX = (apX)paramcEv.getItemValue();
    else {
      localapX = new apX((dSR)paramcEv.getItemValue(), (short)0, -1L);
    }
    openSpellDescription(paramcEv.getButton(), localapX);
    dad localdad = (dad)paramcEv.cIk().getElementMap().fi("tabbedContainer");
    localdad.setSelectedTabIndex(0);
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

  public static void dropOutLockedSpell(cTo paramcTo) {
    if (!dyc.a(byv.bFN().bFO())) {
      aEe localaEe = new aEe(bU.fH().getString("error.spellCantBeUnlocked"));
      localaEe.mm(3);
      CM.LV().a(localaEe);
      return;
    }
    bzu.cf((short)16435);
  }

  public static void dropLockedSpell(Qa paramQa) {
    apX localapX = (apX)paramQa.getValue();
    Mb localMb = dyc.e(byv.bFN().bFO(), ((dSR)localapX.bsL()).getId());
    if (localMb != Mb.bZc) {
      localObject = new aEe(bU.fH().getString("error.spellCantBeLocked"));
      ((aEe)localObject).mm(3);
      CM.LV().a((aEe)localObject);
      return;
    }
    Object localObject = new bMq();
    ((bMq)localObject).b(localapX);
    ((bMq)localObject).d(16436);
    cjO.clE().j((cWG)localObject);
  }
}