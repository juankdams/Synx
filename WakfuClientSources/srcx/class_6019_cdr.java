import java.util.BitSet;
import java.util.List;

public abstract class cdr extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("LootArea standard", new dou[0]) });
  private CG ax;
  private final long[] aGI = new long[1];

  public qM aF()
  {
    return aCh;
  }

  protected cdr(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  protected cdr() {
  }

  public aAn a(agg paramagg) {
    aAn localaAn = super.a(paramagg);
    if ((paramagg != null) && (paramagg.E() != null)) {
      localaAn.c(paramagg.E());
    }
    else {
      localaAn.c(CG.bFI);
    }
    return localaAn;
  }

  public void initialize() {
  }

  public int getType() {
    return xj.bpw.xj();
  }

  public long[] a(alr paramalr)
  {
    this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
    return this.aGI;
  }

  public List d(alr paramalr) {
    return null;
  }

  public boolean c(alr paramalr) {
    return true;
  }

  public CG E() {
    return this.ax;
  }

  public void c(CG paramCG) {
    this.ax = paramCG;
  }
}