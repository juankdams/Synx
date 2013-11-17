import java.util.ArrayList;
import java.util.BitSet;

public final class cmc extends aYV
  implements dhy, rE
{
  private int aSf;
  private final cCq bUG;

  private cmc()
  {
    this.bUG = new aqL(this).aCR();
  }

  public cmc(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;
    aqL localaqL = new aqL(this);
    localaqL.fl(paramString3).fm(paramString4).fk(paramString2).fj("");
    this.bUG = localaqL.aCR();
  }

  public cjK Ub()
  {
    return new cmc();
  }

  public cmc p(agg paramagg)
  {
    cmc localcmc = (cmc)super.a(paramagg);
    localcmc.aSf = this.aSf;
    localcmc.bUG.b(this.bUG);
    localcmc.initialize();
    return localcmc;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc)
  {
  }

  public int uN() {
    return this.aSf;
  }

  public int fd() {
    return 0;
  }

  public bNa ff() {
    return bNa.gRx;
  }

  public String fe() {
    lZ locallZ = new lZ();
    String str = bU.fH().b(6, (int)clt(), new Object[0]);
    if (cOg.i(str))
      locallZ.tz().a(str).tA();
    ArrayList localArrayList = cxo.a(new axj(this, this.cZu, 0));
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      locallZ.tH().a((CharSequence)localArrayList.get(i));
    }
    return locallZ.tP();
  }

  public cCq Uc() {
    return this.bUG;
  }

  public void release()
  {
    super.release();
    axB.aIZ().a(this);
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