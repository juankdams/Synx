import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class cjK
  implements Ce, bWU, cBn, cSG, cdO, dMT, dle
{
  protected static final Logger K = Logger.getLogger(cjK.class);
  public static final int hJj = 45;
  protected BitSet hJk;
  protected BitSet hJl;
  protected cjT eqL;
  protected long hJm;
  protected long aTz;
  private byte hJn;
  protected final cYk cGk = new cYk();
  protected bbH dcQ;
  protected cOE ejP;
  protected aee aOr;
  protected dle fuA;
  protected int eWS;
  protected final ArrayList hJo = new ArrayList();
  protected float[] fBJ;
  private ayT ejO;
  protected int fBz;
  protected float[] baW;
  protected boolean fBA = false;
  protected boolean fBD = false;
  protected boolean fBE = true;
  protected boolean hJp = false;
  private boolean hJq = true;
  private boolean hJr = true;
  protected Iterable hJs;
  private boolean hJt = false;

  private boolean hJu = false;

  protected cjK()
  {
  }

  public int cc()
  {
    return 18;
  }

  public ByteBuffer pr() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(cc());
    localByteBuffer.putLong(this.aTz);
    localByteBuffer.putInt(this.cGk.getX());
    localByteBuffer.putInt(this.cGk.getY());
    localByteBuffer.putShort(this.cGk.IB());
    return localByteBuffer;
  }

  public void u(ByteBuffer paramByteBuffer) {
    this.aTz = paramByteBuffer.getLong();
    d(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
  }

  public int clr() {
    return 8;
  }

  public void aq(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    long l = localByteBuffer.getLong();
    if ((this.ejP != null) && (l != 0L))
      e(this.ejP.LD().bk(l));
    else
      K.error("contexte non initialisé");
  }

  public byte[] cls()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(clr());
    localByteBuffer.putLong(this.fuA != null ? this.fuA.getId() : 0L);
    return localByteBuffer.array();
  }

  public cjK(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    aJ();
    this.hJm = paramInt1;
    this.dcQ = parambbH;
    this.hJk = paramBitSet1;
    this.hJl = paramBitSet2;
    this.eWS = paramInt2;
    this.fBz = paramInt3;
    this.fBJ = paramArrayOfFloat1;
    this.baW = paramArrayOfFloat2;
    this.fBA = paramBoolean1;
    this.fBE = paramBoolean2;
  }

  public cjK a(bSU parambSU) {
    cjK localcjK = Ub();
    localcjK.b(this.dcQ);
    localcjK.hJk = this.hJk;
    localcjK.hJl = this.hJl;
    localcjK.eqL = this.eqL;
    localcjK.hJm = this.hJm;
    localcjK.eWS = this.eWS;
    localcjK.fBJ = this.fBJ;
    localcjK.fBz = this.fBz;
    localcjK.baW = this.baW;
    localcjK.fBA = this.fBA;
    localcjK.fBD = this.fBD;
    localcjK.hJq = this.hJq;
    localcjK.fBE = this.fBE;

    if (parambSU != null)
    {
      localcjK.aTz = parambSU.getId();
      localcjK.d(parambSU.getX(), parambSU.getY(), parambSU.IB());
      localcjK.ejP = parambSU.aIq();
      localcjK.e(parambSU.axG());
    }

    localcjK.hJo.clear();

    return localcjK;
  }

  protected abstract cjK Ub();

  public abstract int getType();

  public void aJ()
  {
    this.eqL = new cjT();
    this.aTz = 0L;
    this.cGk.setX(0);
    this.cGk.setY(0);
    this.cGk.dG((short)0);
    this.dcQ = null;
    this.ejP = null;
    this.fuA = null;
    this.eWS = 0;
    this.ejO = null;
    this.hJp = false;
    this.hJo.clear();
    this.hJt = false;
  }

  public void bc() {
    this.eqL = null;
    this.aTz = 0L;
    this.cGk.setX(0);
    this.cGk.setY(0);
    this.cGk.dG((short)0);
    this.dcQ = null;
    this.ejP = null;
    this.fuA = null;
    this.eWS = 0;
    this.ejO = null;
    this.hJp = false;
    this.hJo.clear();
    this.hJs = null;
  }

  public void release() {
    if (this.aOr != null) {
      try {
        this.aOr.y(this);
      } catch (Exception localException) {
        K.error("impossible");
      }
      this.aOr = null;
    } else {
      bc();
    }
  }

  public long clt() {
    return this.hJm;
  }

  public void a(ayT paramayT) {
    this.ejO = paramayT;
  }

  public cjT bKe() {
    return this.eqL;
  }

  public abstract boolean pp();

  public abstract boolean pq();

  protected byte aIo() {
    return 1;
  }

  public boolean a(BitSet paramBitSet, aVc paramaVc, byte paramByte)
  {
    if (atO() != null) {
      atO().a(paramBitSet, paramaVc, paramByte);
    }

    if (paramaVc == null) {
      return false;
    }

    byte b = aIo();

    if (paramByte == b) {
      int i = 1;

      if (paramaVc.bkc() == null)
      {
        cYk localcYk = paramaVc.bkg();
        if (!this.cGk.equals(localcYk)) {
          i = 0;
        }
      }
      if ((i != 0) && 
        (a(paramBitSet, paramaVc.bke()))) {
        a(paramBitSet, paramaVc, paramaVc.bke());
        return true;
      }
    }

    return false;
  }

  public dle axG()
  {
    return this.fuA;
  }

  public cqm a(dSc paramdSc)
  {
    return null;
  }

  public boolean b(dSc paramdSc) {
    return false;
  }

  public int e(dSc paramdSc)
  {
    cqm localcqm = a(paramdSc);
    if (localcqm != null) {
      return localcqm.value();
    }
    throw new UnsupportedOperationException("caractéristique inexistante " + paramdSc);
  }

  public CG E()
  {
    return CG.bFM;
  }

  public void c(CG paramCG) {
  }

  public CG atM() {
    return null;
  }

  public void g(CG paramCG)
  {
  }

  public aYx atN()
  {
    return null;
  }

  public boolean atL()
  {
    return (this.eWS == 0) && (!this.hJt);
  }

  public boolean clu() {
    return false;
  }

  public dDN atO()
  {
    return null;
  }

  public boolean bGg() {
    return true;
  }

  public long getId() {
    return this.aTz;
  }

  public long nT() {
    return this.aTz;
  }

  public int fa() {
    return this.cGk.getX();
  }

  public int fb() {
    return this.cGk.getY();
  }

  public short fc() {
    return this.cGk.IB();
  }

  public float getWorldX() {
    return this.cGk.getX();
  }

  public float getWorldY() {
    return this.cGk.getY();
  }

  public float getAltitude() {
    return this.cGk.IB();
  }

  public void d(int paramInt1, int paramInt2, short paramShort) {
    this.cGk.setX(paramInt1);
    this.cGk.setY(paramInt2);
    this.cGk.dG(paramShort);
  }

  public final void n(cYk paramcYk) {
    d(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public boolean mj()
  {
    return true;
  }

  public void q(int paramInt1, int paramInt2, short paramShort)
  {
    throw new UnsupportedOperationException("Teleport de BasicEffectArea non implémenté");
  }

  public void R(cYk paramcYk) {
    throw new UnsupportedOperationException("Teleport de BasicEffectArea non implémenté");
  }

  public int nS() {
    return 3;
  }

  public void a(duF paramduF) {
    this.eqL.add(paramduF);
  }

  public void a(duF[] paramArrayOfduF) {
    this.eqL.add(paramArrayOfduF);
  }

  public Iterator iterator() {
    return this.eqL.iterator();
  }

  public void b(bbH parambbH) {
    this.dcQ = parambbH;
  }

  public bbH clv() {
    return this.dcQ;
  }

  public void a(aee paramaee) {
    this.aOr = paramaee;
  }

  public boolean B(cYk paramcYk) {
    if (paramcYk == null) {
      return false;
    }
    return P(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public boolean P(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.dcQ != null) {
      if (this.hJs != null) {
        for (int[] arrayOfInt : this.hJs) {
          if ((arrayOfInt[0] == paramInt1) && (arrayOfInt[1] == paramInt2)) {
            return true;
          }
        }
        return false;
      }
      return this.dcQ.a(fa(), fb(), fc(), fa(), fb(), fc(), paramInt1, paramInt2, paramShort);
    }

    K.error("m_area est null");
    return false;
  }

  public boolean a(dle paramdle, int paramInt1, int paramInt2, short paramShort)
  {
    if (P(paramInt1, paramInt2, paramShort))
      return true;
    int i = paramdle.afD();
    if (i == 0)
      return false;
    for (int j = -i; j <= i; j++) {
      for (int k = -i; k <= i; k++) {
        if (P(paramInt1 + j, paramInt2 + k, paramShort)) {
          return true;
        }
      }
    }
    return false;
  }

  public void b(dle paramdle) {
    i(null);
    ps();
    this.hJp = true;
  }

  public void c(dle paramdle) {
  }

  public boolean a(int paramInt, alr paramalr) {
    BitSet localBitSet = new BitSet();
    localBitSet.set(paramInt);
    return a(localBitSet, paramalr);
  }

  public boolean vw(int paramInt) {
    return this.hJk.get(paramInt);
  }

  public boolean a(BitSet paramBitSet, alr paramalr)
  {
    if (this.hJk.intersects(paramBitSet)) {
      return true;
    }

    if (this.hJl.intersects(paramBitSet)) {
      return true;
    }
    return false;
  }

  public void a(int paramInt, aVc paramaVc, alr paramalr) {
    BitSet localBitSet = new BitSet();
    localBitSet.set(paramInt);
    a(localBitSet, paramaVc, paramalr);
  }

  public void b(BitSet paramBitSet, alr paramalr)
  {
    a(paramBitSet, null, paramalr);
  }

  public void a(BitSet paramBitSet, aVc paramaVc, alr paramalr)
  {
    if (this.hJk.intersects(paramBitSet)) {
      a(paramaVc, paramalr);
    }

    if (this.hJl.intersects(paramBitSet))
      g(paramalr);
  }

  public boolean vx(int paramInt)
  {
    BitSet localBitSet = new BitSet();
    localBitSet.set(paramInt);
    return (this.hJk.intersects(localBitSet)) || (this.hJl.intersects(localBitSet));
  }

  public void h(alr paramalr)
  {
    if (paramalr != null) {
      this.hJo.remove(paramalr);
    }
    l(paramalr);
  }

  public void i(alr paramalr)
  {
    if ((paramalr != null) && 
      (!this.hJo.contains(paramalr))) {
      this.hJo.add(paramalr);
    }

    m(paramalr);
  }

  public void hd(boolean paramBoolean)
  {
    this.hJq = paramBoolean;
  }

  protected boolean clw() {
    return this.hJq;
  }

  public boolean clx() {
    return this.fBE;
  }

  public boolean a(aVc paramaVc, alr paramalr)
  {
    if ((c(paramalr)) && (this.eWS != 0) && (!this.hJt))
    {
      if (pq()) {
        i(paramalr);
        e(paramalr);
      }

      j(paramalr);

      if (clw()) {
        if ((!pp()) && (this.eWS > 0)) {
          this.eWS -= 1;
        }

        if (this.ejO != null) {
          try {
            this.ejO.c(this, paramalr);
          } catch (Exception localException1) {
            K.error("Exception levee", localException1);
          }
        }

        long[] arrayOfLong = a(paramalr);
        this.hJt = true;
        if (arrayOfLong != null) {
          for (int i = arrayOfLong.length - 1; i >= 0; i--) {
            long l = arrayOfLong[i];
            try {
              a(aUG.eG(l), aUG.eH(l), aUG.eI(l), paramaVc);
            } catch (Exception localException3) {
              K.error("Exception levee lors de l'execution des effets d'une zone", localException3);
            }
          }
        }
        this.hJt = false;
      }

      if (this.ejO != null) {
        try {
          this.ejO.f(this);
        } catch (Exception localException2) {
          K.error("Exception levee", localException2);
        }
      }

      return true;
    }

    return false;
  }

  public abstract long[] a(alr paramalr);

  public abstract List d(alr paramalr);

  public abstract void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc);

  public abstract boolean c(alr paramalr);

  public abstract void e(alr paramalr);

  public float vy(int paramInt)
  {
    if ((this.baW == null) || (paramInt >= this.baW.length)) {
      K.error("appel d'un paramètre inexistant : " + paramInt);
      return -1.0F;
    }
    return this.baW[paramInt];
  }

  public int getParamCount() {
    if (this.baW == null)
      return 0;
    return this.baW.length;
  }

  public void g(alr paramalr) {
    List localList = d(paramalr);
    if (localList == null) {
      return;
    }
    for (alr localalr : localList) {
      if ((localalr != null) && ((localalr instanceof dle)) && (((dle)localalr).atO() != null)) {
        ((dle)localalr).atO().a(this, true);
      }
      k(localalr);
    }
  }

  public boolean c(Kf paramKf) {
    return false;
  }

  public void a(Kf paramKf) {
  }

  public byte d(Kf paramKf) {
    return 0;
  }

  public void a(Kf paramKf, byte paramByte)
  {
  }

  public void j(Kf paramKf)
  {
  }

  public void b(Kf paramKf) {
  }

  public boolean aJu() {
    return this.hJp;
  }

  public void ps() {
  }

  public boolean cly() {
    return aJu();
  }

  public boolean byd()
  {
    return aJu();
  }

  public void adZ()
  {
  }

  public void adY() {
  }

  public void d(dle paramdle) {
  }

  public void j(alr paramalr) {
    this.ejO.a(this, paramalr);
  }

  public void k(alr paramalr) {
    this.ejO.b(this, paramalr);
  }

  public void l(alr paramalr)
  {
  }

  public void m(alr paramalr)
  {
  }

  public void brW()
  {
  }

  public void aMa()
  {
  }

  public boolean bXy()
  {
    return false;
  }

  public byte bY()
  {
    return 0;
  }

  public byte afD()
  {
    return 0;
  }

  public boolean adX()
  {
    return !this.hJu;
  }

  public void he(boolean paramBoolean) {
    this.hJu = paramBoolean;
  }

  public byte Fx() {
    if (this.fuA != null) {
      return ((dMT)this.fuA).Fx();
    }
    return 0;
  }

  public byte cgE()
  {
    return this.hJn;
  }

  public void dF(byte paramByte) {
    this.hJn = paramByte;
  }

  protected void e(dle paramdle) {
    this.fuA = paramdle;
  }

  public boolean atP() {
    return false;
  }

  public boolean aeH() {
    return false;
  }

  public boolean atQ() {
    return false;
  }

  public boolean bvL() {
    return this.fBA;
  }

  public boolean bvO() {
    return this.fBD;
  }

  public void hf(boolean paramBoolean) {
    this.fBD = paramBoolean;
  }

  public void mk()
  {
    int i = this.fuA == null ? this.cGk.getX() : this.fuA.fa();
    int j = this.fuA == null ? this.cGk.getY() : this.fuA.fb();
    short s = this.fuA == null ? this.cGk.IB() : this.fuA.fc();
    CG localCG = this.fuA == null ? CG.bFM : this.fuA.E();
    this.hJs = this.dcQ.b(this.cGk.getX(), this.cGk.getY(), this.cGk.IB(), i, j, s, localCG);
  }

  public Iterable clz() {
    return this.hJs;
  }

  public boolean clA() {
    return this.hJr;
  }

  public void hg(boolean paramBoolean) {
    this.hJr = paramBoolean;
  }

  public boolean aMb() {
    return true;
  }

  public cYk ML() {
    return this.cGk;
  }

  public cjK clB() {
    return this;
  }

  public dle clC() {
    return this;
  }
}