import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public abstract class cDo extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Case simple", new dou[0]) });

  private dDN dcP = null;

  public dJC mi()
  {
    return aCh;
  }

  public cDo(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  protected cDo() {
  }

  public void initialize() {
    this.dcP = new bgJ(this);
  }

  public dDN atO() {
    return this.dcP;
  }

  public int getType() {
    return xj.bpx.xj();
  }

  public long[] a(alr paramalr) {
    return null;
  }

  public List d(alr paramalr) {
    return Collections.emptyList();
  }

  public boolean c(alr paramalr) {
    return false;
  }

  public boolean aeH() {
    return true;
  }

  public boolean atP() {
    return true;
  }
}