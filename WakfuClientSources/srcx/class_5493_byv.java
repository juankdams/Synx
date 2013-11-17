import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.security.PublicKey;
import org.apache.log4j.Logger;

public class byv extends bdq
{
  private static byv gkz = new byv();

  private aps gkA = null;

  private byz bSY = null;

  private Su gkB = null;

  private dHb gkC = null;
  private long gkD;
  private PublicKey gkE;
  private String cYx;
  private cKX gkF;

  public byv()
  {
    try
    {
      int i = ay.bd().or("connectionRetryCount");
      int j = ay.bd().or("connectionRetryDelay");
      br(i, j);
    } catch (bdh localbdh) {
      K.error("Impossible de dï¿½finir les paramï¿½tres du systï¿½me de dï¿½co/reco");
    }
  }

  public static byv bFN()
  {
    return gkz;
  }

  public byz bFO()
  {
    return this.bSY;
  }

  public void c(byz parambyz)
  {
    if (this.bSY != null)
    {
      this.bSY.bSf();
      this.bSY.aeL().b(ayg.aJQ());
      this.bSY.bGb();
    }
    this.bSY = parambyz;

    bjv.cN(this.bSY == null ? bjv.fzV : this.bSY.xK());
    bjv.setName(this.bSY == null ? bjv.fzX : this.bSY.getName());
    bjv.is(this.bSY == null ? bjv.fzX : this.bSY.aet().getName());
    String str;
    if (this.bSY != null)
      str = bU.fH().b(39, this.bSY.cJf().bP(), new Object[0]);
    else {
      str = null;
    }
    bjv.ir(this.bSY == null ? bjv.fzX : str);

    dLE.doY().t("localPlayer", parambyz);
    dLE.doY().t("isInGame", Boolean.valueOf(parambyz != null));

    if (parambyz != null) {
      dLf.djM().initialize();
      parambyz.aeL().a(ayg.aJQ());
    }
  }

  public void ay(Su paramSu) {
    this.gkB = paramSu;

    dLE.doY().t("observedCharacter", this.gkB);
  }

  public dHb bFP()
  {
    return this.gkC;
  }

  public void a(dHb paramdHb)
  {
    this.gkC = paramdHb;

    dLE.doY().t("currentWorld", paramdHb);

    duB.dai().qp(this.gkC == null ? null : this.gkC.Qh());
  }

  public aps bFQ()
  {
    return this.gkA;
  }

  public void a(aps paramaps)
  {
    this.gkA = paramaps;

    dLE.doY().t("localAccount", paramaps);
  }

  public void a(doh paramdoh)
  {
    super.a(paramdoh);

    ay.bd().T("lastProxyGroupIndex", paramdoh.getIndex());
  }

