import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.log4j.Logger;

public class cOI
{
  public static final String PACKAGE = "wakfu.market";
  private static final Logger K = Logger.getLogger(cOI.class);
  private static short ivA;
  private static int kxm;
  private static FV kxn = new FV();
  private static ya kxo = null;
  private static Color kxp;
  private static Color kxq;

  public static void clean()
  {
    ivA = -1;
    kxm = -1;
    kxn = new FV();
    kxo = null;
    kxp = null;
    kxq = null;
  }

  public static void displayPage(dbi paramdbi) {
    if (paramdbi.isSelected()) {
      aHd localaHd = (aHd)paramdbi.cIl();
      int i = Integer.valueOf(localaHd.getValue()).intValue();
      dLE.doY().a("currentPage", Integer.valueOf(i), localaHd.getElementMap());
      bzu localbzu = new bzu();
      localbzu.d(19264);
      localbzu.e(i);
      cjO.clE().j(localbzu);
    }
  }

  public static void clearSearch(cSx paramcSx, br parambr, aTp paramaTp1, aTp paramaTp2, aTp paramaTp3, aTp paramaTp4, aTp paramaTp5) {
    parambr.setSelected(true);
    paramaTp1.biL();
    paramaTp2.setText("");
    paramaTp3.setText("");
    paramaTp4.setText("");
    paramaTp5.setText("");
    cPR.kzo.a(null);
    cPR.kzo.b(null);
    cPR.kzo.c(null);
    kxo = null;
    FV localFV = new FV();
    localFV.d(19253);
    cjO.clE().j(localFV);
    kxn = localFV;
  }

  public static void search(cSx paramcSx, br parambr, aTp paramaTp1, aTp paramaTp2, aTp paramaTp3, aTp paramaTp4, aTp paramaTp5) {
    int i = (!dLE.doY().getBooleanProperty("marketSearchDirty")) || (dLE.doY().getBooleanProperty("marketSearchInvalid")) ? 1 : 0;

    if ((i != 0) || (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() != 10))) {
      return;
    }

    FV localFV = new FV();
    localFV.d(19253);

    short s1 = -1;
    short s2 = -1;

    String str1 = paramaTp2.getText();
    String str2 = paramaTp3.getText();

    if ((str1 != null) && (str1.length() > 0)) {
      s1 = bUD.getShort(str1);
    }
    if ((str2 != null) && (str2.length() > 0)) {
      s2 = bUD.getShort(str2);
    }

    short s3 = -1;
    short s4 = -1;

    String str3 = paramaTp4.getText();
    String str4 = paramaTp5.getText();

    if ((str3 != null) && (str3.length() > 0)) {
      s3 = bUD.getShort(str3);
    }
    if ((str4 != null) && (str4.length() > 0)) {
      s4 = bUD.getShort(str4);
    }

    localFV.H(s1);
    localFV.I(s2);
    localFV.J(s3);
    localFV.K(s4);
    localFV.setName(paramaTp1.getText());
    localFV.aD(parambr.getSelected());

