public class cNB
{
  protected static Runnable kta;
  private static dBv ktb;
  public static final int ktc = 0;
  public static final int ktd = 7;

  public static void openItemDetailWindow(cEv paramcEv, bpn parambpn)
  {
    if ((paramcEv.getItemValue() instanceof cty))
      return;
    Object localObject1;
    Object localObject2;
    gA localgA;
    if ((paramcEv.getItemValue() instanceof col)) {
      localObject1 = ((col)paramcEv.getItemValue()).aQC();
      localObject2 = Hh.QM().dh(((bCJ)localObject1).ok());
      localgA = new gA(((bCJ)localObject1).EN());
      localgA.b((bBn)localObject2);
    } else if ((paramcEv.getItemValue() instanceof chd)) {
      localgA = ((chd)paramcEv.getItemValue()).cjm();
    } else {
      localgA = (gA)paramcEv.getItemValue();
    }

    if (localgA == null) {
      return;
    }

    if (paramcEv.getButton() == 3)
    {
      if (localgA.nI()) {
        localObject1 = new ckV(localgA);
        if (kta == null)
          a((ckV)localObject1, parambpn);
      }
      else {
        showItemPopupMenu(localgA, parambpn);
      }
      localObject1 = (ccG)parambpn.getElementMap().fi("itemList");
      if (localObject1 != null)
        ((ccG)localObject1).setSelectedValue(null);
    }
    else if (paramcEv.getButton() == 1) {
      localObject1 = ktb;
      ktb = (dBv)paramcEv.getItemValue();
      localObject2 = (ckV)dLE.doY().rv("pet");

      ckV localckV = null;
      arY localarY = null;
      if (localgA.nK()) {
        localgA = localgA.nH();
        localarY = new arY(localgA);
      } else if (localgA.nI()) {
        localckV = new ckV(localgA);
        if (kta == null) {
          a(localckV, parambpn);
        }
      }

      dLE.doY().a("itemLevelController", localarY, "equipmentDialog");
      dLE.doY().a("itemDetail", localgA, "equipmentDialog");
      dLE.doY().t("pet", localckV);

      if (localObject1 != null) {
        dLE.doY().a((dBv)localObject1, ((dBv)localObject1).getFields());
      }

      if (localckV != null)
        aCg.aOq().aOs();
      else {
        aCg.aOq().aOu();
      }

      if ((localObject2 != null) && (aCg.aOq().aOt())) {
        ((ckV)localObject2).clean();
      }

      ccG localccG = (ccG)parambpn.getElementMap().fi("itemList");
      if (localccG != null)
        localccG.setSelectedValue(localgA);
    }
  }

  public static void changeDirection(dMr paramdMr, auC paramauC)
  {
    int i = paramdMr.getButton();
    if ((i != 1) && (i != 3)) {
      return;
    }

    int j = i == 1 ? -1 : 1;
    int k = (paramauC.getDirection() + j) % 8;
    if (k < 0) {
      k = 7;
    }
    paramauC.setDirection(k);

    paramauC.setDirection(k);
  }

  private static void a(ckV paramckV, bpn parambpn)
  {
    kta = new dvT(paramckV, parambpn);

    dka.cSF().a(kta, 600L, 1);
  }

  public static void cancelPetDetailRunner() {
    dka.cSF().j(kta);
    kta = null;
  }

  public static void customizePet(dMr paramdMr) {
    ckV localckV = (ckV)dLE.doY().rv("pet");
    customizePet(localckV, null);
  }

  public static void customizePet(ckV paramckV, bpn parambpn) {
    dkW localdkW = new dkW(paramckV);
    localdkW.d(19152);
    localdkW.dX(parambpn == null ? "equipmentDialog" : parambpn.getElementMap().getId());
    cjO.clE().j(localdkW);
  }

  public static void showItemPopupMenu(gA paramgA, bpn parambpn)
  {
    if (!byv.bFN().c(dGW.dhM())) {
      byv.bFN().a(dGW.dhM());
    }
    cER localcER = new cER();
    localcER.d(16415);
    localcER.dX(parambpn != null ? parambpn.getElementMap().getId() : null);
    localcER.a(paramgA);
    cjO.clE().j(localcER);
  }

  public static void changePetItemBackground(dMr paramdMr, anG paramanG) {
    String str = "";
    dOc localdOc = (dOc)paramdMr.cIl().getElementMap().fi("petContainer");
    if (paramdMr.mp() == CH.bGs)
      str = "itemSelectedBackground";
    else if (paramdMr.mp() == CH.bGt) {
      str = dLE.doY().rv("pet") != null ? "itemSelectedBackground" : "itemBackground";
    }
    localdOc.setStyle(str);
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        ayw.popup(paramdMr, paramanG, localdOc);
      else
        ayw.closePopup(paramdMr);
  }

  public static void changeItemBackground(dMr paramdMr, dBv paramdBv, gA paramgA, String paramString, bpn parambpn, anG paramanG, boolean paramBoolean)
  {
    String str = "";
    dOc localdOc1 = (dOc)paramdMr.cIl();

    byz localbyz = byv.bFN().bFO();
    if ((aYP.feK.bnR() != null) && ((dLE.doY().rv("exchange.sourceBag") instanceof bCJ)))
    {
      return;
    }

    if (paramString != null)
      paramgA = (gA)localbyz.ayJ().dB(Short.parseShort(paramString));
    int i;
    if (paramgA != null) {
      i = 0;
      if (paramdMr.mp() == CH.bGs) {
        i = 1;
        if (paramgA.oi().bKk() != 0)
          str = "itemSetSelectedBackground";
        else
          str = "itemSelectedBackground";
      }
      else if (paramdMr.mp() == CH.bGt) {
        str = cQI.aH(paramgA);
      }
      localdOc1.setStyle(str);
      if ((paramBoolean) && (paramgA.oi().bKk() != 0))
      {
        bZH localbZH = localbyz.ayJ();
        for (gA localgA : localbZH) {
          if (localgA.oi().bKk() == paramgA.oi().bKk()) {
            int j = localbyz.ayJ().n(localgA);
            cpa localcpa = parambpn.getElementMap();
            axU localaxU = (axU)localcpa.fi("EquipRC" + j);
            if (localaxU != null) {
              dOc localdOc2 = (dOc)localaxU.getInnerElementMap().fi("Equip" + j);
              if (localdOc2 != null) {
                if (i != 0)
                  str = "itemSetSelectedBackground";
                else {
                  str = cQI.c(localgA, localcpa.getId());
                }
                localdOc2.setStyle(str);
              }
            }
          }
        }
      }
    }
    if (paramanG != null)
      if (paramdMr.mp() == CH.bGs)
        cDS.showPopup(paramdMr, paramgA, paramanG, localdOc1);
      else
        cDS.closePopup(paramdMr);
  }
}