  public void awO()
  {
    super.awO();

    cjS.clP().cleanUp();

    acL.apd().apc();

    gD.oL().clear();

    bSH.bZs().removeAllPoints();
    cCZ.cyZ().removeAllPoints();

    ddm.cOA();

    crc.iaH.cleanUp();

    dSG.dsZ().reset();

    aca.aoj().clear();

    byz localbyz = bFO();
    if (localbyz != null)
    {
      aAx.aMd().aMt();
      aAx.aMd().clean();

      dKc localdKc = localbyz.bSe();
      if (localdKc != null) {
        localdKc.a(true, false);
      }

      localbyz.bFW().btm();

      localbyz.adp();

      localbyz.aTn().clear();
    }

    bQK.bXG().bXI();

    ary.aDT().removeAll();

    ayg.aJQ().clear();

    qn.xw().clean();

    dmY.cUs().clear();

    long l = dDH.dfA().dfB();
    if (l > 0L) {
      cAo.cxf().ia(l);
    }

    l = dDH.dfA().dfC();
    if (l > 0L) {
      cAo.cxf().ia(l);
    }

    aWc.blo().blr();

    dDE.dft().b(buU.geA);
    dDE.dft().b(bzZ.goz);
    dDE.dft().b(xV.GU());

    dwj.dbl().clear();

    dmM.cUe().reset();

    for (dmn localdmn = dsh.luB.cgk(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((aYr)localdmn.value()).b(aem.cVj);
    }
    aem.cVj.clean();

    Nx.cdi.clear();

    CA.Lv().Ly();

    aYP.feK.b(null);

    cHT.iDr.cleanUp();
    dTG.mqC.stop();

    dBW.lJB.clear();
    azM.dRs.clear();

    dfX.laF.clear();

    aiM.dgK.avB();

    dcy.kVz.clear();

    hx.aGS.unload();

    czd.inP.a(dFa.lOv);
    c(null);
    ay(null);
  }

  public void aCy() {
    super.aCy();

    dGW.dhM().dhP();
    aKj.bbx().bby();

    bFN().a(chb.hET);
  }

  public void cleanUp()
  {
    super.cleanUp();
  }

  public boolean bFR()
  {
    return super.a(WakfuClientInstance.awy().aUN());
  }

  public void a(int paramInt1, int paramInt2, long paramLong)
  {
    Rm localRm = (Rm)ckU.cmE().ak(false);
    if (localRm.acP() == 0) {
      localRm.gt(paramInt2);
    }
    dcM localdcM = new dcM(paramInt1 * paramLong);
    localRm.du(bU.fH().getString("logon.progress.desc", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)localdcM.cOg()), Byte.valueOf(localdcM.cOh()), Byte.valueOf(localdcM.cOi()) }));
    ckU.cmE().ak(true).gs(paramInt1);
  }

  public void aJP()
  {
  }

  public void kZ(int paramInt)
  {
    K.info("queryResultCode : " + paramInt);
  }

  public void F(byte[] paramArrayOfByte)
  {
    cBQ.cxL().a(bU.fH().getString("logon.invalidClientVersion", new Object[] { aUk.N(aUk.eVc), aUk.N(paramArrayOfByte) }), Cn.et(1), 1027L, 1, 2);

    ckU.cmE().done();
    aig.dej.o("loginLock", true);
    js("Invalid Client Version");
  }

  protected void bry()
  {
    ckU.cmE().done();
    aig.dej.o("loginLock", true);

    cBQ.cxL().a(bU.fH().getString("logon.noProxyAvailable"), Cn.et(1), 1027L, 1, 1);
  }

  protected void brz()
  {
    ckU.cmE().ak(true).g(bU.fH().getString("logon.progress"), 0);

    Zw localZw = new Zw();
    aJK().d(localZw);

    dcI localdcI = new dcI();
    aJK().d(localdcI);
  }

  protected void brA()
  {
    if (this.gkF != null) {
      this.gkF.cEo();
    }
    this.gkF = cBQ.cxL().a(bU.fH().getString("question.disconnect"), Cn.et(0), 2073L, 102, 1);

    if (this.gkF != null)
      this.gkF.a(new dUB(this));
  }

  public void a(Su paramSu, aNA paramaNA)
  {
    paramSu.aeL().a(paramaNA);
    paramSu.aeL().c(CG.bFG);
    int i = 20001;
    int j = 20016;
    int k = 20088;
    if (paramSu.aJp() != SB.ctQ) {
      int[] arrayOfInt = { 20001, 20016, 20088 };
      paramSu.D(arrayOfInt[bCO.sf(arrayOfInt.length)], false);
    } else {
      paramSu.D(20001, false);
    }
  }

  private void bFS() {
    ckU.cmE().ak(true).g(bU.fH().getString("disconnection.progress"), 0);
    js("LogOff");
  }

  protected void brB()
  {
    js("Going to World Selection");
  }

  protected void brC()
  {
    cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.quit"), Cn.et(0), 2073L, 102, 1);

    localcKX.a(new dUz(this));
  }

  public void bFT()
  {
    js(null);
  }

  public void js(String paramString) {
    if (this.bSY != null) {
      this.bSY.bGD().cWO();

      long l = dDH.dfA().dfB();
      if (l > 0L) {
        cAo.cxf().ia(l);
      }
    }

    if (aJK() != null) {
      K.info("Sending DisconnectionMessage to Servers. Reason : {" + paramString + "}");

      Vy localVy = new Vy();
      aJK().d(localVy);

      aJK().closeConnection();
    }
  }

  public void d(cWG paramcWG)
  {
    throw new UnsupportedOperationException("Pas d'envoi de message ï¿½ l'aide de cette entitï¿½ : voir : getNetworkEntity()");
  }

  public boolean a(cWG paramcWG)
  {
    boolean bool = super.a(paramcWG);
    pN.c(paramcWG);
    return bool;
  }

  public static void a(bAF parambAF)
  {
    if (bFN().bFO() == null) {
      return;
    }
    cew localcew = bFN().bFO().aeL();

    if (parambAF == localcew) {
      return;
    }

    int i = parambAF.fa() - localcew.fa();
    int j = parambAF.fb() - localcew.fb();
    if ((Math.abs(i) > 54) || (Math.abs(j) > 54))
      K.error("acteur (" + parambAF.getId() + ") se déplaçant trop loin (problème avec PartitionIntersectorCache?) " + "camera=" + localcew.atB() + " acteurPos=" + parambAF.atB());
  }

  public long bFU()
  {
    return this.gkD;
  }

  public void gj(long paramLong) {
    this.gkD = paramLong;
  }

  public PublicKey bFV() {
    return this.gkE;
  }

  public void a(PublicKey paramPublicKey) {
    this.gkE = paramPublicKey;
  }

  public void setEmail(String paramString) {
    this.cYx = paramString;
  }

  public String getEmail() {
    return this.cYx;
  }
}