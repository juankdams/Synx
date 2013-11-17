import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public abstract class chy extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Gisement standard", new dou[] { new dou("Niveau du gisement") }) });

  private final long[] aGI = new long[1];

  public qM aF()
  {
    return aCh;
  }

  protected chy(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  protected chy() {
  }

  public void initialize() {
  }

  public int getType() {
    return xj.bpv.xj();
  }

  public long[] a(alr paramalr)
  {
    this.aGI[0] = aUG.y(this.cGk);
    return this.aGI;
  }

  public List d(alr paramalr) {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.fuA);
    return localArrayList;
  }

  public boolean c(alr paramalr) {
    return paramalr == axG();
  }

  public int cjw() {
    return (int)vy(0);
  }
}