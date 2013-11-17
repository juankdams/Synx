import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class doA extends aVc
{
  private static final int loP = 2040;
  private static final int loQ = 1793;
  private static final int loR = 1793;
  private int loS;
  private byte loT = -1;
  private int ixr;
  private boolean loU;
  protected bvk loV = bvk.bCS();

  protected int loW = -1;

  private boolean loX = false;
  private ans loY = new ans(this);
  private boolean loZ;
  protected boolean ksH = false;

  private final cCH lpa = new dOu(this);

  private final cCH lpb = new dOB(this, 12);

  public short cVC()
  {
    if (bkh() != null) {
      int i = ((dji)bkh()).cRW();
      if (i != -1)
        return (short)i;
    }
    if (wa() == null)
      return 0;
    return ((bqk)wa()).nU();
  }

  public void jH(boolean paramBoolean) {
    this.loZ = paramBoolean;
  }

  public void cVD() {
    this.loU = true;
  }

  public void jI(boolean paramBoolean) {
    this.loX = paramBoolean;
  }

  public boolean cVE() {
    return this.loX;
  }

  public List a(dpI paramdpI, alr paramalr, cOE paramcOE, int paramInt1, int paramInt2, short paramShort) {
    return this.loY.a(paramdpI, paramalr, paramcOE, paramInt1, paramInt2, paramShort);
  }

  public void aJ()
  {
    super.aJ();
    this.loS = cvd.ctc();
    this.ixr = -1;
    this.cxl = 0;
    this.loU = false;
    this.loW = -1;
    this.ksH = false;
    this.loZ = false;
    this.loX = false;

    this.loV = bvk.bCS();
    this.eWY = cUz.cJL();
    this.loT = -1;
    this.loY = new ans(this);
    ov.add(this);
  }

  public void bc()
  {
    super.bc();
    this.cxl = 0;
    this.loV = bvk.bCS();
    this.loX = false;
    this.loY = null;
    ov.remove(this);
  }

  public boolean cVF()
  {
    return this.loZ;
  }

  public boolean a(PY paramPY) {
    if (this.eWL == null)
      return false;
    return ((dpI)this.eWL).a(paramPY);
  }

  public void f(aVc paramaVc, boolean paramBoolean)
  {
    this.loZ = true;
    b(paramaVc, paramBoolean);
  }

  public void b(aVc paramaVc, boolean paramBoolean) {
    if ((beF()) || (this.loU))
      return;
    this.loU = true;
    if ((this.ejP != null) && (this.ejP.LF() != null) && 
      (!paramBoolean)) {
      this.ejP.LF().k(this);
    }

    if (paramaVc != null)
      this.ixr = ((doA)paramaVc).cVK();
    else
      this.ixr = -1;
    if ((this.ejP != null) && (this.ejP.LF() != null) && 
      (paramBoolean))
      this.ejP.LF().l(this);
  }

  private boolean beF()
  {
    dji localdji = (dji)bkh();
    if ((localdji != null) && (localdji.cSc()))
      return true;
    return (this.eWL != null) && (((dpI)this.eWL).beF());
  }

  public void jJ(boolean paramBoolean)
  {
    this.loU = paramBoolean;
  }

  public boolean RI() {
    return this.loU;
  }

  public void bkz()
  {
    if ((bkn() == null) && (bkh() != null) && (((dji)bkh()).cRV() != null)) {
      u(((dji)bkh()).cRV());
    }
    super.bkz();
  }

  public void bkE()
  {
    jI(true);
    super.bkE();
  }

  public final void B(aVc paramaVc)
  {
    a(paramaVc);
    dji localdji = (dji)bkh();
    cVG();
    if ((localdji == null) || (!localdji.cSa()))
      return;
    a(localdji);
  }

  private void cVG() {
    ZS localZS = bkh();
    if ((localZS == null) || (!(localZS instanceof dji)))
      return;
    List localList = ((dji)localZS).cpz();
    if ((localList == null) || (localList.isEmpty()))
      return;
    for (bxS localbxS : localList)
      try {
        localbxS.b(this);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  private void a(dji paramdji)
  {
    switch (dOA.mgn[paramdji.cSb().ordinal()]) {
    case 1:
      kf(paramdji.cRZ());
      break;
    case 2:
      kf(Math.max(getValue() * paramdji.cRZ() / 100, 1));
    }
  }

  public void a(aVc paramaVc)
  {
  }

  protected void bkA()
  {
    super.bkA();
    ZS localZS = bkh();
    if ((localZS == null) || (!(localZS instanceof dji)))
      return;
    List localList = ((dji)localZS).cpz();
    if ((localList == null) || (localList.isEmpty()))
      return;
    for (bxS localbxS : localList)
      try {
        localbxS.a(this);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public final void c(aVc paramaVc, boolean paramBoolean)
  {
    try
    {
      a(paramaVc, paramBoolean);
    } catch (Exception localException1) {
      K.error("Exception lors de l'execution d'un effet " + (this.eWL != null ? ((dpI)this.eWL).yR() : getId()), localException1);
    }

    this.ksH = true;
    if (!this.loU) {
      try {
        b(paramaVc, paramBoolean);
      } catch (Exception localException2) {
        K.error("Exception levee lors de la notification de l'execution", localException2);
      }
    }
    this.loU = false;

    super.c(paramaVc, paramBoolean);
  }

  protected abstract void a(aVc paramaVc, boolean paramBoolean);

  public boolean aiz()
  {
    return (super.aiz()) || ((this.eWL != null) && (((dpI)this.eWL).a(PY.coA)));
  }

  public boolean ct(byte paramByte)
  {
    boolean bool = false;
    try
    {
      bool |= super.ct(paramByte);

      if ((this.ejP == null) || (!(this.ejP instanceof dMC)))
        return bool;
      byte b;
      switch (paramByte) {
      case 3:
        b = 31;
        break;
      case 1:
        b = 11;
        break;
      case 2:
        b = 21;
        break;
      case 4:
        b = 41;
        break;
      case 6:
        b = 61;
        break;
      case 5:
      default:
        K.error("Pas de type de trigger global correspondant " + paramByte);
        return bool;
      }

      Iterator localIterator = this.ejP.LE().Lz();
      while (localIterator.hasNext()) {
        dle localdle = (dle)localIterator.next();
        bool |= localdle.a(DV(), this, b);
      }
    } catch (Exception localException) {
      K.error("Exception catchée : ", localException);
    }
    return bool;
  }

  protected dle z(aVc paramaVc)
  {
    if ((paramaVc == null) || (this.eWL == null)) {
      return this.evp;
    }
    aVe localaVe = ((dpI)this.eWL).atV();
    try {
      switch (dOA.mgo[localaVe.ordinal()]) {
      case 1:
        K.error("Pas de type de cibles spécifiée pour un effet déclenché, on retrourne la cible originale, id : " + ((dpI)this.eWL).yR());
        return this.evp;
      case 2:
        return this.evp;
      case 3:
        return bkq().axG();
      case 4:
        return this.evo;
      case 5:
        return paramaVc.bke();
      case 6:
        return paramaVc.bkf();
      }
      K.error("Type de cible d'effet declenché inconnue " + localaVe);
      return this.evp;
    }
    catch (Exception localException) {
      K.error("Erreur lors de la récupération du triggering target sur l'effet " + ((dpI)this.eWL).yR(), localException);
    }return null;
  }

  protected dle A(aVc paramaVc)
  {
    if ((this.eWL == null) || (paramaVc == null)) {
      return this.evo;
    }
    cSp localcSp = ((dpI)this.eWL).atW();
    if (localcSp == null)
      return this.evo;
    try {
      switch (dOA.mgp[localcSp.ordinal()]) {
      case 1:
        K.error("Pas de type de caster spécifié pour un effet déclenché, on retourne la cible originale, id : " + ((dpI)this.eWL).yR());
        return this.evo;
      case 2:
        return this.evo;
      case 3:
        return bkq().axG();
      case 4:
        return this.evp;
      case 5:
        return paramaVc.bke();
      case 6:
        return paramaVc.bkf();
      }
      K.error("Type de cible d'effet declenché inconnue " + localcSp);
      return this.evo;
    }
    catch (Exception localException) {
      K.error("Erreur lors de la récupération du triggering caster sur l'effet " + ((dpI)this.eWL).yR(), localException);
    }return null;
  }

  protected boolean bkP()
  {
    boolean bool = super.bkP();

    if ((this.evp != null) && (!this.evp.byd()) && (this.evp.cly()) && (this.evp.adX())) {
      this.evp.he(true);
      bool = true;
      this.evp.d(this.evo);
      if (this.evp != null) {
        this.evp.he(false);
      }
    }

    if ((this.evp != null) && (this.evp.aJu()) && (this.evp.clu()) && (this.evp.adX())) {
      this.evp.he(true);
      bool = true;
      this.evp.c(this.evo);
      if (this.evp != null) {
        this.evp.he(false);
      }
    }
    return bool;
  }

  protected Long bWp() {
    if (this.eWL != null) {
      if ((((dpI)this.eWL).zN()) && (this.evo != null))
        return Long.valueOf(this.evo.getId());
      if ((((dpI)this.eWL).aul()) && (this.evp != null))
        return Long.valueOf(this.evp.getId());
    }
    if (this.evp != null)
      return Long.valueOf(this.evp.getId());
    if (this.evo != null)
      return Long.valueOf(this.evo.getId());
    return null;
  }

  public void bkH()
  {
    if (this.eWM == null) {
      return;
    }
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).aMG() != 2) {
      return;
    }
    if (this.ejP.LH() == null) {
      return;
    }
    if (!cVH()) {
      return;
    }
    aAU localaAU = (aAU)this.eWL;
    this.ejP.LH().a(new clw(this, bWp().longValue()), localaAU.aW(cVC()));
  }

  private boolean cVH() {
    if (bWp() == null) {
      K.error("[DESIGN EFFECT] Pas de point d'attache dans la timeline (#" + oj() + ' ' + bkC() + ')');
      return false;
    }
    return true;
  }

  public void bkI()
  {
    if ((this.eWL == null) || (((dpI)this.eWL).aMG() != 2) || (this.ejP.LH() == null)) {
      return;
    }
    aAU localaAU = (aAU)this.eWL;

    a(localaAU.aV(cVC()));
  }

  public cUz bkJ()
  {
    return this.eWY;
  }

  public void cVI()
  {
    if (!bkL()) {
      bkI();
      return;
    }

    aAU localaAU = (aAU)this.eWL;
    cuf localcuf = localaAU.aV(cVC());
    int i = localcuf.csD() - localaAU.aW(cVC()).csD();
    if (localcuf.bCT())
      i++;
    localcuf.wO(i);

    a(localcuf);
  }

  protected void a(cuf paramcuf) {
    if (paramcuf.csE()) {
      return;
    }
    if (!cVH()) {
      return;
    }
    tl localtl = this.ejP.LH();
    this.eWY = localtl.Ba();
    this.loV = localtl.a(new oo(this, bWp().longValue()), paramcuf);
  }

  public bvk bkK()
  {
    return this.loV;
  }

  public int bWm() {
    if ((this.eWL != null) && (((dpI)this.eWL).aMG() == 1) && 
      (this.loW < 0)) {
      this.loW = ((dBu)bkc()).bz(cVC());
    }

    return this.loW;
  }

  public void AU(int paramInt) {
    this.loW = paramInt;
  }

  public boolean bkM()
  {
    if (this.eXd) {
      return false;
    }
    if (isInfinite()) {
      return true;
    }
    if (this.eWL != null)
    {
      Object localObject;
      switch (((dpI)this.eWL).aMG()) {
      case 2:
        localObject = (aAU)this.eWL;
        cuf localcuf = ((aAU)localObject).aV(cVC());
        return (super.bkM()) || ((localcuf != null) && (!localcuf.csE()));
      case 1:
        localObject = (dBu)this.eWL;
        return ((dBu)localObject).bz(cVC()) > 0;
      case 0:
        return true;
      }
    }

    return false;
  }

  public boolean bWn() {
    return (bkc() == null) || (((dpI)bkc()).aMG() == 1);
  }

  public boolean isInfinite()
  {
    if (this.eWL == null)
      return false;
    short s = cVC();
    Object localObject;
    switch (((dpI)this.eWL).aMG()) {
    case 2:
      localObject = (aAU)this.eWL;
      cuf localcuf = ((aAU)localObject).aV(s);
      return (localcuf != null) && (localcuf.csD() < 0);
    case 1:
      localObject = (dBu)this.eWL;
      return ((dBu)localObject).bz(s) < 0;
    case 0:
      return true;
    }

    return true;
  }

  public boolean bkL()
  {
    if (this.eWL == null)
      return false;
    if (this.eWM == null) {
      return false;
    }
    if (((dpI)this.eWL).aMG() != 2) {
      return false;
    }
    return !((aAU)this.eWL).aW(cVC()).csE();
  }

  public bTI Cz()
  {
    return null;
  }

  public void bkx()
  {
    bTI localbTI = Cz();
    if (localbTI == null) {
      localbTI = cVJ();
    }
    if (localbTI == null)
      return;
    this.eWR.set(localbTI.bZW());
  }

  protected bTI cVJ() {
    if (wa() == null)
      return null;
    int i = ((bqk)wa()).nS();
    if (i == 11)
      return ((bfE)wa()).Cz();
    return null;
  }

  public int cVK() {
    return this.loS;
  }

  public boolean cVL() {
    return this.ksH;
  }

  public int czG() {
    return this.ixr;
  }

  public boolean Cu()
  {
    if ((this.eWL != null) && (!((dpI)this.eWL).on()) && (!afW()) && (this.evp != null) && (this.evp.aJu()))
    {
      return false;
    }
    if (CA()) {
      return false;
    }
    if ((this.evp != null) && (!this.evp.bGg())) {
      return false;
    }
    if (this.eWL == null) {
      return true;
    }
    if (!cVN()) {
      return false;
    }
    dji localdji = (dji)bkh();
    if (((localdji == null) || (!localdji.cRU())) && 
      (!D(null)))
      return false;
    if ((localdji != null) && (localdji.cRX())) {
      return false;
    }
    short s = cVC();

    boolean bool = true;
    if ((bkh() == null) || (!((dji)bkh()).cRT())) {
      bool = dpe.AX(100) <= bMr.ax(((dpI)this.eWL).bm(s));
    }
    return bool;
  }

  protected boolean CA() {
    return false;
  }

  protected boolean cVM() {
    if (((this.eWM instanceof bJC)) && 
      (((bJC)this.eWM).bRh() == bGX.gEa)) {
      return false;
    }

    return (this.evp != null) && (this.evp.c(cfY.hCv));
  }

  private boolean cVN() {
    int i = cVC();

    int j = ((dpI)this.eWL).zB();
    int k = ((dpI)this.eWL).zC();

    return (i >= j) && (i <= k);
  }

  public boolean w(aVc paramaVc)
  {
    if ((!afW()) && (this.evp != null) && (this.evp.aJu()))
      return false;
    if (this.eWL == null)
      return true;
    if (!D(paramaVc))
      return false;
    if (!cVN())
      return false;
    short s = cVC();
    return dpe.AX(100) <= bMr.ax(((dpI)this.eWL).bm(s));
  }

  boolean D(aVc paramaVc) {
    dle localdle1 = aug() ? A(paramaVc) : this.evo;
    dle localdle2 = aug() ? z(paramaVc) : this.evp;
    if (((dpI)this.eWL).bew() != null);
    return ((dpI)this.eWL).bew().i(localdle1, localdle2 == null ? this.eUw : localdle2, this, this.ejP);
  }

  protected boolean afW()
  {
    if (a(PY.coK))
      return true;
    if (cVO()) {
      return true;
    }
    return (bkw() != null) && (bkw().get(1010));
  }

  private boolean cVO() {
    bqk localbqk = (bqk)wa();
    if (localbqk == null) {
      return false;
    }
    int i = localbqk.nS();
    if (i == 25) {
      if (((bfE)localbqk).bsP() == 2040L)
        return true;
    }
    else if (i == 1) {
      int j = ((bJC)localbqk).bQW();
      if (j == 1793)
        return true;
      if (j == 1793)
        return true;
    }
    return false;
  }

  public byte bou() {
    return this.loT;
  }

  public void fe(byte paramByte) {
    this.loT = paramByte;
  }

  public duF bkW()
  {
    return dzg.dcV();
  }

  public cCH bkV()
  {
    return this.lpa;
  }

  protected void v(aVc paramaVc)
  {
    super.v(paramaVc);
    this.loT = ((doA)paramaVc).bou();
    this.loV = paramaVc.bkK();
    this.loZ = ((doA)paramaVc).loZ;
  }

  public cCH bkU()
  {
    return this.lpb;
  }

  private boolean jO(long paramLong)
  {
    bJC localbJC = cNO.cFX().yH((int)paramLong);
    if (localbJC == null) {
      return false;
    }
    this.eWM = localbJC.cJ(bJC.nb((int)paramLong));
    return true;
  }

  public boolean a(dle paramdle, long paramLong) {
    if (paramdle == null)
      return false;
    dDN localdDN = paramdle.atO();
    if (localdDN == null) {
      return false;
    }
    for (aVc localaVc : localdDN)
      if (localaVc.getId() == bsj.fSj.getId())
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC == null) {
          K.error("Un StateRunningEffect avec un etat inexistant ??? re.getId() = " + localaVc.getId());
        }
        else if (localbJC.bQX() == paramLong) {
          b(localbJC);
          return true;
        }
      }
    return false;
  }

  public boolean cVP() {
    dpI localdpI = (dpI)bkc();
    if (localdpI == null) {
      return false;
    }
    bqk localbqk = (bqk)wa();
    if (localbqk == null) {
      return false;
    }
    int i = localbqk.nS();
    if ((i != 12) && (i != 14) && (i != 31))
    {
      return false;
    }
    return !localdpI.bev();
  }

  public boolean C(aVc paramaVc)
  {
    try {
      return (paramaVc != null) && (paramaVc.getValue() == getValue()) && ((paramaVc.bkg() == null) || (paramaVc.bkg().equals(bkg()))) && (paramaVc.bke() == bke()) && (paramaVc.wa() == wa()) && (paramaVc.bkc() == bkc()) && (paramaVc.bkK() == bkK()) && (paramaVc.getId() == getId()) && (paramaVc.bki() == bki());
    }
    catch (Exception localException)
    {
      K.warn(bBd.g(localException));
    }return false;
  }

  public boolean bWq()
  {
    if (beF()) {
      return false;
    }

    return (aug()) || (bkL()) || (this.loX);
  }

  public boolean cVQ() {
    if (beF())
      return false;
    if ((bkM()) && (!cVP())) {
      return true;
    }
    return this.loX;
  }

  protected void bkm()
  {
    if ((this.eWL != null) && (((dpI)this.eWL).auj() >= 0))
      this.eWS = ((int)(((dpI)this.eWL).auj() + cVC() * ((dpI)this.eWL).zx()));
    else
      this.eWS = -1;
  }

  public boolean isPersistent()
  {
    return false;
  }

  public boolean cVR() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 19);
  }

  public boolean cVS() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 17);
  }

  public boolean cVT() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 25);
  }

  public boolean yP() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 32);
  }

  public boolean cVU() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 28);
  }

  public boolean cVV() {
    return (this.eWM != null) && (((bqk)this.eWM).nS() == 34);
  }

  public boolean cVW() {
    if (wa() == null)
      return false;
    if (!(wa() instanceof bJC))
      return false;
    return ((bJC)wa()).NT();
  }

  public boolean atS() {
    if (this.eWL == null)
      return false;
    return ((dpI)this.eWL).atS();
  }

  protected aVc W(aVc paramaVc)
  {
    Object localObject;
    if (paramaVc != null)
      localObject = paramaVc;
    else if (bkh() != null)
      localObject = ((dji)bkh()).cRV();
    else
      localObject = null;
    return localObject;
  }

  public void cVX() {
    if ((bkq() == null) && (!akZ()))
      release();
  }

  static
  {
    ed(true);
  }
}