    cjO.clE().j(localFV);
    kxn = localFV;
    kxo = cPR.kzo.cGV();
  }

  public static void chooseCategory(arS paramarS, String paramString, br parambr, aTp paramaTp1, aTp paramaTp2, aTp paramaTp3, aTp paramaTp4, aTp paramaTp5) {
    try {
      bnd localbnd = (bnd)paramarS.getValue();
      ya localya = localbnd.bxx();
      dLE.doY().t("marketSearchDirty", Boolean.valueOf(localya != kxo));
      switch (Byte.parseByte(paramString)) {
      case 1:
        cPR.kzo.a(localya);
        break;
      case 2:
        cPR.kzo.b(localya);
        break;
      case 3:
        cPR.kzo.c(localya);
      }

      setSearchDirty(paramarS, localya, parambr, paramaTp1, paramaTp2, paramaTp3, paramaTp4, paramaTp5);
    } catch (Exception localException) {
      K.error("impossible de conertir l'index=" + paramString + " dans le choix de la catégorie");
    }
  }

  public static void setSearchDirty(cSx paramcSx, br parambr, aTp paramaTp1, aTp paramaTp2, aTp paramaTp3, aTp paramaTp4, aTp paramaTp5) {
    setSearchDirty(paramcSx, cPR.kzo.cGV(), parambr, paramaTp1, paramaTp2, paramaTp3, paramaTp4, paramaTp5);
  }

  public static void setSearchDirty(cSx paramcSx, ya paramya, br parambr, aTp paramaTp1, aTp paramaTp2, aTp paramaTp3, aTp paramaTp4, aTp paramaTp5) {
    int i = -1;
    int j = -1;

    String str1 = paramaTp2.getText();
    String str2 = paramaTp3.getText();

    boolean bool1 = false;
    boolean bool2 = false;

    if (paramya != kxo) {
      bool1 = true;
    }

    if ((str1 != null) && (str1.length() > 0)) {
      i = bUD.getShort(str1);
    }
    if (kxn.Qb() != i) {
      bool1 = true;
    }
    if ((str2 != null) && (str2.length() > 0)) {
      j = bUD.getShort(str2);
    }
    if (kxn.nV() != j) {
      bool1 = true;
    }
    int k = -1;
    int m = -1;

    String str3 = paramaTp4.getText();
    String str4 = paramaTp5.getText();

    if ((str3 != null) && (str3.length() > 0)) {
      k = bUD.aR(str3);
    }
    if (kxn.Qc() != k) {
      bool1 = true;
    }
    if ((str4 != null) && (str4.length() > 0)) {
      m = bUD.aR(str4);
    }
    if (kxn.Qd() != m) {
      bool1 = true;
    }

    if (!kxn.getName().equals(paramaTp1.getText())) {
      bool1 = true;
    }

    if (kxn.Qe() != parambr.getSelected()) {
      bool1 = true;
    }

    if (((i == -1) && (j == -1)) || (((i != -1) && (j != -1) && (j <= i)) || (j == 0) || (i == 0)))
    {
      if (kxp == null) {
        kxp = paramaTp2.getTextBuilder().bXY();
      }
      bool2 = true;
      if ((i != -1) && (j != -1) && (j <= i)) {
        paramaTp2.setColor(bNa.gRz, "text");
        paramaTp3.setColor(bNa.gRz, "text");
      } else if (j == 0) {
        paramaTp3.setColor(bNa.gRz, "text");
        if (i != 0)
          paramaTp2.getTextBuilder().b(kxp);
      }
      else if (i == 0) {
        paramaTp2.setColor(bNa.gRz, "text");
        if (j != 0)
          paramaTp3.getTextBuilder().b(kxp);
      }
    }
    else if (kxp != null) {
      paramaTp2.getTextBuilder().b(kxp);
      paramaTp3.getTextBuilder().b(kxp);
      kxp = null;
    }

    if (((k != -1) || (m != -1)) && (((k != -1) && (m != -1) && (m <= k)) || (m == 0) || (k == 0)))
    {
      bool2 = true;

      if (kxq == null) {
        kxq = paramaTp4.getTextBuilder().bXY();
      }
      if ((k != -1) && (m != -1) && (m <= k)) {
        paramaTp4.setColor(bNa.gRz, "text");
        paramaTp5.setColor(bNa.gRz, "text");
      } else if (m == 0) {
        paramaTp5.setColor(bNa.gRz, "text");
        if (k != 0)
          paramaTp4.getTextBuilder().b(kxq);
      }
      else if (k == 0) {
        paramaTp4.setColor(bNa.gRz, "text");
        if (m != 0)
          paramaTp5.getTextBuilder().b(kxq);
      }
    }
    else if (kxq != null) {
      paramaTp4.getTextBuilder().b(kxq);
      paramaTp5.getTextBuilder().b(kxq);
      kxq = null;
    }

    dLE.doY().t("marketSearchDirty", Boolean.valueOf(bool1));
    dLE.doY().t("marketSearchInvalid", Boolean.valueOf(bool2));
  }

  public static void nextResults(cSx paramcSx) {
    bzu.cf((short)19242);
    biy localbiy = (biy)paramcSx.cIl();
    localbiy.getAppearance().exit();
  }

  public static void prevResults(cSx paramcSx) {
    bzu.cf((short)19243);
    biy localbiy = (biy)paramcSx.cIl();
    localbiy.getAppearance().exit();
  }

  public static void startResults(cSx paramcSx) {
    bzu.cf((short)19244);
    biy localbiy = (biy)paramcSx.cIl();
    localbiy.getAppearance().exit();
  }

  public static void endResults(cSx paramcSx) {
    bzu.cf((short)19245);
    biy localbiy = (biy)paramcSx.cIl();
    localbiy.getAppearance().exit();
  }

  public static void applyAuction(cSx paramcSx) {
    if (((paramcSx instanceof ctH)) && (((ctH)paramcSx).getKeyCode() != 10)) {
      return;
    }
    bzu.cf((short)19259);
  }

  public static void cancelAuction(cSx paramcSx) {
    bzu.cf((short)19266);
  }

  public static void dropItem(Qa paramQa) {
    byA.onDropItem();
    bAO.bJl().bJo();
    if (!(paramQa.getValue() instanceof gA)) {
      K.error("Impossible de traiter un drop à cet endroit car il ne s'agit pas d'un item");
      return;
    }
    gA localgA = (gA)paramQa.getValue();
    if (byv.bFN().bFO().bGP().iQ(localgA.oj()) == null) {
      K.error("Impossible de traiter un drop à cet endroit car l'item en question n'est pas présent dans les inventaires");
      return;
    }
    boolean bool1 = paramQa.eA();
    boolean bool2 = WakfuClientInstance.awy().awB().a(bmz.fEE);
    Object localObject;
    if ((localgA.nP() > 1) && (((bool1) && (!bool2)) || ((!bool1) && (bool2))))
    {
      aTs.setMaxQuantity(localgA.nP());
      aTs.setItem(localgA);
      aTs.setMessageType((short)19258);

      localObject = new czW();
      ((czW)localObject).setItem(localgA);
      ((czW)localObject).W((short)paramQa.getScreenX());
      ((czW)localObject).X((short)paramQa.getScreenY());
      ((czW)localObject).d(16821);
      cjO.clE().j((cWG)localObject);
    } else {
      localObject = new dce();
      ((dce)localObject).ar(localgA.nP());
      ((dce)localObject).setItem(localgA);
      cjO.clE().j((cWG)localObject);
    }
    byA.onDropItem();
  }

  public static void priceChanged(cSx paramcSx) {
    String str = ((aTp)paramcSx.cIl()).getText();
    if (str.length() == 0) {
      return;
    }
    int i = Integer.parseInt(str);
    bzu localbzu = new bzu();
    localbzu.d(19260);
    localbzu.e(i);
    cjO.clE().j(localbzu);
  }

  public static void packChanged(arS paramarS) {
    if (paramarS.getSelected()) {
      aPU localaPU = (aPU)paramarS.getValue();
      cLw localcLw = new cLw();
      localcLw.b(localaPU.Hy());
      localcLw.d(19261);
      cjO.clE().j(localcLw);
    }
  }

  public static void purchaseItem(cSx paramcSx, bpn parambpn, yS paramyS) {
    ivA = 1;
    kxm = paramyS.Hv();
    dLE.doY().t("marketItemPurchase", paramyS);

    dLE.doY().t("currentItemQuantity", Short.valueOf(ivA));
    dLE.doY().t("currentItemTotalPrice", Integer.valueOf(kxm));
    dLE.doY().t("currentItemFormatedTotalPrice", DecimalFormat.getIntegerInstance().format(kxm) + " §");

    bCe localbCe = paramyS.Hy();
    dLE.doY().t("currentItemStackQtyPlusTotal", aPU.c(localbCe) + " = " + ivA * localbCe.goO);

    String str = parambpn.getElementMap().getId();
    bpn localbpn = (bpn)cBQ.cxL().a("confirmMarketPurchaseDialog", VV.dJ("confirmMarketPurchaseDialog"), 385L, (short)10000);

    localbpn.a(new cKz(localbpn));
  }

  public static void confirmPurchase(cSx paramcSx)
  {
    bbo localbbo = dLE.doY().getProperty("marketItemPurchase");
    if (localbbo != null) {
      yS localyS = (yS)localbbo.getValue();

      bzu localbzu = new bzu();
      localbzu.c(localyS.getId());
      localbzu.ar(ivA);
      localbzu.d(19262);
      cjO.clE().j(localbzu);

      cBQ.cxL().M("confirmMarketPurchaseDialog", false);
    }
  }

  public static void decreaseQuantity(cSx paramcSx) {
    if (ivA > 1) {
      ivA = (short)(ivA - 1);
      applyQuantity();
    }
  }

  public static void increaseQuantity(cSx paramcSx) {
    bbo localbbo = dLE.doY().getProperty("marketItemPurchase");
    if (localbbo == null) {
      return;
    }
    yS localyS = (yS)localbbo.getValue();
    if (ivA < localyS.nP()) {
      long l = (ivA + 1) * localyS.Hv();
      if (l > 2147483647L) {
        return;
      }
      ivA = (short)(ivA + 1);
      applyQuantity();
    }
  }

  public static void validQuantity(cSx paramcSx, aTp paramaTp) {
    bbo localbbo = dLE.doY().getProperty("marketItemPurchase");
    if (localbbo == null) {
      return;
    }
    yS localyS = (yS)localbbo.getValue();
    short s = bUD.getShort(paramaTp.getText());
    if (s < 1) {
      s = 1;
      paramaTp.setText(String.valueOf(s));
    } else if (s > localyS.nP()) {
      s = localyS.nP();
    }

    ivA = s;
    applyQuantity();
  }

  public static void setQuantity(cSx paramcSx)
  {
    bbo localbbo = dLE.doY().getProperty("marketItemPurchase");
    if (localbbo == null) {
      return;
    }
    yS localyS = (yS)localbbo.getValue();
    if ((paramcSx instanceof bXo)) {
      short s = (short)(int)((bXo)paramcSx).getValue();
      long l = s * localyS.Hv();
      if (l > 2147483647L) {
        return;
      }
      ivA = s;
      applyQuantity();
    }
  }

  public static void applyQuantity() {
    bbo localbbo = dLE.doY().getProperty("marketItemPurchase");
    if (localbbo == null) {
      return;
    }
    yS localyS = (yS)localbbo.getValue();
    kxm = ivA * localyS.Hv();
    dLE.doY().t("currentItemQuantity", Short.valueOf(ivA));
    dLE.doY().t("currentItemTotalPrice", Integer.valueOf(kxm));
    dLE.doY().t("currentItemFormatedTotalPrice", DecimalFormat.getIntegerInstance().format(kxm) + " §");
    dLE.doY().t("currentItemStackQtyPlusTotal", aPU.c(localyS.Hy()) + " = " + ivA * localyS.Hy().goO);
  }

  public static void removeItem(cSx paramcSx, aJr paramaJr)
  {
    dc(paramaJr.getId());
  }

  public static void removeItem(cSx paramcSx, yS paramyS) {
    if (paramyS.Hx()) {
      dc(paramyS.getId());
      return;
    }
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("market.removeItemConfirmation"), Cn.et(0), 25L, 102, 1);

    localcKX.a(new cKv(paramyS));
  }

  private static void dc(long paramLong)
  {
    bzu localbzu = new bzu();
    localbzu.c(paramLong);
    localbzu.d(19263);
    cjO.clE().j(localbzu);
  }

  public static void showItemDetails(cEv paramcEv) {
    if (paramcEv.getButton() != 3) {
      return;
    }

    if (!byv.bFN().c(dGW.dhM())) {
      byv.bFN().a(dGW.dhM());
    }

    bTT localbTT = (bTT)paramcEv.getItemValue();
    if (localbTT == null) {
      return;
    }
    dnm localdnm = localbTT.Hz();
    bBn localbBn = localbTT.oi();

    if (localbBn == null) {
      return;
    }

    gA localgA = gA.a(localbBn);
    localgA.b(localbBn);

    localgA.l((short)1);
    localgA.a(localdnm, false);

    String str = null;
    Object localObject1;
    if (localdnm.xH() == dIi.lTd.ewr) {
      localObject2 = new aRu(localbTT);
      localObject1 = new dkW((bbM)localObject2);
      ((ace)localObject1).d(16430);
      str = dAy.ddT().kv(((aRu)localObject2).bhS());
    } else {
      localObject1 = new cER();
      ((ace)localObject1).a(localgA);
      ((ace)localObject1).d(16415);
      str = dAy.ddT().kv(localgA.oj());
    }

    ((ace)localObject1).setX(cyb.cvg().getX());
    Object localObject2 = (dOc)paramcEv.cIl();
    ((ace)localObject1).setY(paramcEv.getScreenY() + ((dOc)localObject2).getHeight());
    cjO.clE().j((cWG)localObject1);
    bAO.bJl().d(localbBn.getId(), str);
  }

  public static void getMoneyBack(cSx paramcSx) {
    bzu.cf((short)19265);
  }

  public static void getUnsoldBack(cSx paramcSx) {
    bzu.cf((short)19267);
  }
}