import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public abstract class hq extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Heure standard", new dou[0]) });

  private final cYk aGF = new cYk();
  private boolean aGG = false;
  private byte aGH;
  private final long[] aGI = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  public hq(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  protected hq()
  {
  }

  public void initialize()
  {
  }

  public aAn a(agg paramagg)
  {
    hq localhq = (hq)super.a(paramagg);
    if (paramagg != null) {
      localhq.f(paramagg.axG().fa(), paramagg.axG().fb(), paramagg.axG().fc());
    }
    return localhq;
  }

  public int getType() {
    return xj.bpk.xj();
  }

  public boolean pn() {
    return this.aGG;
  }

  public void t(boolean paramBoolean) {
    this.aGG = paramBoolean;
  }

  public void h(byte paramByte) {
    this.aGH = paramByte;
  }

  public byte po() {
    return this.aGH;
  }

  public void f(int paramInt1, int paramInt2, short paramShort) {
    this.aGF.setX(paramInt1);
    this.aGF.setY(paramInt2);
    this.aGF.dG(paramShort);
  }

  public boolean pp() {
    return true;
  }

  public boolean pq() {
    return false;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc)
  {
  }

  public long[] a(alr paramalr)
  {
    if (paramalr == this.fuA) {
      this.aGI[0] = aUG.B(this.fuA.fa(), this.fuA.fb(), this.fuA.fc());
      return this.aGI;
    }
    return null;
  }

  public ArrayList b(alr paramalr) {
    ArrayList localArrayList = new ArrayList();
    if (this.fuA != null) {
      localArrayList.add(this.fuA);
    }
    return localArrayList;
  }

  public boolean c(alr paramalr)
  {
    return this.fuA == paramalr;
  }

  public void e(alr paramalr) {
  }

  public int cc() {
    return super.cc() + 4 + 4 + 2;
  }

  public ByteBuffer pr() {
    ByteBuffer localByteBuffer = super.pr();
    localByteBuffer.putInt(this.aGF.getX());
    localByteBuffer.putInt(this.aGF.getY());
    localByteBuffer.putShort(this.aGF.IB());
    return localByteBuffer;
  }

  public void u(ByteBuffer paramByteBuffer) {
    super.u(paramByteBuffer);
    f(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
  }

  public void ps() {
    super.ps();

    ArrayList localArrayList = new ArrayList();
    Iterator localIterator;
    cjK localcjK;
    if (this.ejP != null) {
      for (localIterator = this.ejP.LC().bbj().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
        if ((localcjK != this) && (localcjK.fa() == fa()) && (localcjK.fb() == fb()) && (localcjK.fc() == fc()) && (localcjK.axG() == axG()))
        {
          localArrayList.add(localcjK);
        }
      }
      for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
        this.ejP.LC().h(localcjK);
      }
    }
  }
}