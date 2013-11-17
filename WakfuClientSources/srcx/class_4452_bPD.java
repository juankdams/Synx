import java.util.BitSet;
import org.apache.log4j.Logger;

public class bPD extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("paramètre d'etat", new dmb[] { new dmb("id", dnN.lnQ), new dmb("level", dnN.lnS) }) });
  private long gWp;
  private boolean gWq = false;
  private long gWr;
  private BitSet gWs = new BitSet();
  private boolean gWt;
  private final BitSet gLk = new BitSet();
  private bJC gWu;
  private boolean gWv;
  private cCH gWw = new dse(this);

  public qM aF()
  {
    return by;
  }

  public static bPD a(cOE paramcOE, dle paramdle, bqk parambqk, int paramInt)
  {
    bPD localbPD = new bPD();
    localbPD.gWu = null;
    localbPD.aw = bsj.fSj.getId();
    localbPD.eWQ = ((doA)bsj.fSj.getObject()).DU();
    localbPD.aH();
    localbPD.evo = paramdle;
    if (paramdle != null)
      localbPD.gWr = paramdle.getId();
    else
      localbPD.gWr = 0L;
    localbPD.gWs.clear();
    if ((parambqk != null) && (parambqk.ob() != null)) {
      localbPD.gWs.or(parambqk.ob());
    }
    localbPD.ejP = paramcOE;
    localbPD.gLk.clear();
    localbPD.cxl = paramInt;
    localbPD.gWq = true;
    boolean bool = localbPD.bWo();
    if (!bool) {
      K.error("Unable to checkout a state with id " + paramInt + " : unknown ID");
      return null;
    }
    localbPD.loW = localbPD.gWu.bQV();
    localbPD.eWS = -1;
    localbPD.gWv = false;
    localbPD.gWp = -1L;
    return localbPD;
  }

  public void bWi() {
    bWo();
    if (this.gWu != null)
      this.gWu.gi(true);
  }

  public bPD bWj()
  {
    bPD localbPD = new bPD();
    localbPD.gLk.clear();
    localbPD.gLk.or(this.gLk);
    localbPD.gWu = this.gWu;
    localbPD.gWq = true;
    localbPD.loW = this.loW;
    localbPD.gWr = this.gWr;
    localbPD.gWs.clear();
    localbPD.gWs.or(this.gWs);
    localbPD.gWv = this.gWv;
    if (this.gWv)
      localbPD.bkH = this.bkH;
    localbPD.gWt = this.gWt;
    localbPD.gWp = this.gWp;
    return localbPD;
  }

  protected void v(aVc paramaVc)
  {
    super.v(paramaVc);
    if (this.gWv)
      this.bkH = paramaVc.oj();
  }

  public bPD d(cOE paramcOE)
  {
    gx(true);

    bPD localbPD = (bPD)bko();
    localbPD.bkH = this.bkH;
    localbPD.ejP = paramcOE;
    localbPD.bWo();

    if ((paramcOE.LA() == 0) || (paramcOE.LA() == 3))
    {
      if ((localbPD.loW == -1) && (this.ejP.LA() == 1) && (this.ejP.LH() != null) && (bkK() != null))
      {
        tl localtl = this.ejP.LH();
        localbPD.loW = (localtl.a(bkK()) * 30000);
        localbPD.gWp = -1L;
      } else if (localbPD.gWp <= 0L)
      {
        localbPD.loW = (this.gWu.bdm() * 30000);
      } else if (localbPD.gWp > 0L)
      {
        int i = (int)(System.currentTimeMillis() - localbPD.gWp);
        int j = localbPD.loW - i;
        localbPD.loW = Math.max(1, j);
        localbPD.gWp = -1L;
      }
    }
    else
    {
      localbPD.gWp = System.currentTimeMillis();

      dDN localdDN = bkq();
      if ((localdDN != null) && ((localdDN instanceof bgJ))) {
        long l = ((bgJ)localdDN).E(this);
        localbPD.loW = ((int)Math.max(1L, l));
      } else {
        localbPD.loW = this.loW;
      }
    }
    return localbPD;
  }

  public bJC bWk()
  {
    return this.gWu;
  }

  public boolean isPersistent()
  {
    return true;
  }

  public boolean bWl() {
    return this.gWv;
  }

  public void gx(boolean paramBoolean) {
    this.gWv = paramBoolean;
  }

  public void e(BitSet paramBitSet) {
    if (paramBitSet != null)
      this.gLk.or(paramBitSet);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.cxl > 0) && (this.gWq)) {
      if ((this.evp != null) && (this.evp.atO() != null))
      {
        bWo();
        if (this.gWu != null) {
          if (bkt())
          {
            if (bWl())
              jJ(true);
            if (!RI()) {
              b(paramaVc, paramBoolean);
            }

            for (dpI localdpI : this.gWu) {
              doA localdoA = (doA)((doA)bsj.bAv().kD(localdpI.eo())).bko();
              if (this.evp == null) {
                K.error("Impossible d'executer l'effet " + localdpI.yR() + " on a plus de cible");
                return;
              }
              localdoA.a(localdpI, this.gWu, this.ejP, this.evo, null, this.evp.fa(), this.evp.fb(), this.evp.fc(), bkh());
              if (cVF())
                localdoA.jH(true);
              if ((this.ejP.LA() == 1) && 
                (bkL())) {
                localdoA.bkH();
                break;
              }

              if (aM()) {
                localdoA.loV = this.loV;
                localdoA.k(this.evp);
              }
              localdoA.release();
            }
          }
          if ((this.evp != null) && ((this.evp instanceof dHW)))
            ((dHW)this.evp).a(new cpl(this));
        } else {
          K.error("State inconnu pour le client, mais vraisemblablement pas pour le serveur");
        }
      }
      this.gWq = false;
    }
    else {
      jJ(true);
    }
    this.gWv = false;
  }

  public boolean aug() {
    return false;
  }

  public boolean bkM()
  {
    bWo();
    return (isInfinite()) || ((this.gWu != null) && ((this.gWu.bdm() > 0) || (this.gWu.bQV() > 0)));
  }

  public boolean isInfinite()
  {
    bWo();
    if (this.gWu != null) {
      if (this.gWu.NT()) {
        return (this.gWu.bdm() < 0) && (this.gWu.bQV() < 0);
      }
      return (this.gWu.bdm() < 0) || (this.gWu.bQV() < 0);
    }return false;
  }

  public int bWm()
  {
    if (this.loW < 0) {
      bWo();
      if (this.gWu != null) {
        return this.gWu.bQV();
      }
      return 0;
    }
    return this.loW;
  }

  public boolean bWn()
  {
    return (this.loW > 0) && (this.gWp < 0L);
  }

  private boolean bWo()
  {
    if (this.gWu != null) {
      return true;
    }
    bJC localbJC = cNO.cFX().yH(this.cxl);
    if (localbJC == null) {
      return false;
    }
    this.gWu = localbJC.cJ(bJC.nb(this.cxl));
    this.gWu.gj(this.gWt);
    this.gLk.or(this.gWu.bQY());
    return true;
  }

  protected Long bWp() {
    if (this.gWu != null) {
      if ((this.gWu.bRd()) && (this.evo != null))
        return Long.valueOf(this.evo.getId());
      if ((!this.gWu.bRd()) && (this.evp != null))
        return Long.valueOf(this.evp.getId());
    }
    return super.bWp();
  }

  public void bkI()
  {
    bWo();

    if (this.gWu == null)
      return;
    if ((this.ejP == null) || (this.ejP.LH() == null)) {
      return;
    }
    cuf localcuf = this.gWu.bQU();

    if (!this.gWu.NT())
      a(localcuf);
  }

  public void aK()
  {
    super.aK();
  }

  public void a(aVc paramaVc)
  {
  }

  public BitSet auc()
  {
    return this.gLk;
  }

  public boolean bWq()
  {
    return super.bWq();
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

  public boolean bWr() {
    bWo();
    return this.gWu.NT();
  }

  public cCH lJ()
  {
    return this.gWw;
  }

  public long bWs()
  {
    return this.gWr;
  }

  public BitSet bWt() {
    return this.gWs;
  }

  public boolean NT() {
    if (this.gWu == null)
      return false;
    return this.gWu.NT();
  }

  public void gy(boolean paramBoolean) {
    this.gWt = paramBoolean;
  }

  public void bc() {
    super.bc();
    this.gWt = false;
    this.gWp = -1L;
  }
}