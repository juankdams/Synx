import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class cTE extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Warp standard", new dou[0]) });
  protected cYk boA;
  protected cYk boB;
  private long[] aGI = new long[1];

  public qM aF()
  {
    return aCh;
  }

  protected cTE() {
  }

  protected cTE(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public aAn a(agg paramagg) {
    cTE localcTE = (cTE)super.a(paramagg);
    if (this.boA != null) {
      localcTE.boA = new cYk(this.boA);
    }
    if (this.boB != null) {
      localcTE.boB = new cYk(this.boB);
    }
    return localcTE;
  }

  public void initialize()
  {
    Iterable localIterable;
    if (this.fuA != null)
      localIterable = clv().b(this.cGk.getX(), this.cGk.getY(), this.cGk.IB(), this.fuA.fa(), this.fuA.fb(), this.fuA.fc(), this.fuA.E());
    else {
      localIterable = clv().b(this.cGk.getX(), this.cGk.getY(), this.cGk.IB(), this.cGk.getX(), this.cGk.getY(), this.cGk.IB(), E());
    }

    Iterator localIterator = localIterable.iterator();
    if (localIterator.hasNext())
      this.boA = new cYk((int[])localIterator.next());
    else {
      throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
    }
    if (localIterator.hasNext())
      this.boB = new cYk((int[])localIterator.next());
    else {
      throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
    }
    if (localIterator.hasNext())
      throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
  }

  public int getType()
  {
    return xj.bpr.xj();
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aGI;
    }
    return null;
  }

  public List d(alr paramalr) {
    return Collections.emptyList();
  }

  public boolean c(alr paramalr) {
    return true;
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
}