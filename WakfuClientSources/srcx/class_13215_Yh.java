import java.util.BitSet;

public final class Yh extends cdr
  implements amo, dhy
{
  private static final short cIF = 1;
  private int aSf;
  private final cCq bUG;

  private Yh()
  {
    this.bUG = new aqL(this).aCR();
    this.bUG.a(new diV());
  }

  public Yh(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;

    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    localaqL.aK((short)1);
    this.bUG = localaqL.aCR();
    this.bUG.a(new diV());
  }

  public cjK Ub()
  {
    return new Yh();
  }

  public Yh c(agg paramagg)
  {
    Yh localYh = (Yh)super.a(paramagg);
    localYh.aSf = this.aSf;
    localYh.bUG.b(this.bUG);
    localYh.initialize();
    return localYh;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc)
  {
  }

  public int uN() {
    return this.aSf;
  }

  public void c(CG paramCG)
  {
    super.c(paramCG);
    if (this.bUG.cyG() != null)
      this.bUG.cyG().c(E());
  }

  public cCq Uc()
  {
    return this.bUG;
  }

  public boolean cz(String paramString) {
    return false;
  }

  public String getName()
  {
    if (this.bUG != null) {
      return this.bUG.getName();
    }

    return "";
  }
}