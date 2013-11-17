import java.util.ArrayList;
import java.util.BitSet;

public abstract class abj extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Bomb combo standard", new dou[0]) });

  private final long[] aGI = new long[1];

  public qM aF()
  {
    return aCh;
  }

  protected abj() {
  }

  protected abj(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public long[] a(alr paramalr)
  {
    if (paramalr == null) {
      return null;
    }

    this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
    return this.aGI;
  }

  public ArrayList b(alr paramalr) {
    if (paramalr == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramalr);
    return localArrayList;
  }

  public boolean c(alr paramalr) {
    return true;
  }

  public int getType() {
    return xj.bpB.xj();
  }
}