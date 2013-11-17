import java.util.ArrayList;
import java.util.BitSet;

public abstract class fk extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Aura standard", new dou[0]) });

  private final long[] aCi = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  protected fk()
  {
  }

  public fk(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public void initialize()
  {
  }

  public int getType() {
    return xj.bpn.xj();
  }

  public int fa() {
    return this.fuA.fa();
  }

  public int fb() {
    return this.fuA.fb();
  }

  public short fc() {
    return this.fuA.fc();
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
  }

  public boolean a(BitSet paramBitSet, alr paramalr)
  {
    if ((paramalr == this.fuA) && 
      (paramBitSet.get(10004))) {
      return true;
    }

    return super.a(paramBitSet, paramalr);
  }

  public void a(BitSet paramBitSet, aVc paramaVc, alr paramalr)
  {
    if ((paramalr == this.fuA) && (
      (paramBitSet.get(10001)) || (paramBitSet.get(10002)))) {
      return;
    }

    super.a(paramBitSet, paramaVc, paramalr);
  }

  public boolean mj() {
    return false;
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aCi[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aCi;
    }
    return null;
  }

  public ArrayList b(alr paramalr)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramalr != null)
      localArrayList.add(paramalr);
    return localArrayList;
  }

  public boolean c(alr paramalr)
  {
    return true;
  }

  public void mk()
  {
  }
}