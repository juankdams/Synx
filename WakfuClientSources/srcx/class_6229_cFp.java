import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class cFp extends ahu
  implements dpI
{
  private static final double izu = 1.E-005D;
  private final float izv;
  private final float izw;
  private final float[] izx;
  private final int izy;
  private final boolean bbA;
  private final boolean bbq;
  private final boolean bbr;
  private final boolean bbs;
  private boolean bby;
  private final int bbi;
  private final int bbj;
  private final bZA izz;
  private boolean izA;
  private final byte izB;
  private List izC;
  private List izD;
  private List izE;
  private List izF;
  private List izG;
  private List izH;
  private final boolean izI;
  private final boolean izJ;
  private final boolean bbo;
  private int bbt;
  private boolean bbw = true;
  private boolean bbx = true;
  private aVe izK;
  private cSp izL;
  private final bbH izM;
  protected static final int[] eWj = new int[0];
  protected static final float[] eWq = new float[0];
  protected static final int[] izN = { 0 };
  private final float bbe;
  private boolean izO = false;
  private boolean izP;
  private Set dSP;

  public cFp(int paramInt1, int paramInt2, bbH parambbH1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, int[] paramArrayOfInt6, int[] paramArrayOfInt7, long paramLong, dRh paramdRh, boolean paramBoolean1, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3, int paramInt4, bZA parambZA, short paramShort, float paramFloat3, byte paramByte, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, bbH parambbH2, boolean paramBoolean11, boolean paramBoolean12, boolean paramBoolean13)
  {
    super(paramInt1, paramInt2, parambbH1, paramArrayOfInt1, paramArrayOfInt2, paramArrayOfInt3, paramArrayOfInt4, paramArrayOfInt5, paramArrayOfInt6, paramArrayOfInt7, paramLong, paramdRh, paramBoolean1, paramBoolean2, paramShort, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean7);

    this.izM = parambbH2;

    this.izv = paramFloat1;
    this.izw = paramFloat2;
    this.izx = paramArrayOfFloat;

    this.izy = (paramArrayOfFloat.length / 2);
    this.izB = paramByte;

    this.bbi = paramInt3;
    this.bbj = paramInt4;
    this.izz = parambZA;
    this.bbA = paramBoolean6;
    this.bbq = paramBoolean11;
    this.bbr = paramBoolean12;
    this.bbs = paramBoolean13;

    this.izI = paramBoolean8;
    this.izJ = paramBoolean9;

    this.bbe = paramFloat3;

    this.bbo = paramBoolean10;

    if ((paramInt2 != -1) && (paramInt2 != -2)) {
      doA localdoA = (doA)bsj.bAv().kD(paramInt2);
      if (localdoA == null) {
        K.error("Impossible de créer l'effet " + paramInt1 + " : action " + paramInt2 + " inconnue");
      }
      else if (!localdoA.aF().cu(paramArrayOfFloat.length))
        K.error("Impossible de créer l'effet " + paramInt1 + " : nombre de paramètres incorrect : " + paramArrayOfFloat.length);
    }
  }

  protected cFp(int paramInt1, int paramInt2, bbH parambbH1, BitSet paramBitSet1, BitSet paramBitSet2, BitSet paramBitSet3, BitSet paramBitSet4, BitSet paramBitSet5, BitSet paramBitSet6, BitSet paramBitSet7, long paramLong, dRh paramdRh, boolean paramBoolean1, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3, int paramInt4, bZA parambZA, short paramShort, float paramFloat3, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, bbH parambbH2, boolean paramBoolean11, boolean paramBoolean12, boolean paramBoolean13)
  {
    super(paramInt1, paramInt2, parambbH1, paramBitSet1, paramBitSet2, paramBitSet3, paramBitSet4, paramBitSet5, paramBitSet6, paramBitSet7, paramLong, paramdRh, paramBoolean1, paramBoolean2, paramShort, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6);

    this.izM = parambbH2;
    this.izv = paramFloat1;
    this.izw = paramFloat2;
    this.izx = paramArrayOfFloat;
    this.izy = (paramArrayOfFloat.length / 2);

    this.izB = -1;
    this.bbA = paramBoolean9;
    this.bbq = paramBoolean11;
    this.bbr = paramBoolean12;
    this.bbs = paramBoolean13;

    this.bbe = paramFloat3;

    this.bbi = paramInt3;
    this.bbj = paramInt4;
    this.izz = parambZA;

    this.izI = paramBoolean7;
    this.izJ = paramBoolean8;
    this.bbo = paramBoolean10;
  }

  public byte aMG() {
    return 0;
  }

  public float bm(short paramShort) {
    return this.izv + paramShort * this.izw;
  }

  public boolean bev() {
    return (this.izI) || (this.izJ);
  }

  public boolean om() {
    return this.izI;
  }

  public boolean on() {
    return this.izJ;
  }

  public boolean zH() {
    return this.bbo;
  }

  public byte ben() {
    return this.izB;
  }

  public float[] beo() {
    return this.izx;
  }

  public int bep() {
    return this.izy;
  }

  public int a(int paramInt, short paramShort, dNF paramdNF) {
    float f = o(paramInt, paramShort);

    switch (aPD.eMn[paramdNF.ordinal()]) {
    case 1:
      return bMr.ax(f);
    case 2:
      if (this.izx[(paramInt * 2 + 1)] >= 0.0F) {
        return (int)Math.floor(f);
      }
      return (int)Math.ceil(f);
    }
    return (int)f;
  }

  public float o(int paramInt, short paramShort)
  {
    if ((paramInt < 0) || (paramInt >= this.izx.length / 2)) {
      throw new IllegalArgumentException("Tentative de récupération d'un paramètre d'ID " + paramInt + " alors que le nombre de valeurs est de " + this.izx.length + " effet : " + yR());
    }

    float f = this.izx[(paramInt * 2 + 1)] * paramShort;
    if (Math.abs(f - Math.round(f)) < 1.E-005D) {
      f = Math.round(f);
    }
    return this.izx[(paramInt * 2)] + f;
  }

  public float nl(int paramInt) {
    if ((paramInt < 0) || (paramInt >= this.izx.length / 2)) {
      throw new IllegalArgumentException("Tentative de récupération d'un paramètre d'ID " + paramInt + " alors que le nombre de valeurs est de " + this.izx.length);
    }
    return this.izx[(paramInt * 2)];
  }

  public float xD(int paramInt) {
    if ((paramInt < 0) || (paramInt >= this.izx.length / 2)) {
      throw new IllegalArgumentException("Tentative de récupération d'un paramètre d'ID " + paramInt + " alors que le nombre de valeurs est de " + this.izx.length);
    }
    return this.izx[(paramInt * 2 + 1)];
  }

  public boolean beq()
  {
    return this.bbA;
  }

  public boolean ber() {
    return this.bbq;
  }

  public boolean bes() {
    return this.bbr;
  }

  public boolean bet() {
    return this.bbs;
  }

  public cFp bjQ() {
    cFp localcFp = new cFp(yR(), eo(), aui(), aua(), aub(), auc(), aud(), aue(), auf(), auh(), getFlags(), atZ(), zi(), this.izx, this.izv, this.izw, yL(), atU(), atT(), atX(), this.bbi, this.bbj, this.izz, auj(), zx(), aiz(), om(), on(), beq(), zH(), beA(), ber(), bes(), bet());
    localcFp.ddc = this.ddc;
    return localcFp;
  }

  public float zx() {
    return this.bbe;
  }

  public int zM() {
    return this.bbt;
  }

  public void ko(int paramInt) {
    this.bbt = paramInt;
  }

  public void a(aGX paramaGX) {
    this.ddc = paramaGX;
  }

  public void a(aVe paramaVe) {
    this.izK = paramaVe;
  }

  public aVe atV() {
    return this.izK;
  }

  public void a(cSp paramcSp) {
    this.izL = paramcSp;
  }

  public cSp atW() {
    return this.izL;
  }

  public boolean atU() {
    return this.izK == aVe.eXp;
  }

  public void dH(boolean paramBoolean) {
    super.ck(paramBoolean);
  }

  public bZA bew() {
    return this.izz;
  }

  public int zB() {
    return this.bbi;
  }

  public int zC() {
    return this.bbj;
  }

  public float cAS() {
    return this.izw;
  }

  public float bex() {
    return this.izv;
  }

  public void dI(boolean paramBoolean) {
    this.bbw = paramBoolean;
  }

  public boolean zP() {
    return this.bbw;
  }

  public boolean zQ() {
    return this.bbx;
  }

  public void dJ(boolean paramBoolean) {
    this.bbx = paramBoolean;
  }

  public boolean beC() {
    return this.izO;
  }

  public void hZ(boolean paramBoolean) {
    this.izO = paramBoolean;
  }

  public void a(cHP paramcHP) {
    if (this.izC == null)
      this.izC = new ArrayList();
    this.izC.add(paramcHP);
    k(paramcHP);
  }

  public void b(cHP paramcHP) {
    if (this.izD == null)
      this.izD = new ArrayList();
    this.izD.add(paramcHP);
    k(paramcHP);
  }

  public void c(cHP paramcHP) {
    if (this.izE == null)
      this.izE = new ArrayList();
    this.izE.add(paramcHP);
    k(paramcHP);
  }

  public void d(cHP paramcHP) {
    if (this.izF == null)
      this.izF = new ArrayList();
    this.izF.add(paramcHP);
    k(paramcHP);
  }

  public void e(cHP paramcHP) {
    if (this.izG == null)
      this.izG = new ArrayList();
    this.izG.add(paramcHP);
    k(paramcHP);
  }

  private void k(cHP paramcHP) {
    if (this.izH == null)
      this.izH = new ArrayList();
    if (!this.izH.contains(paramcHP))
      this.izH.add(paramcHP);
  }

  public Iterator bey() {
    return this.izC != null ? this.izC.iterator() : new btA();
  }

  public Iterator bez() {
    return this.izE != null ? this.izE.iterator() : new btA();
  }

  public boolean f(cHP paramcHP) {
    return (this.izD != null) && (this.izD.contains(paramcHP));
  }

  public boolean g(cHP paramcHP) {
    return (this.izF != null) && (this.izF.contains(paramcHP));
  }

  public boolean h(cHP paramcHP) {
    return (this.izC != null) && (this.izC.contains(paramcHP));
  }

  public boolean i(cHP paramcHP) {
    return (this.izE != null) && (this.izE.contains(paramcHP));
  }

  public boolean j(cHP paramcHP) {
    return (this.izG != null) && (this.izG.contains(paramcHP));
  }

  public List beB() {
    return this.izH;
  }

  public bbH beA() {
    return this.izM;
  }

  public void ia(boolean paramBoolean) {
    this.bby = paramBoolean;
  }

  public boolean beD() {
    return this.bby;
  }

  public boolean beE() {
    return this.izA;
  }

  public void ib(boolean paramBoolean) {
    this.izA = paramBoolean;
  }

  public boolean beF() {
    return this.izP;
  }

  public void ic(boolean paramBoolean) {
    this.izP = paramBoolean;
  }

  public void s(int[] paramArrayOfInt) {
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      int j = paramArrayOfInt[i];
      PY localPY = PY.gm(j);
      c(localPY);
    }
  }

  public void c(PY paramPY) {
    if (paramPY == null)
      return;
    if (this.dSP == null)
      this.dSP = new HashSet();
    this.dSP.add(paramPY);
  }

  public boolean a(PY paramPY) {
    if (this.dSP == null)
      return false;
    return this.dSP.contains(paramPY);
  }

  public bbq a(Ce paramCe, dle paramdle1, cOE paramcOE, avY paramavY, int paramInt1, int paramInt2, short paramShort, dle paramdle2, ZS paramZS)
  {
    if (!a(paramdle1, paramcOE, paramInt1, paramInt2, paramShort))
      return null;
    aVc localaVc = ((uY)paramavY.kD(eo())).a(paramcOE, null);
    bbq localbbq = localaVc.a(this, paramCe, paramcOE, paramdle1, paramInt1, paramInt2, paramShort, zH() ? paramdle1 : paramdle2, paramZS);
    if ((localaVc instanceof aVc))
      ((aVc)localaVc).release();
    return localbbq;
  }

  private boolean a(dle paramdle, cOE paramcOE, int paramInt1, int paramInt2, short paramShort)
  {
    if (beA() == null) {
      return true;
    }
    Iterable localIterable1 = dtf.cZk().a(paramdle, paramcOE.LE(), beA(), paramInt1, paramInt2, paramShort, atZ());
    for (Object localObject1 = localIterable1.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = ((Iterator)localObject1).next();
      if ((!(localObject2 instanceof aAn)) || (((aAn)localObject2).aeH()))
      {
        return false;
      }
    }
    Object localObject2;
    localObject1 = paramcOE.LB();
    if (localObject1 == null)
      return true;
    CG localCG;
    if (paramdle != null) {
      localObject2 = paramdle.ML();
      localCG = paramdle.E();
    } else {
      localObject2 = new cYk(paramInt1, paramInt2, paramShort);
      localCG = CG.bFM;
    }

    Iterable localIterable2 = beA().b(paramInt1, paramInt2, paramShort, ((cYk)localObject2).getX(), ((cYk)localObject2).getY(), ((cYk)localObject2).IB(), localCG);

    for (int[] arrayOfInt : localIterable2) {
      if (!((UG)localObject1).aq(arrayOfInt[0], arrayOfInt[1])) {
        return false;
      }
      if (((UG)localObject1).au(arrayOfInt[0], arrayOfInt[1]) != null)
        return false;
    }
    return true;
  }
}