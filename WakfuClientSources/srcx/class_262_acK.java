import java.util.ArrayList;
import java.util.BitSet;

public final class acK extends chy
  implements amo, dhy, rE
{
  private int aSf;
  private final cCq bUG;

  private acK()
  {
    this.bUG = new aqL(this).aCR();
  }

  public acK(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;

    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    this.bUG = localaqL.aCR();
  }

  public cjK Ub()
  {
    return new acK();
  }

  public acK e(agg paramagg)
  {
    acK localacK = (acK)super.a(paramagg);
    localacK.aSf = this.aSf;
    localacK.bUG.b(this.bUG);
    localacK.initialize();
    return localacK;
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

  public int fd() {
    return 0;
  }

  public bNa ff() {
    return bNa.gRx;
  }

  public String fe() {
    lZ locallZ = new lZ();
    locallZ.tz().a(bU.fH().b(6, (int)clt(), new Object[0])).tA();
    ArrayList localArrayList = cxo.a(new axj(this, this.cZu, 0));
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      locallZ.tH().a((CharSequence)localArrayList.get(i));
    }
    return locallZ.tP();
  }

  public String getName()
  {
    if (this.bUG != null) {
      return this.bUG.getName();
    }

    return "";
  }
}