import org.apache.log4j.Logger;

public class dGW
  implements bOW, cvW
{
  private static dGW lRD = new dGW();
  private bnm N;
  private aeG lRE;
  protected static final Logger K = Logger.getLogger(dGW.class);

  public static dGW dhM()
  {
    return lRD;
  }

  public void au(String paramString) {
    if ((paramString != null) && (!paramString.equals("equipmentDialog")))
      cBQ.cxL().mW("equipmentDialog");
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void kU(boolean paramBoolean) {
    dLE.doY().t("equipment.inventory.enableMove", Boolean.valueOf(paramBoolean));
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    bMD localbMD;
    cRs localcRs;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 17710:
      localObject1 = (czW)paramcWG;
      localObject2 = byv.bFN().bFO();
      localbMD = ((byz)localObject2).bGP();
      localcRs = localbMD.iO(((czW)localObject1).getSourceUniqueId());
      gA localgA1 = ((czW)localObject1).getItem();

      String str1 = localbMD.gp(cqa.hZQ.wd(localgA1.ok()));
      String str2;
      if (str1 == -1) {
        str2 = bU.fH().getString("error.bagContainerFull");
        localObject3 = new aEe(str2);
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
        return false;
      }

      if (!cRs.a(localgA1, (dhJ)localObject2)) {
        str2 = bU.fH().getString("item.error.impossibilityToEquip");
        localObject3 = new aEe(str2);
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
        return false;
      }

      if (localcRs != null) {
        str2 = ((czW)localObject1).getDestinationPosition() != -1 ? ((czW)localObject1).getDestinationPosition() : str1;

        localObject3 = new crs();
        ((crs)localObject3).hQ(localgA1.oj());
        ((crs)localObject3).hT(localcRs.EN());
        ((crs)localObject3).cz(str2);
        byv.bFN().aJK().d((cWG)localObject3);
      }
      else {
        K.warn("On ne trouve pas la source de l'item que le joueur veut ajouter. Id de la source transmis : " + ((czW)localObject1).getSourceUniqueId());
      }

      return false;
    case 17711:
      localObject1 = (czW)paramcWG;

      localObject2 = byv.bFN().bFO();
      localbMD = ((byz)localObject2).bGP();

      localcRs = localbMD.iO(((czW)localObject1).getSourceUniqueId());
      if (!localcRs.isEmpty()) {
        FJ.d("error.bagNotEmpty", new Object[0]);
        return false;
      }

      long l = ((czW)localObject1).getDestinationUniqueId();
      int i = (short)((czW)localObject1).getDestinationPosition();

      if (l == localcRs.EN()) {
        FJ.d("error.sameBag", new Object[0]);
        return false;
      }

      localObject3 = localbMD.iO(l);
      if (localObject3 == null) {
        return false;
      }

      int j = localcRs.ok();
      bBn localbBn = Hh.QM().dh(j);
      gA localgA2 = gA.a(localcRs.EN(), localbBn);
      localgA2.l((short)1);
      try {
        if (!((cRs)localObject3).au(localgA2))
          return false;
      }
      catch (Exception localException) {
        return false;
      } finally {
        localgA2.release();
      }

      daV localdaV = new daV();
      localdaV.hQ(l);
      localdaV.hS(localcRs.EN());
      localdaV.cz((byte)i);
      byv.bFN().aJK().d(localdaV);

      kA(localcRs.EN());

      return false;
    case 17712:
      localObject1 = (bzu)paramcWG;
      localObject2 = new aZF();
      ((aZF)localObject2).cz(((bzu)localObject1).af());
      ((aZF)localObject2).cT(((bzu)localObject1).ah());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 16417:
      localObject1 = (ajw)paramcWG;
      localObject2 = ((ajw)localObject1).awi();
      if (localObject2 == null)
        dhN();
      else {
        c((bCJ)localObject2);
      }
      byv.bFN().bFO().bGP().bUg();

      aWc.blo().blC();
      return false;
    case 16418:
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      dhP();
      byv.bFN().bFO().bGP().bUg();

      return false;
    case 16802:
      dLE.doY().t("selectedItemInventoryDescription", null);
      localObject1 = (czW)paramcWG;
      dLE.doY().t("selectedItemInventoryDescription", ((czW)localObject1).getItem());
      return false;
    }

    return true;
  }

  public void kA(long paramLong) {
    byz localbyz = byv.bFN().bFO();
    bMD localbMD = localbyz.bGP();

    localbMD.bUg();

    localbyz.bGI();

    gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
    if ((localgA != null) && (localgA.oj() == paramLong)) {
      cpa localcpa = cBQ.cxL().coO().nf("equipmentDialog");
      if (localcpa != null)
        dLE.doY().b("itemDetail", "isEquiped", localcpa);
    }
  }

  public void dhN()
  {
    if (!byv.bFN().c(this)) {
      byv.bFN().a(this);
    }
    if (!cBQ.cxL().mZ("equipmentDialog")) {
      buj.bCk().a(cED.iyA, "equipmentDialog");
      aNL localaNL = cBQ.cxL().a("equipmentDialog", VV.dJ("equipmentDialog"), 32897L, (short)10000);

      if (localaNL == null) {
        return;
      }

      cpa localcpa = localaNL.getElementMap();
      bbp localbbp = (bbp)localcpa.fi("inventoriesScrollContainer");
      localbbp.setAutoScrollVertical(true);
      localbbp.setDndListenerContentValidator(new cCk(this));

      dLE.doY().a("editableBag", null, localcpa);
      dLE.doY().a("characterLocal", byv.bFN().bFO(), localcpa);
    }
  }

  public String c(bCJ parambCJ)
  {
    if (parambCJ != null) {
      return null;
    }
    dhN();
    return "equipmentDialog";
  }

  private void dhO()
  {
    cpa localcpa = cBQ.cxL().coO().nf("worldAndFightBarDialog");
    if (localcpa == null) {
      return;
    }
    dOc localdOc = (dOc)localcpa.fi("inventoryButton");
    if (localdOc == null) {
      return;
    }
    localdOc.getAppearance().J(gm.class);
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      dhO();
      bMD localbMD = byv.bFN().bFO().bGP();
      this.N = new cCj(this);

      cBQ.cxL().a(this.N);

      gA localgA = localbMD.cEi();
      Object localObject;
      if ((localgA != null) && (localgA.nI())) {
        localObject = new ckV(localgA);
        dLE.doY().t("pet", localObject);
      } else {
        dLE.doY().t("pet", null);
      }

      if ((localgA != null) && (localgA.nK())) {
        localgA = localgA.nH();
        localObject = new arY(localgA);
        dLE.doY().a("itemLevelController", localObject, "equipmentDialog");
      }

      dLE.doY().a("itemDetail", localgA, "equipmentDialog");

      this.lRE = new cCn(this);

      ajT.axh().a(this.lRE);

      localbMD.bUg();

      if (!cBQ.cxL().mM("wakfu.equipment")) {
        cBQ.cxL().j("wakfu.equipment", byA.class);
      }
      aWc.blo().eO(600026L);
    }
  }

  public boolean dhP() {
    cBQ.cxL().mW("equipmentDialog");
    byv.bFN().b(this);
    return false;
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      dLE.doY().a("itemDetail", null, "equipmentDialog");
      dLE.doY().t("pet", null);

      if (!byv.bFN().c(duO.dax())) {
        cBQ.cxL().mN("wakfu.equipment");
      }

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("equipmentDialog");

      ajT.axh().b(this.lRE);
      this.lRE = null;

      aWc.blo().eO(600027L);
    }
  }

  public void j(bpn parambpn) {
    parambpn.a(new cCl(this, parambpn));
  }
}