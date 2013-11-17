import java.util.BitSet;

public final class aRS extends bbx
  implements amo, dhy
{
  private int aSf;
  private final cCq bUG;

  private aRS()
  {
    this.bUG = new aqL(this).aCR();
  }

  public aRS(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;
    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    this.bUG = localaqL.aCR();
  }

  public aRS bhW()
  {
    return new aRS();
  }

  public aRS j(agg paramagg)
  {
    aRS localaRS = (aRS)super.a(paramagg);
    localaRS.aSf = this.aSf;
    localaRS.bUG.b(this.bUG);
    localaRS.initialize();
    return localaRS;
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

  public void dd(boolean paramBoolean)
  {
    if (paramBoolean)
      axB.aIZ().c(this);
    else
      axB.aIZ().c(null);
  }

  public boolean cz(String paramString)
  {
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