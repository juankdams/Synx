import java.util.ArrayList;
import java.util.BitSet;

public abstract class adW extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Case simple", new dou[0]) });

  private int aWH = xj.bpp.xj();
  private CG ax;

  public dJC mi()
  {
    return aCh;
  }

  public adW(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public adW f(agg paramagg)
  {
    adW localadW = (adW)super.a(paramagg);
    localadW.aWH = this.aWH;
    if ((paramagg != null) && (paramagg.E() != null)) {
      localadW.c(paramagg.E());
    }
    return localadW;
  }

  protected adW()
  {
  }

  public int getType() {
    return this.aWH;
  }

  public void dl(int paramInt) {
    this.aWH = paramInt;
  }

  public void initialize()
  {
  }

  public boolean c(alr paramalr)
  {
    return paramalr == this.fuA;
  }

  public long[] a(alr paramalr)
  {
    return null;
  }

  public ArrayList b(alr paramalr)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramalr);
    return localArrayList;
  }

  public byte bY()
  {
    return 6;
  }

  public void c(CG paramCG)
  {
    if (paramCG != null)
      this.ax = paramCG;
  }

  public CG E()
  {
    if (this.ax == null) {
      return super.E();
    }
    return this.ax;
  }
}