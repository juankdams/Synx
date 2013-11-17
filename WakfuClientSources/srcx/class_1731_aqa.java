import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class aqa extends bHF
  implements dBv
{
  public static final String dxp = "exchangeId";
  public static final String dxq = "localItemsExchange";
  public static final String dxr = "remoteItemsExchange";
  public static final String dxs = "localMoneyExchange";
  public static final String dxt = "remoteMoneyExchange";
  public static final String dxu = "remoteUserState";
  public static final String dxv = "localUserState";
  public static final String[] bF = { "exchangeId", "localItemsExchange", "remoteItemsExchange", "localMoneyExchange", "remoteMoneyExchange", "remoteUserState", "localUserState" };

  private cKX dxw = null;

  private static final NumberFormat dxx = DecimalFormat.getIntegerInstance();

  private byte dpP = 0;

  public aqa(cPO paramcPO1, cPO paramcPO2) {
    super(paramcPO1.getId(), paramcPO2.getId());
    a(paramcPO1, paramcPO2);
  }

  protected boolean a(cPO paramcPO)
  {
    paramcPO.bUC().q(true, false);

    cqH localcqH = new cqH(this);
    if (localcqH.fV()) {
      paramcPO.a(localcqH);
      localcqH.begin();
      return true;
    }
    return false;
  }

  protected void b(cPO paramcPO)
  {
    cqH localcqH = paramcPO.cGJ();
    if (localcqH != null)
      paramcPO.cGL();
  }

  public void c(cKX paramcKX)
  {
    this.dxw = paramcKX;
  }

  public cKX aBW() {
    return this.dxw;
  }

  public boolean aBX() {
    return ((cPO)this.gGb).aeI();
  }

  protected boolean aBY()
  {
    return true;
  }

  protected boolean aBZ()
  {
    return true;
  }

  protected boolean aCa()
  {
    if (this.dpP != 0) {
      return false;
    }
    return true;
  }

  protected boolean aCb()
  {
    return false;
  }

  public void g(long paramLong, int paramInt) {
    cPO localcPO = (cPO)gI(paramLong);
    if (localcPO == null) {
      K.error("[Trade] On essaye de modifier les kamas d'un echange pour un utilisateur qui n'y est pas");
      return;
    }

    if (paramInt < 0) {
      K.error("[Trade] Impossible de placer une quantité négative de kamas dans l'échange. La quantité de monnaie donnée par " + localcPO.getName() + " n'a pas été mise a jour");

      return;
    }

    ((cPO)this.gGb).dq(false);
    ((cPO)this.gGc).dq(false);

    int i = paramInt;

    if (localcPO.aeI()) {
      i = localcPO.cHk() - paramInt;
    }

    localcPO.yQ(paramInt);

    K.info("[Trade] Le joueur " + localcPO.getName() + " mets la somme de kamas à " + paramInt);

    a(bvI.a(this, dxK.lEE, paramLong, i));
  }

  public void a(cPO paramcPO, gA paramgA, short paramShort) {
    super.b(paramcPO, paramgA, paramShort);
    K.info("[Trade] Le joueur " + paramcPO.getName() + " ajoute " + paramShort + "x" + paramgA.getName() + " (refId=" + paramgA.ok() + ")");
  }

  public void b(cPO paramcPO, gA paramgA, short paramShort)
  {
    super.a(paramcPO, paramgA, paramShort);
    K.info("[Trade] Le joueur " + paramcPO.getName() + " retire " + paramShort + "x" + paramgA.getName() + " (refId=" + paramgA.ok() + ")");
  }

  protected void aCc()
  {
    cPO localcPO1 = aCk();
    cPO localcPO2 = aCl();

    if ((!bB) && ((localcPO1 == null) || (localcPO2 == null))) throw new AssertionError();

    K.info("[Trade] Fin de l'échange");
    String str = "[Trade] le joueur " + localcPO1.getName() + " donne : " + localcPO1.cHk() + "K ; ";
    Object localObject1;
    if (!localcPO1.cHi())
      for (localObject1 = localcPO1.cHj(); ((cHu)localObject1).hasNext(); ) {
        ((cHu)localObject1).fl();
        localObject2 = (gA)((cHu)localObject1).value();
        str = str + ((gA)localObject2).nP() + "x" + ((gA)localObject2).getName() + " (refId=" + ((gA)localObject2).ok() + ") ";
      }
    Object localObject2;
    str = str + "\nle joueur " + localcPO2.getName() + " donne : " + localcPO2.cHk() + "K ; ";
    if (!localcPO2.cHi()) {
      localObject1 = byv.bFN().bFO();
      for (localObject2 = localcPO2.cHj(); ((cHu)localObject2).hasNext(); ) {
        ((cHu)localObject2).fl();
        gA localgA1 = (gA)((cHu)localObject2).value();
        str = str + localgA1.nP() + "x" + localgA1.getName() + " (refId=" + localgA1.ok() + ") ";

        gA localgA2 = localgA1.nH();
        cRs localcRs = ((byz)localObject1).bGP().ap(localgA2);
        if (localcRs == null) {
          K.error("[Trade] On a pas pu ajouter les " + localgA1.nP() + "de " + localgA1.getName() + " a l'inventaire local");
        }
      }
    }
    K.info(str);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("exchangeId")) {
      return Long.valueOf(getId());
    }

    if (paramString.equals("localUserState")) {
      return Integer.valueOf(this.dpP == 0 ? 0 : aCk().gI() ? 1 : -1);
    }

    if (paramString.equals("remoteUserState")) {
      return Integer.valueOf(this.dpP == 0 ? 0 : aCl().gI() ? 1 : -1);
    }

    if (paramString.equals("localItemsExchange")) {
      return c(aCk());
    }
    if (paramString.equals("remoteItemsExchange")) {
      return c(aCl());
    }

    if (paramString.equals("localMoneyExchange")) {
      return dxx.format(aCk().cHk());
    }

    if (paramString.equals("remoteMoneyExchange")) {
      return dxx.format(aCl().cHk());
    }

    return null;
  }

  private Collection c(cPO paramcPO) {
    if (!paramcPO.cHi()) {
      ArrayList localArrayList = new ArrayList();
      for (cHu localcHu = paramcPO.cHj(); localcHu.hasNext(); ) {
        localcHu.fl();
        gA localgA = (gA)localcHu.value();
        if (localgA.nP() > 0) {
          localArrayList.add(localgA);
        }
      }
      return localArrayList;
    }

    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void aCd() {
    dLE.doY().a(this, new String[] { "localItemsExchange" });
  }

  public void aCe() {
    dLE.doY().a(this, new String[] { "remoteItemsExchange" });
  }

  public void aCf() {
    dLE.doY().a(this, new String[] { "localMoneyExchange" });
  }

  public void aCg() {
    dLE.doY().a(this, new String[] { "remoteMoneyExchange" });
  }

  public void aCh() {
    dLE.doY().a(this, new String[] { "localUserState" });
  }

  public void aCi()
  {
    dLE.doY().a(this, new String[] { "remoteUserState" });
  }

  public byte azu() {
    return this.dpP;
  }

  public void bg(byte paramByte) {
    this.dpP = paramByte;
  }

  public String aCj() {
    return bU.fH().getString("exchange.error." + this.dpP);
  }

  public cPO aCk() {
    return (cPO)gI(byv.bFN().bFO().getId());
  }

  public cPO aCl() {
    return (cPO)d(aCk());
  }
}