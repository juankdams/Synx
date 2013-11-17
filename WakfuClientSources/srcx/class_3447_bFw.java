import java.util.BitSet;
import org.apache.log4j.Logger;

public class bFw extends doA
  implements cmD
{
  public static final int gAx = 1;
  public static final int gAy = 2;
  public static final int gAz = 4;
  public static final int gAA = 8;
  private static final qM by = new dzQ(new ec[] { new dLx("Dommages fixes", new dmb[] { new dmb("Dmg ou valeur %", dnN.lnR) }), new dLx("Dommages fixes + modificateur", new dmb[] { new dmb("Dmg ou valeur %", dnN.lnR), new dmb("mod : boost(1) / res (2) / rebound (4) / absorb(8) ", dnN.lnS) }), new dLx("Dommages variables", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR) }), new dLx("Dommages variables", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR), new dmb("mod : boost(1) / res (2) / rebound (4) / absorb(8) ", dnN.lnS) }) });

  private static final aee bx = new bOO(new cNF());
  protected bTI gAB;
  protected dnO gAC;
  protected int gAD;
  private int gAE;
  private int gAF;
  protected int gAG;
  private final cCH cum = new cNG(this, 4);

  public qM aF()
  {
    return by;
  }

  protected bFw()
  {
  }

  public bFw(bTI parambTI, dnO paramdnO) {
    this.gAB = parambTI;
    this.gAC = paramdnO;
    aH();
  }

  public static bFw a(cOE paramcOE, bTI parambTI, dnO paramdnO, int paramInt, dle paramdle) {
    bFw localbFw;
    try {
      localbFw = (bFw)bx.Mm();
      localbFw.aOr = bx;
    } catch (Exception localException) {
      localbFw = new bFw(parambTI, paramdnO);
      localbFw.aOr = null;
      localbFw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPLoss : " + localException.getMessage());
    }

    localbFw.b(paramcOE, parambTI, paramdnO, paramInt, paramdle);
    return localbFw;
  }

  protected void b(cOE paramcOE, bTI parambTI, dnO paramdnO, int paramInt, dle paramdle) {
    this.aw = bsj.fOB.getId();
    this.eWQ = ((doA)bsj.fOB.getObject()).DU();
    this.gAB = parambTI;
    this.gAC = paramdnO;
    aH();
    this.evp = paramdle;
    this.cxl = paramInt;
    this.eWS = -1;
    bNo();
    this.ejP = paramcOE;
    this.gAF = 0;
    this.gAE = 0;
  }

  public bFw mm()
  {
    bFw localbFw;
    try {
      localbFw = (bFw)bx.Mm();
      localbFw.aOr = bx;
    } catch (Exception localException) {
      localbFw = new bFw();
      localbFw.aOr = null;
      K.error("Erreur lors d'un newInstance sur un HPLoss : " + localException.getMessage());
    }

    a(localbFw);

    return localbFw;
  }

  protected void a(bFw parambFw) {
    parambFw.gAG = this.gAG;
    parambFw.gAB = this.gAB;
    parambFw.gAC = this.gAC;
  }

  public void release()
  {
    super.release();
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(2);
    bTI localbTI = Cz();
    dzW.a(localbTI, this);
  }

  protected void d(BitSet paramBitSet) {
    if (paramBitSet != null)
      this.eWR.or(paramBitSet);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl += bMr.ax(this.cxl * paramFloat / 100.0F);
      else {
        this.cxl = bMr.ax(this.cxl * paramFloat / 100.0F);
      }
      break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else {
        this.cxl = ((int)(this.cxl + paramFloat));
      }
      break;
    case 6:
      this.gAF = bMr.ax(paramFloat);
      break;
    case 5:
      this.gAE = bMr.ax(paramFloat);
      break;
    case 2:
    case 3:
    case 4:
    }

    this.cxl = Math.max(0, this.cxl);
  }

  public boolean Cu()
  {
    if (!super.Cu()) {
      return false;
    }

    if ((DV().get(2010)) && (this.evp != null)) {
      return (this.evp.b(eu.ayM)) || (this.evp.b(eu.aAg)) || (this.evp.b(eu.azR));
    }

    return true;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = 0;
    if (bkt()) {
      bNl();
      i = bNm();
    }

    if ((bkt()) && (this.evp != null) && (this.evo != null) && ((this.eWL == null) || (!((dpI)this.eWL).a(PY.cox))))
    {
      cqm localcqm = this.evp.a(eu.aAe);
      if (localcqm != null) {
        int j = localcqm.value();
        if ((j > 0) && (dpe.AX(100) <= j)) {
          this.cxl = ((int)Math.ceil(this.cxl * 0.7F));
          fe((byte)7);
          if ((aIq() instanceof dMC)) {
            dMC localdMC = (dMC)aIq();
            localdMC.z(this.evp);
          }
        }
      }

    }

    if (this.cxl < 0) {
      this.cxl = 0;
    }

    if ((this.evp != null) && (this.cxl >= 0)) {
      if (!this.evp.aJu()) {
        if (this.evp.b(eu.ayM))
          bNj();
        else {
          cVD();
        }
      }
      else if (this.evp.b(eu.ayX))
      {
        this.cxl = 1;
        this.evp.a(eu.ayX).gw(this.cxl);
      } else {
        cVD();
      }

      bNk();

      if ((bkt()) && 
        (i > 0) && (
        ((this.evp.b(eu.ayM)) && (!this.evp.a(eu.ayM).isZero())) || ((this.evp.b(eu.aAg)) && (!this.evp.a(eu.aAg).isZero()))))
      {
        b(paramaVc, paramBoolean);
        sC(i);
      }
    }
    else
    {
      jJ(true);
    }
  }

  private void bNj() {
    a(this.cxl, this.evp);
  }

  public void a(int paramInt, dle paramdle) {
    cqm localcqm1 = paramdle.a(eu.aAo);
    if ((localcqm1 != null) && (localcqm1.max() > 0) && (localcqm1.cpv()))
    {
      int i = localcqm1.gw(paramInt);
      paramInt -= i;
      if (bkt())
        this.gAG = i;
    }
    cqm localcqm2 = paramdle.a(eu.aAj);
    if ((localcqm2 != null) && (localcqm2.max() > 0) && (localcqm2.cpv()))
    {
      int j = localcqm2.gw(paramInt);
      paramInt -= j;
    }
    if (paramInt > 0)
      paramdle.a(eu.ayM).gw(paramInt);
  }

  private void bNk()
  {
    aYx localaYx = this.evp.atN();
    if ((localaYx == null) || (this.evo == null)) {
      return;
    }
    adr localadr = localaYx.E(this.evo.fa(), this.evo.fb(), this.evo.fc());
    if (localadr.aps() == 2)
      this.eWR.set(29);
  }

  private void bNl()
  {
    if ((this.gAD & 0x8) == 0) {
      return;
    }

    if ((this.evp.b(eu.azi)) && (!this.evp.c(cfY.hBs)))
    {
      int i = this.evp.e(eu.azi);
      int j = bMr.ax(this.cxl * i / 100.0F);

      if (j > 0) {
        if ((this.evp != null) && (this.evo != this.evp)) {
          aWl localaWl = aWl.c(this.ejP, Cz());
          localaWl.fe((byte)4);
          localaWl.kf(j);
          localaWl.b(bkc());
          localaWl.j(this.evp);
          localaWl.ct((byte)1);
          localaWl.bkz();
        }
        this.cxl -= j;
      }
    }
  }

  private int bNm() {
    if ((this.gAD & 0x4) == 0) {
      return 0;
    }
    if ((!this.evp.b(eu.azh)) || (this.evo.c(dKm.lXt))) {
      return 0;
    }

    int i = this.evp.e(eu.azh);
    int j = bMr.ax(this.cxl * i / 100.0F);

    if (j > 0) {
      this.cxl -= j;
    }
    return j;
  }

  private void sC(int paramInt) {
    if ((this.evo != null) && (this.evo != this.evp)) {
      bFw localbFw = (bFw)bko();
      if (((dpI)this.eWL).beq())
        localbFw.b(bdH.brN());
      else {
        localbFw.b(ef.kL());
      }

      localbFw.i(this.evp);
      localbFw.kf(paramInt);
      localbFw.bky();
      localbFw.bkr();
      localbFw.gAD = 0;
      localbFw.k(this.evo);
      localbFw.release();
    }
  }

  public void a(aVc paramaVc)
  {
    if (!K(paramaVc)) {
      return;
    }
    sD(this.gAD);
  }

  private boolean K(aVc paramaVc) {
    if (this.evp == null) {
      return false;
    }

    if (this.evp.aJu()) {
      this.cxl = 1;
      return false;
    }

    if (((this.evp instanceof cjK)) && (this.evp.b(eu.aAg)) && (!this.evp.c(aIm.egX)))
    {
      this.cxl = 0;
      return false;
    }

    if ((!this.evp.b(eu.ayM)) && (!this.evp.b(eu.aAg))) {
      return false;
    }

    b(paramaVc);
    bNn();
    return true;
  }

  public void bNn() {
    switch (cNE.ktg[this.gAC.ordinal()])
    {
    case 1:
      break;
    case 2:
      if (this.evo != null)
        this.cxl = bMr.ax(t(this.evo) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 3:
      if (this.evo != null)
        this.cxl = bMr.ax(u(this.evo) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 4:
      if (this.evo != null) {
        dle localdle = this.evo;
        this.cxl = bMr.ax(r(localdle) * this.cxl / 100.0F);
      } else {
        this.cxl = 0;
      }
      break;
    case 5:
      if (this.evp != null)
        this.cxl = bMr.ax(t(this.evp) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 6:
      if (this.evp != null)
        this.cxl = bMr.ax(u(this.evp) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 7:
      if (this.evp != null)
        this.cxl = bMr.ax(r(this.evp) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 8:
      if (this.evo != null)
        this.cxl = bMr.ax((t(this.evo) - r(this.evo)) * this.cxl / 100.0F);
      else {
        this.cxl = 0;
      }
      break;
    case 9:
      if (this.evp != null)
        this.cxl = bMr.ax((t(this.evp) - r(this.evp)) * this.cxl / 100.0F);
      else
        this.cxl = 0;
      break;
    }
  }

  private static int r(dle paramdle)
  {
    return paramdle.e(eu.ayM);
  }

  private static int s(dle paramdle) {
    int i = paramdle.e(eu.ayM);

    if (paramdle.b(eu.aAj)) {
      i += paramdle.e(eu.aAj);
    }
    return i;
  }

  private static int t(dle paramdle) {
    return paramdle.a(eu.ayM).max();
  }

  private static int u(dle paramdle) {
    int i = paramdle.a(eu.ayM).max();
    if (paramdle.b(eu.aAj)) {
      i += paramdle.a(eu.aAj).max();
    }
    return i;
  }

  protected void b(aVc paramaVc) {
    bNo();
    short s = cVC();
    if (this.eWL != null)
      switch (((dpI)this.eWL).bep()) {
      case 1:
        this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
        break;
      case 2:
        this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
        this.gAD = ((dpI)this.eWL).a(1, s, dNF.meh);
        break;
      case 3:
        this.cxl = dpe.ae(((dpI)this.eWL).a(0, s, dNF.meh), ((dpI)this.eWL).a(1, s, dNF.meh), ((dpI)this.eWL).a(2, s, dNF.meh));

        break;
      case 4:
        this.cxl = dpe.ae(((dpI)this.eWL).a(0, s, dNF.meh), ((dpI)this.eWL).a(1, s, dNF.meh), ((dpI)this.eWL).a(2, s, dNF.meh));

        this.gAD = ((dpI)this.eWL).a(3, s, dNF.meh);
        break;
      default:
        K.error("Nombre de paramètres incorrect dans un HPLoss : " + ((dpI)this.eWL).bep());
        this.cxl = 0;
      }
  }

  protected int bNo()
  {
    this.gAD = 15;
    return this.gAD;
  }

  public void bNp() {
    int i = 15;
    sD(15);
  }

  public void sD(int paramInt) {
    c(paramInt, (this.eWL != null) && (((dpI)this.eWL).cL(1L)), (this.eWL != null) && (((dpI)this.eWL).zi()));
  }

  public void c(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    gA localgA = null;
    if ((this.eWM != null) && (((bqk)this.eWM).nS() == 12)) {
      localgA = (gA)this.eWM;
    }

    aOB localaOB = new aOB(this.evo, this.evp, this.gAB);
    localaOB.setValue(this.cxl);
    localaOB.nq(paramInt);
    localaOB.dN(paramBoolean2);
    localaOB.I(localgA);
    localaOB.dO(paramBoolean1);
    localaOB.nr(this.gAE);
    localaOB.ns(this.gAF);

    localaOB.bfu();

    dzW.a(localaOB.bfE(), this);
    this.cxl = localaOB.getValue();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  protected boolean afW()
  {
    return true;
  }

  public bTI Cz()
  {
    bTI localbTI = this.gAB;
    if ((this.eWM != null) && (((bqk)this.eWM).nS() == 12) && (this.evp != null)) {
      int i = 0;

      int j = this.evp.d(kc.aMW);
      if (j > i) {
        i = j;
        localbTI = bTI.heW;
      }
      j = this.evp.d(kc.aMX);
      if (j > i) {
        i = j;
        localbTI = bTI.heX;
      }
      j = this.evp.d(kc.aMY);
      if (j > i) {
        i = j;
        localbTI = bTI.heY;
      }
      j = this.evp.d(kc.aMZ);
      if (j > i) {
        i = j;
        localbTI = bTI.heZ;
      }
      j = this.evp.d(kc.aNa);
      if (j > i) {
        i = j;
        localbTI = bTI.hfa;
      }
      j = this.evp.d(kc.aNb);
      if (j > i) {
        i = j;
        localbTI = bTI.hfb;
      }
    }
    return localbTI;
  }

  protected boolean CA()
  {
    return cVM();
  }

  public int bNq() {
    return this.gAG;
  }

  public void sE(int paramInt) {
    this.gAD = paramInt;
  }

  public cCH lJ()
  {
    return this.cum;
  }

  public void bc()
  {
    this.gAE = 0;
    this.gAF = 0;
    this.gAG = 0;
    super.bc();
  }
}