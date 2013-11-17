import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public abstract class wN extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Tunnel de sort standard", new dou[0]) });
  protected cYk boA;
  protected cYk boB;
  private long[] aGI = new long[1];

  public qM aF()
  {
    return aCh;
  }

  protected wN() {
  }

  protected wN(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public aAn a(agg paramagg) {
    wN localwN = (wN)super.a(paramagg);
    if (this.boA != null) {
      localwN.boA = new cYk(this.boA);
    }
    if (this.boB != null) {
      localwN.boB = new cYk(this.boB);
    }
    return localwN;
  }

  public void i(cYk paramcYk) {
    this.boA = paramcYk;
  }

  public void j(cYk paramcYk) {
    this.boB = paramcYk;
  }

  public void initialize() {
  }

  public int getType() {
    return xj.bpu.xj();
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aGI[0] = aUG.y(this.cGk);
      return this.aGI;
    }
    return null;
  }

  public List d(alr paramalr) {
    return Collections.emptyList();
  }

  public boolean c(alr paramalr) {
    dkv localdkv = this.ejP.agb();
    if (!localdkv.cST()) {
      return false;
    }

    return paramalr == axG();
  }

  public ByteBuffer pr() {
    ByteBuffer localByteBuffer = super.pr();
    localByteBuffer.putLong(aUG.B(this.boA.getX(), this.boA.getY(), this.boA.IB()));
    localByteBuffer.putLong(aUG.B(this.boB.getX(), this.boB.getY(), this.boB.IB()));
    return localByteBuffer;
  }

  public void u(ByteBuffer paramByteBuffer) {
    super.u(paramByteBuffer);
    this.boA = aUG.eF(paramByteBuffer.getLong());
    this.boB = aUG.eF(paramByteBuffer.getLong());
  }

  public int cc() {
    return super.cc() + 8 + 8;
  }

  public void mk() {
    ArrayList localArrayList = new ArrayList();
    if ((this.boA == null) || (this.boB == null)) {
      return;
    }
    localArrayList.add(this.boA.toIntArray());
    localArrayList.add(this.boB.toIntArray());

    cYk localcYk = new cYk(this.boB);
    localcYk.af(this.boA);

    this.dcQ = new bTY();
    this.dcQ.a(new int[] { 0, 0, localcYk.getX(), localcYk.getY() });
    this.hJs = localArrayList;
  }
}