import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cew extends bAF
  implements azg
{
  private static final Logger K = Logger.getLogger(cew.class);
  public static final boolean aRN = false;
  private final Su ddR;
  private final dnn hyR = new dnn(this);

  private final bmD hyS = new bmD(this);
  private boolean hyT;
  private cWV hyU = bRy.bYJ();

  private float hyV = 0.0F;
  private dCA hyW = null;
  private boolean hyX;
  private diH hyY;

  public cew(Su paramSu)
  {
    super(paramSu.getId());

    if (paramSu.aeI()) {
      this.dbT = dHZ.lSN;
      id(dLw.mbm.asR());
    } else {
      this.dbT = new cOw(paramSu);
      id(dLw.mbl.asR());
    }

    this.ddR = paramSu;
    this.ddR.a(this);
    cg(isVisible());

    E(this.ddR);
    G(this.ddR);
    F(this.ddR);

    deU();
    a(new dxz(this));
  }

  public int aeR()
  {
    return cbD().aeR();
  }

  public Su cbD()
  {
    return this.ddR;
  }

  public void cgQ() {
    this.ddR.afb();
  }

  public void G(dhJ paramdhJ) {
    if (paramdhJ.oc() != 0)
      jz(String.valueOf(paramdhJ.oc()));
  }

  public void z(dhJ paramdhJ)
  {
  }

  public void A(dhJ paramdhJ) {
  }

  public void C(dhJ paramdhJ) {
  }

  public void D(dhJ paramdhJ) {
  }

  public void B(dhJ paramdhJ) {
  }

  public void E(dhJ paramdhJ) {
    k(paramdhJ.fa(), paramdhJ.fb(), paramdhJ.fc());
  }

  public void F(dhJ paramdhJ) {
    c(paramdhJ.E());
  }

  public void H(dhJ paramdhJ) {
  }

  public void I(dhJ paramdhJ) {
  }

  public void a(bNz parambNz) {
    cbD().aek();
  }

  public long getId()
  {
    return super.getId();
  }

  public byte afD()
  {
    if (this.ddR != null) {
      return this.ddR.afD();
    }
    return super.afD();
  }

  public short arG()
  {
    if (this.ddR != null) {
      return this.ddR.arG();
    }
    return super.arG();
  }

  public short BC()
  {
    if (this.ddR != null) {
      return (short)this.ddR.bY();
    }
    return super.BC();
  }

  public final boolean isVisible()
  {
    if (this.hyX) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return true;
    }
    arl localarl = localbyz.bGv();

    if (localarl != null) {
      UG localUG = localarl.LB();
      if ((!localarl.ai(this.ddR)) && (localarl.aDB()) && (localUG.ar(fa(), fb())))
      {
        if (!this.hyT) {
          this.hyT = true;
          this.dct = true;
          a(false, dnS.loh);
        }
        return false;
      }
    }
    if (this.hyT) {
      this.hyT = false;
      this.dct = true;
      a(true, dnS.loh);
    }
    if (this.ddR.cRh()) {
      return false;
    }
    return super.isVisible();
  }

  protected boolean bIT()
  {
    return !(this.ddR instanceof byo);
  }

  public int afE()
  {
    return this.ddR.afE();
  }

  public void a(cuB paramcuB, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.a(paramcuB, paramBoolean1, paramBoolean2);

    int[] arrayOfInt = paramcuB.csZ();
    if ((arrayOfInt != null) && (arrayOfInt.length == 3)) {
      cbD().r(arrayOfInt[0], arrayOfInt[1], (short)arrayOfInt[2]);
    }

    if ((this.ddR.aeQ() != null) && (this.ddR.uO() == SB.ctE.uO())) {
      this.hyR.cUJ();
      this.hyR.cUH();
      this.hyR.cgW();
      b(new dsX(this));
    }
  }

  public void c(CG paramCG)
  {
    if (paramCG == null) {
      K.error("Unable to set a Direction8 to null", new Exception());
      return;
    }
    super.c(paramCG);
    cbD().f(paramCG);
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    arl localarl = cbD().aeQ();
    if ((aeR() != -1) && (aeR() == localbyz.bGw()) && (cbD().adF()) && (localarl != null) && (!localarl.aDy()))
    {
      j(paramCG);
    }
  }

  public boolean a(cXf paramcXf)
  {
    if (!super.a(paramcXf)) {
      return false;
    }

    if ((this.ddR != null) && (this.ddR.i(cfY.hCt))) {
      cgV();
    }

    return true;
  }

  public byte cgR()
  {
    if (this.ddR.adF()) {
      return 4;
    }
    return super.cgR();
  }

  public void i(CG paramCG) {
    c(paramCG);

    cgQ localcgQ = new cgQ(paramCG);
    byv.bFN().aJK().d(localcgQ);
  }

  public void cgS() {
    beo.c(this);
  }

  public void cgT() {
    atq();
  }

  public void bZ(float paramFloat) {
    this.hyV += paramFloat;
    this.dbI = true;
  }

  public void ca(float paramFloat) {
    this.hyV -= paramFloat;
    this.dbI = true;
  }

  public float getAltitude()
  {
    return super.getAltitude() + this.hyV;
  }

  public void t(ArrayList paramArrayList)
  {
    dCb localdCb = cbD().aeS();

    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      aLA localaLA = (aLA)paramArrayList.get(j);
      if ((localdCb == null) || (!localdCb.a(localaLA)))
      {
        localaLA.a(this);
      }
    }
  }

  public cZH atH()
  {
    return aci.cRd;
  }

  public void cgU()
  {
    this.hyR.cUG();
    this.hyR.cUI();
    this.hyR.cgX();
    this.hyS.bxn();
  }

  public void cgV()
  {
    this.hyR.cUH();
    this.hyR.cUJ();
    this.hyR.cgW();
    this.hyS.bxo();
  }

  public void cgW()
  {
    this.hyR.cgW();
  }

  public void cgX()
  {
    this.hyR.cgX();
  }

  public void cgY() {
    this.hyR.cgY();
  }

  public String atc()
  {
    Su localSu = cbD();
    if (localSu == null) {
      K.error("Actor sans characterInfo id=" + getId() + " gfxId=" + asS());
      return super.atc();
    }
    bhh localbhh = localSu.aJp();
    if ((localbhh != null) && ((localbhh == SB.ctN) || (localbhh.uO() == 2382))) {
      int i = cgZ() == null ? 2147483647 : cgZ().getType();
      if ((i == 1) || (i == 0)) {
        return null;
      }
    }
    return super.atc();
  }

  public cWV cgZ() {
    return this.hyU;
  }

  public void b(cWV paramcWV) {
    if ((!bB) && (paramcWV == null)) throw new AssertionError("utiliser plutot NoneAttack.getInstance()");
    this.hyU = paramcWV;
  }

  public int c(cWV paramcWV) {
    if (this.hyU.a(paramcWV)) {
      bOJ.a(this, this.hyU.cKJ(), paramcWV.cKJ());
      return 0;
    }

    return bOJ.c(this, paramcWV);
  }

  public void cha() {
    if ((this.ddR instanceof bKm)) {
      bOJ.aE(this.ddR);
      this.hyU.g(this);
    }
    this.hyR.dK((byte)-1);
  }

  public void chb() {
    if ((this.ddR instanceof bKm)) {
      bOJ.c(this, bRy.bYJ());
    }
    this.hyR.chl();
  }

  public int chc()
  {
    if (this.ddR != null) {
      return this.ddR.aJp().bY();
    }
    return 0;
  }

  public int fd()
  {
    return 0;
  }

  public bNa ff()
  {
    if (((this.ddR instanceof byo)) && ((this.ddR.isDead()) || (this.ddR.c(dKm.lWV))))
    {
      return bNa.gRI;
    }

    if (this.ddR.c(dKm.lWW))
      return bNa.gRz;
    if (this.ddR.c(dKm.lWX)) {
      return bNa.gRC;
    }

    return bNa.gRx;
  }

  public void chd() {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(15000);
    localFreeParticleSystem.b(this);
    if ((this.ddR != null) && (this.ddR.adF())) {
      localFreeParticleSystem.cS(this.ddR.aeR());
    }
    cWS.cKD().b(localFreeParticleSystem);
  }

  public void dispose()
  {
    cgY();
    this.hyS.b(this);
    dpv();
    daO.cML().a(this);
    chv();
    super.dispose();
  }

  public void release()
  {
    dispose();
  }

  public void che() {
    this.hyR.che();
  }

  public void j(CG paramCG) {
    this.hyR.j(paramCG);
  }

  public void chf() {
    this.hyR.chf();
  }

  public void chg() {
    this.hyR.chg();
  }

  public void chh() {
    this.hyR.chh();
  }

  public void chi() {
    this.hyR.chi();
  }

  public void chj() {
    this.hyR.chj();
  }

  public void dI(byte paramByte) {
    this.hyR.dI(paramByte);
  }

  public void dJ(byte paramByte) {
    this.hyR.dJ(paramByte);
  }

  public void c(doA paramdoA, boolean paramBoolean) {
    this.hyS.c(paramdoA, paramBoolean);
  }

  public void b(doA paramdoA, boolean paramBoolean) {
    this.hyS.b(paramdoA, paramBoolean);
  }

  public void d(doA paramdoA, boolean paramBoolean) {
    this.hyS.d(paramdoA, paramBoolean);
  }

  public void dK(byte paramByte) {
    this.hyR.dK(paramByte);
  }

  public void chk() {
    this.hyR.chk();
  }

  public void chl() {
    this.hyR.chl();
  }

  public void chm() {
    this.hyR.chm();
  }

  public void chn() {
    this.hyR.chn();
  }

  public final String cas()
  {
    if ((this.ddR instanceof bKm)) {
      return ata() + "-Fin";
    }
    return super.cas();
  }

  public aqh cav()
  {
    return this.ddR.aJp().afG();
  }

  public aqh cau()
  {
    return this.ddR.aJp().afH();
  }

  protected void cho()
  {
    if (cgR() < 8) {
      return;
    }

    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(999998);
    localFreeParticleSystem.f(this.dcl, this.dcm, this.cQv);

    cWS.cKD().b(localFreeParticleSystem);

    this.mdm.hL(localFreeParticleSystem.getId());
  }

  protected void chp()
  {
    if (cgR() < 8) {
      return;
    }
    try
    {
      String str1 = "currentPathLayer";
      float[] arrayOfFloat1 = { 1.0F, 0.0F, 0.0F, 0.9F };

      ciL localciL1 = dbL.cNv().oN("currentPathLayer");
      if (localciL1 == null) {
        localciL1 = dbL.cNv().oL("currentPathLayer");
      }

      String str2 = "currentPathCellLayer";
      float[] arrayOfFloat2 = { 0.0F, 0.0F, 1.0F, 0.9F };

      ciL localciL2 = dbL.cNv().oN("currentPathCellLayer");
      if (localciL2 == null) {
        localciL2 = dbL.cNv().oL("currentPathCellLayer");
      }

      if (this.mdg != null) {
        btb localbtb = btb.bBd();
        dbL.cNv().oO("currentPathLayer");
        dbL.cNv().oO("currentPathCellLayer");
        for (int i = 0; i < this.mdg.csW(); i++) {
          int[] arrayOfInt = this.mdg.wR(i);
          DisplayedScreenElement localDisplayedScreenElement = localbtb.b(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], cWj.kJk);
          if (localDisplayedScreenElement != null)
            if (i != this.mdh) {
              localciL1.g(arrayOfFloat1);
              dbL.cNv().h(localDisplayedScreenElement.bpf(), "currentPathLayer");
            } else {
              localciL2.g(arrayOfFloat2);
              dbL.cNv().h(localDisplayedScreenElement.bpf(), "currentPathCellLayer");
            }
        }
      }
    }
    catch (Exception localException) {
      K.error("", localException);
    }
  }

  public void v(int paramInt, boolean paramBoolean) {
    try {
      aCH localaCH = clR.cni().vL(paramInt);
      if (dgM.c(localaCH)) {
        return;
      }

      if (paramBoolean) {
        dgM.a(this, localaCH, true);
      } else {
        bZH localbZH = this.ddR.ayJ();
        if (localbZH != null) {
          gA localgA = (gA)localbZH.dB((short)azO.dRO.hV);
          if (localgA != null)
            a(localgA.oi(), (short)azO.dRO.hV);
        }
        else {
          K.error("Characterinfo sans equipmentInventory " + this.ddR.getId());
        }
        dgM.a(this, localaCH);
      }
    } catch (Exception localException) {
      K.error("Erreur d'animation liée au visuel " + paramInt, localException);
      eq(atp());
    }
  }

  public void a(bBn parambBn, short paramShort) {
    a(parambBn, paramShort, this.ddR.xK());
  }

  public boolean apP()
  {
    Su localSu = cbD();

    if (localSu == null) {
      return false;
    }

    if (localSu.adF()) {
      return super.apP();
    }

    if (localSu.aeI()) {
      return super.apP();
    }

    csx[] arrayOfcsx = localSu.adN();
    if ((arrayOfcsx != null) && (arrayOfcsx.length > 0)) {
      for (int i = 0; i < arrayOfcsx.length; i++) {
        csx localcsx = arrayOfcsx[i];
        if (localcsx != null) {
          localcsx.Q(localSu);
          if ((localcsx.isUsable()) && (localcsx.pZ())) {
            return super.apP();
          }
        }
      }
    }

    return false;
  }

  public void P(int paramInt1, int paramInt2, int paramInt3) {
    M(new int[] { paramInt1, paramInt2, paramInt3 });
  }

  protected void M(int[] paramArrayOfInt)
  {
    super.M(paramArrayOfInt);

    if ((this.ddR == null) || (!this.ddR.aeI()) || (this.mdg == null) || (this.mdh < 0) || ((cat() instanceof cRD)) || (this.mdh == this.mdg.csW() - 1))
    {
      return;
    }

    int[] arrayOfInt = dpz().wR(this.mdh);
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800189);
    localFreeParticleSystem.f(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]);
    cWS.cKD().b(localFreeParticleSystem);
  }

  public bmD chq() {
    return this.hyS;
  }

  public void chr() {
    this.hyS.i(this);
  }

  public void chs() {
    this.hyS.j(this);
  }

  public void cht() {
    this.hyS.reload();
  }

  public boolean aeI()
  {
    byz localbyz = byv.bFN().bFO();
    return (localbyz != null) && (getId() == localbyz.getId());
  }

  public void setVisible(boolean paramBoolean)
  {
    super.setVisible(paramBoolean);
    dLE.doY().a(this.ddR, new String[] { "visible" });
  }

  protected String jdMethod_if(int paramInt)
  {
    try {
      return bAF.rU(paramInt);
    } catch (bdh localbdh) {
      K.error("Exception levee", localbdh);
    }return null;
  }

  protected boolean chu()
  {
    return super.chu();
  }

  public void chv() {
    if (this.hyW != null) {
      this.hyW.chv();
      this.hyW = null;
    }
  }

  public void a(bMG parambMG) {
    this.hyW = dCA.a(this, parambMG, "blason", null);
  }

  public void gR(boolean paramBoolean) {
    this.hyX = paramBoolean;
  }

  public cuB b(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.ddR.aJp().uO() == 1841)
      gqa.caB = 600;
    else {
      gqa.caB = 400;
    }
    return super.b(paramInt1, paramInt2, paramShort, paramBoolean1, paramBoolean2);
  }

  public void a(diH paramdiH) {
    this.hyY = paramdiH;
  }

  public diH chw() {
    return this.hyY;
  }
}