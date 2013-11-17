import java.util.BitSet;

public final class beb extends aho
  implements amo, awH, caY, dhy
{
  private static final short fqM = 9;
  private int aSf;
  private final cCq bUG;

  private beb()
  {
    this.bUG = new aqL(this).aCR();
    this.bUG.a(new diV());
  }

  public beb(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;
    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    localaqL.aK((short)9);
    this.bUG = localaqL.aCR();
    this.bUG.a(new diV());
  }

  public void initialize()
  {
    super.initialize();
    this.dcN.c(this);
  }

  public cjK Ub()
  {
    return new beb();
  }

  public beb k(agg paramagg)
  {
    beb localbeb = (beb)super.a(paramagg);
    localbeb.aSf = this.aSf;
    localbeb.bUG.b(this.bUG);
    localbeb.initialize();
    return localbeb;
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

  public void brW()
  {
    ary.aDT().a(getId(), this);
  }

  public void aMa()
  {
    ary.aDT().di(getId());
  }

  public cCq Uc() {
    return this.bUG;
  }

  public void a(cqm paramcqm) {
    if ((paramcqm.adb() == eu.ayM) && 
      (cz("AnimHit")))
      this.bUG.na("AnimHit");
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
    super.d(paramInt1, paramInt2, paramShort);
    if (this.bUG.cyG() != null)
      this.bUG.cyG().k(paramInt1, paramInt2, paramShort);
  }

  public boolean isVisible()
  {
    return true;
  }

  public float getAltitude()
  {
    return fc();
  }

  public float getWorldX()
  {
    return fa();
  }

  public float getWorldY()
  {
    return fb();
  }

  public float atu() {
    return 0.0F;
  }

  public void x(float paramFloat1, float paramFloat2)
  {
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
  }

  public void dd(boolean paramBoolean) {
    if (paramBoolean) {
      axB.aIZ(); axB.a(this);
    } else {
      axB.aIZ(); axB.a(null);
    }
  }

  public boolean cz(String paramString) {
    if ("AnimMort".equals(paramString)) {
      return true;
    }
    if ("AnimAttaque".equals(paramString)) {
      return true;
    }
    if ("AnimHit".equals(paramString)) {
      return true;
    }
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