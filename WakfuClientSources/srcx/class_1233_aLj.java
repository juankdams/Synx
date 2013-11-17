import java.util.BitSet;

public final class aLj extends hq
  implements amo, dhy
{
  private int aSf;
  private final cCq bUG;

  public aLj(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;
    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    this.bUG = localaqL.aCR();
  }

  private aLj() {
    this.bUG = new aqL(this).aCR();
  }

  public void aJ()
  {
    super.aJ();
  }

  public void bc()
  {
    super.bc();
    ps();
  }

  public cjK Ub()
  {
    return new aLj();
  }

  public aLj i(agg paramagg)
  {
    aLj localaLj = (aLj)super.a(paramagg);
    localaLj.bUG.b(this.bUG);
    localaLj.initialize();
    return localaLj;
  }

  public void h(byte paramByte)
  {
    super.h(paramByte);
    if ((this.bUG.cyt() != null) && (this.bUG.cyt().equals("[#1]")))
      this.bUG.nb(Integer.toString(clP.hQB[(paramByte - 1)]));
  }

  public void t(boolean paramBoolean)
  {
    super.t(paramBoolean);
    if (paramBoolean)
      this.bUG.xp(100);
  }

  public int uN()
  {
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