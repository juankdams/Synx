import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dcY extends dxn
  implements Qh, bX
{
  private static final Logger K = Logger.getLogger(dcY.class);
  public static final String TAG = "wakfuBubble";
  private static final int kVW = 5;
  private static final int kVX = 60;
  public static final String kVY = "text";
  public static final String kVZ = "container";
  public static final String kWa = "coloredContainer";
  public static final String kWb = "image";
  public static int gAH = -2147483648;
  private duS kWc;
  private boolean isB;
  private boolean kWd;
  private boolean kWe;
  private boolean kWf;
  private boolean kWg;
  private boolean kWh;
  private Md kWi;
  private dMM kWj;
  private dMW kWk;
  private float cas;
  private boolean kWl;
  private bNa bPo;

  public dcY()
  {
    this.kWd = true;

    this.kWe = false;

    this.kWf = true;
    this.kWg = false;
    this.kWh = false;

    this.cas = 1.0F;
  }

  public void initialize()
  {
    t(true, true);
  }

  public void t(boolean paramBoolean1, boolean paramBoolean2) {
    c(true, paramBoolean1, paramBoolean2, false);
  }

  public void c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    c(true, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.kWc = ((duS)getElementMap().fi("text"));

    if ((!this.kWe) || (this.kWf != paramBoolean1)) {
      this.kWf = paramBoolean1;
      bhc();
    }

    this.isB = paramBoolean2;
    this.kWl = paramBoolean3;
    this.kWh = paramBoolean4;
  }

  protected void bhc() {
    if ((this.kWi != null) && (this.kWi.WA() != null)) {
      this.kWi.WA().c(this);
    }
    setAlign(this.kWf ? aFG.ecg : aFG.eci);
    if (this.af != null) {
      a(this.af, this.af.getScreenX(), this.af.getScreenY(), 0);
    }
    invalidate();
    this.kWe = true;
  }

  protected void transform() {
    this.kWi.WA().b(this);
  }

  public String setText(String paramString) {
    return setText(paramString, 1.0F);
  }

  public String setText(String paramString, float paramFloat) {
    if ((!bB) && (this.kWc == null)) throw new AssertionError();
    Cs localCs = Md.cH(paramString);
    if (!((Md)localCs.getFirst()).equals(this.kWi)) {
      this.kWi = ((Md)localCs.getFirst());
      transform();
      bhc();
    }
    paramString = ((String)localCs.Lp()).trim();
    this.kWc.setText(paramString);
    setDuration((int)(aDe.gg(paramString) * paramFloat));
    if (this.kWh)
      fr(true);
    atG();
    byJ();
    return paramString;
  }

  public void setTarget(bVf parambVf) {
    setTarget(parambVf);

    if (parambVf != null)
      l(parambVf.E());
  }

  public void setTarget(ahm paramahm)
  {
    if (paramahm == this.af) {
      return;
    }

    if ((this.af != null) && ((this.af instanceof ahm))) {
      ((ahm)this.af).b(this);
    }

    super.setTarget(paramahm);

    if (paramahm != null) {
      paramahm.a(this);
      setTargetIsVisible(paramahm.isVisible());
    }
  }

  public void setBubbleObserver(dMM paramdMM) {
    this.kWj = paramdMM;
    this.kWj.a(this);
  }

  private void l(CG paramCG) {
    boolean bool = isRightDirection(paramCG);
    if (bool != this.kWf) {
      this.kWf = bool;
      bhc();
    }
  }

  public void cxB() {
    if (this.kWh)
      fr(false);
    else
      cleanUp();
  }

  public void cleanUp()
  {
    this.kWg = false;
    this.kWk = null;
    if (this.isB)
      cxD();
    else {
      setBubbleIsVisible(false);
    }
    if (this.kWj != null)
      this.kWj.b(this);
  }

  public void setBubbleIsVisible(boolean paramBoolean) {
    if (this.kWd == paramBoolean) {
      return;
    }
    this.kWd = paramBoolean;

    atG();
  }

  protected void atG() {
    boolean bool = (this.lDr) && (this.kWd);
    if (this.aYZ == bool)
      return;
    setVisible(bool);
    if (bool)
      byJ();
  }

  private void byJ()
  {
    cOP localcOP = (cOP)getParentOfType(cOP.class);
    if (localcOP == null)
      return;
    localcOP.w(this);
  }

  public final void invalidate()
  {
    super.invalidate();
  }

  public MD getComputedPosition(int paramInt1, int paramInt2, int paramInt3) {
    MD localMD = super.getComputedPosition(paramInt1, paramInt2, paramInt3);
    int i = localMD.getX();
    int j = localMD.getY();

    int k = this.lDt.getDuration();
    if (((this.kWg) && ((k == -1) || (this.lDt.Ft() < k / 2))) || ((this.kWi == Md.bZm) && (this.lDt.Ft() < 500)))
    {
      i += bCO.cL(-3, 3);
      j += bCO.cL(-3, 3);
    }

    localMD.set(i, j);

    return localMD;
  }

  public void a(agn paramagn, int paramInt1, int paramInt2, int paramInt3) {
    atG();
    c(this.kWj);

    super.a(paramagn, paramInt1, paramInt2, 0);
  }

  public void setShakingBubble(boolean paramBoolean) {
    this.kWg = paramBoolean;
  }

  public void setDuration(int paramInt) {
    this.lDt.setDuration(paramInt);
  }

  public void cxC()
  {
    this.lDt.dm(0);
    atG();
  }

  public int getAdviserId() {
    return this.lDt.getId();
  }

  public boolean isToRight() {
    return this.kWf;
  }

  public bNa getColor() {
    return this.bPo;
  }

  public void setColor(bNa parambNa) {
    this.bPo = parambNa;
    cOn();
  }

  public void cOn()
  {
    dRq localdRq = (dRq)getElementMap().fi("coloredContainer");
    localdRq.setVisible(this.bPo != null);
    localdRq.getAppearance().setModulationColor(this.bPo);
  }

  public void cxD() {
    if (getElementMap() != null)
      cBQ.cxL().mW(getElementMap().getId());
  }

  public void b(boolean paramBoolean, dnS paramdnS) {
    setTargetIsVisible(paramBoolean);
  }

  public static boolean isRightDirection(CG paramCG) {
    switch (rr.RE[paramCG.ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      return false;
    case 6:
    case 7:
    case 8:
      return true;
    }
    return false;
  }

  public float getWorldX()
  {
    if (this.af != null) {
      return this.af.getWorldX();
    }
    return 0.0F;
  }

  public float getWorldY()
  {
    if (this.af != null) {
      return this.af.getWorldY();
    }
    return 0.0F;
  }

  public float getAltitude() {
    if (this.af != null) {
      return this.af.getAltitude();
    }
    return 0.0F;
  }

  public int getDuration() {
    return this.lDt.getDuration();
  }

  public void ccT() {
    super.ccT();

    if ((this.af != null) && ((this.af instanceof ahm)))
      ((ahm)this.af).b(this);
  }

  public void bc()
  {
    super.bc();

    this.kWe = false;
  }

  private void fr(boolean paramBoolean) {
    cpa localcpa = getElementMap();
    ArrayList localArrayList = new ArrayList();
    if (localcpa == null)
      return;
    dOc localdOc = (dOc)localcpa.fi("image");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("container");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("text");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }

    if (localdOc != null) {
      bNa localbNa1 = new bNa(paramBoolean ? bNa.gRu.get() : bNa.gRx.get());
      bNa localbNa2 = new bNa(paramBoolean ? bNa.gRx.get() : bNa.gRu.get());

      aga localaga = new aga(localbNa1, localbNa2, localArrayList, 0, 500, 1, ddp.kWG);

      if (!paramBoolean) {
        localaga.a(new rH(this, localaga));
      }

      localdOc.a(localaga);
    }
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    c(paramdMM);
  }

  private void c(dMM paramdMM) {
    if ((paramdMM == null) || (this.kWi == null))
      return;
    int i = paramdMM.atB().ab(this.af.fa(), this.af.fb(), this.af.fc());
    dMW localdMW;
    if (i > this.kWi.WB())
      localdMW = dMW.mdB;
    else {
      localdMW = dMW.mdC;
    }
    if (localdMW != this.kWk) {
      if ((this.kWl) || (this.kWi == Md.bZn)) {
        a(localdMW);
      }
      this.kWk = localdMW;
    }
  }

  private void a(dMW paramdMW)
  {
    duS localduS = (duS)getElementMap().fi("text");
    if (this.kWk != null)
      localduS.setZoomTween(paramdMW.getZoomScale(), 500);
    else
      localduS.setZoom(paramdMW.getZoomScale());
  }
}