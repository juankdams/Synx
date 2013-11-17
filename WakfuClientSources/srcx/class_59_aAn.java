import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public abstract class aAn extends cjK
  implements aqm, axQ, bqk
{
  public static final short aET = 1;
  public static final short aEU = 1;
  public static final short aEV = 1;
  protected BitSet dSO;
  protected Set dSP;
  protected short cZu;
  protected bIL dSQ;
  private boolean dSR = true;
  private byte bml = -1;
  protected dhJ dSS;

  protected aAn(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    l(paramArrayOfFloat2);
  }

  private void l(float[] paramArrayOfFloat) {
    if (!aF().cu(paramArrayOfFloat == null ? 0 : paramArrayOfFloat.length))
      K.error("effectArea possédant un mauvais nombre de paramètres");
  }

  protected aAn()
  {
  }

  public aAn a(agg paramagg)
  {
    aAn localaAn = (aAn)super.a(paramagg);
    localaAn.dSO = this.dSO;
    localaAn.dSR = this.dSR;
    if (this.dSP != null) {
      localaAn.dSP = new HashSet(this.dSP);
    }
    if (paramagg != null)
    {
      localaAn.cZu = paramagg.nU();
    }
    else localaAn.cZu = this.cZu;

    return localaAn;
  }

  protected void e(dle paramdle)
  {
    super.e(paramdle);
    if ((paramdle != null) && (paramdle.aLY() == 20))
      this.bml = ((dhJ)paramdle).Fx();
  }

  public abstract void initialize();

  public boolean a(aVc paramaVc, alr paramalr)
  {
    if (((paramalr instanceof dMT)) && (c(aIm.egR)) && 
      (this.bml == ((dMT)paramalr).Fx())) {
      return false;
    }
    return super.a(paramaVc, paramalr);
  }

  public byte aLY() {
    return 2;
  }

  public cqm atJ() {
    return null;
  }

  public cqm a(dSc paramdSc)
  {
    return null;
  }

  public aoV atK() {
    return null;
  }

  public boolean b(dSc paramdSc)
  {
    return false;
  }

  public void b(dle paramdle)
  {
    a(10014, null, paramdle);
    super.b(paramdle);
  }

  public boolean pq()
  {
    if (this.fBJ == null) {
      return false;
    }
    if (this.fBJ.length != 4) {
      return false;
    }
    if ((this.fBJ[0] + nU() * this.fBJ[1] > 0.0F) || (this.fBJ[2] + nU() * this.fBJ[3] > 0.0F)) {
      return true;
    }

    return false;
  }

  public boolean c(Kf paramKf)
  {
    return (this.dSP != null) && (this.dSP.contains(paramKf));
  }

  public byte d(Kf paramKf)
  {
    if (this.dSP == null)
      return 0;
    return (byte)(this.dSP.contains(paramKf) ? 1 : 0);
  }

  public void a(Kf paramKf)
  {
    if (paramKf == null)
      return;
    if (this.dSP == null) {
      this.dSP = new HashSet();
    }
    this.dSP.add(paramKf);
  }

  public void s(int[] paramArrayOfInt) {
    if (paramArrayOfInt == null) {
      return;
    }
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      int j = paramArrayOfInt[i];
      aIm localaIm = aIm.mF(j);
      a(localaIm);
    }
  }

  public void j(Kf paramKf)
  {
    b(paramKf);
  }

  public void b(Kf paramKf)
  {
    if (this.dSP == null)
      return;
    this.dSP.remove(paramKf);
  }

  public void a(Kf paramKf, byte paramByte)
  {
    if (paramKf.rQ() != 4) {
      return;
    }
    if (paramByte > 0)
      a(paramKf);
  }

  public short nU() {
    return this.cZu;
  }

  public boolean pp()
  {
    return this.eWS < 0;
  }

  public void e(alr paramalr)
  {
    if ((this.ejP != null) && (this.ejP.LH() != null)) {
      tl localtl = this.ejP.LH();

      int i = (int)(this.fBJ[0] + nU() * this.fBJ[1]);
      int j = (int)(this.fBJ[2] + nU() * this.fBJ[3]);

      cuf localcuf = cuf.wN((short)i).hG(j > 0);

      localtl.a(new blt(this, paramalr.getId()), localcuf.dl((short)1));
    }
  }

  public void g(alr paramalr)
  {
    List localList = d(paramalr);
    Object localObject1;
    Object localObject2;
    if ((localList != null) && (!localList.isEmpty())) {
      for (localObject1 = localList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (alr)((Iterator)localObject1).next();
        if ((localObject2 != null) && ((localObject2 instanceof dle)) && (((dle)localObject2).atO() != null)) {
          ((dle)localObject2).atO().a(this, true, true);
        }
        k((alr)localObject2); }
    }
    else {
      if (this.ejP == null) {
        return;
      }
      localObject1 = this.ejP.LE();
      if (localObject1 == null) {
        return;
      }
      localObject2 = ((bcJ)localObject1).Lz();
      while (((Iterator)localObject2).hasNext()) {
        Object localObject3 = ((Iterator)localObject2).next();
        if ((localObject3 instanceof dle))
        {
          dle localdle = (dle)localObject3;
          if (localdle.atO() != null)
          {
            localdle.atO().a(this, true);
          }
        }
      }
    }
  }

  public boolean a(BitSet paramBitSet, alr paramalr) { if (paramBitSet == null) {
      return false;
    }
    if (this.hJk.intersects(paramBitSet)) {
      return true;
    }
    if (this.hJl.intersects(paramBitSet)) {
      return true;
    }
    return this.dSO.intersects(paramBitSet);
  }

  public void a(BitSet paramBitSet, aVc paramaVc, alr paramalr)
  {
    super.a(paramBitSet, paramaVc, paramalr);
    if (this.dSO.intersects(paramBitSet))
      aLZ();
  }

  private void aLZ()
  {
    dDN localdDN = this.dSQ.bkq();
    if (localdDN != null)
      localdDN.G(this.dSQ);
    else
      this.ejP.LC().h(this);
  }

  public void aMa()
  {
    super.aMa();
    if (this.dSQ == null) {
      return;
    }
    dDN localdDN = this.dSQ.bkq();
    if (localdDN != null)
      localdDN.G(this.dSQ);
  }

  public void ps()
  {
    if ((this.ejP instanceof b)) {
      ((b)this.ejP).a(this);
    }
    super.ps();
  }

  public short nY() {
    return 1;
  }

  public short nZ() {
    return 1;
  }

  public short oa() {
    return 1;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }

  public void a(BitSet paramBitSet) {
    this.dSO = paramBitSet;
  }

  public void a(bIL parambIL) {
    this.dSQ = parambIL;
  }

  public boolean ayb() {
    return true;
  }

  public void dc(boolean paramBoolean) {
    this.dSR = paramBoolean;
  }

  public boolean aMb()
  {
    return this.dSR;
  }

  public void dd(boolean paramBoolean)
  {
  }

  public byte Fx() {
    return this.bml;
  }

  public void as(byte paramByte) {
    this.bml = paramByte;
  }

  public bhh aJp() {
    return SB.ctz;
  }

  public long aJq()
  {
    if (this.fuA != null) {
      return this.fuA.getId();
    }
    return 0L;
  }

  public boolean aJr() {
    return false;
  }

  public int g(dSc paramdSc) {
    if (b(paramdSc)) {
      return a(paramdSc).max();
    }
    return 0;
  }

  public boolean i(Kf paramKf) {
    return false;
  }

  public boolean du(long paramLong) {
    bJC localbJC = dA(paramLong);
    return localbJC != null;
  }

  public int dv(long paramLong) {
    if (atO() == null) {
      return -1;
    }
    for (aVc localaVc : atO()) {
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramLong))
      {
        return ((bPD)localaVc).bWk().nU();
      }
    }
    return -1;
  }

  public boolean r(long paramLong1, long paramLong2) {
    bJC localbJC = dA(paramLong1);
    if (localbJC == null) {
      return false;
    }
    return paramLong2 == localbJC.nU();
  }

  private bJC dA(long paramLong) {
    if (atO() == null) {
      return null;
    }
    Iterator localIterator = atO().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.getId() == bsj.fSj.getId()) {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == paramLong)
          return localbJC;
      }
    }
    return null;
  }

  public boolean a(long paramLong1, long paramLong2, axQ paramaxQ) {
    if (atO() == null)
      return false;
    if (paramaxQ == null) {
      return false;
    }
    Iterator localIterator = atO().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.getId() == bsj.fSj.getId()) {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == paramLong1)
        {
          if (localbJC.nU() != paramLong2)
            return false;
          if (localaVc.bke() == null)
            return false;
          return localaVc.bke().getId() == paramaxQ.getId();
        }
      }
    }
    return false;
  }

  public boolean a(long paramLong, axQ paramaxQ) {
    if (atO() == null)
      return false;
    if (paramaxQ == null) {
      return false;
    }
    Iterator localIterator = atO().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.getId() == bsj.fSj.getId()) {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == paramLong)
        {
          if (localaVc.bke() == null)
            return false;
          return localaVc.bke().getId() == paramaxQ.getId();
        }
      }
    }
    return false;
  }

  public boolean s(long paramLong1, long paramLong2) {
    bJC localbJC = dA(paramLong1);
    if (localbJC == null)
      return false;
    return paramLong2 <= localbJC.nU();
  }

  public boolean a(afC paramafC) {
    return afC.cYB.a(paramafC);
  }

  public void bc()
  {
    super.bc();
    this.bml = -1;
    this.dSQ = null;
    this.dSP = null;
    this.dSS = null;
  }

  public String getName() {
    return toString();
  }

  public int aJt() {
    return 0;
  }

  public int kV(int paramInt) {
    return 0;
  }

  public boolean aJs() {
    return false;
  }

  protected dle aMc() {
    if ((c(aIm.egV)) && (this.fuA != null))
      return this.fuA;
    return this;
  }

  public void J(dhJ paramdhJ) {
    this.dSS = paramdhJ;
  }
}