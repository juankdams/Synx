import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.BitSet;

public final class cFH extends awr
  implements amo, dgL, dhy
{
  private static final short iAj = 1;
  private int aSf;
  private final cCq bUG;
  private cUo iAk;

  private cFH()
  {
    this.bUG = new aqL(this).aCR();
    this.bUG.a(new diV());
  }

  public cFH(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
    this.aSf = paramInt3;
    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1);
    localaqL.aK((short)1);
    this.bUG = localaqL.aCR();
    this.bUG.a(new diV());
  }

  protected cFH cAY()
  {
    return new cFH();
  }

  public cFH r(agg paramagg)
  {
    cFH localcFH = (cFH)super.a(paramagg);
    localcFH.aSf = this.aSf;
    localcFH.bUG.b(this.bUG);
    localcFH.initialize();
    return localcFH;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc)
  {
  }

  public int uN() {
    return this.aSf;
  }

  public cCq Uc() {
    return this.bUG;
  }

  public cUo aeM() {
    return this.iAk;
  }

  public void j(cUo paramcUo) {
    this.iAk = paramcUo;
  }

  public void b(cYl paramcYl)
  {
    super.b(paramcYl);

    del localdel = new del(this);
    localdel.c(paramcYl);
    localdel.d(18106);
    localdel.c(true);
    cjO.clE().j(localdel);
  }

  public void Vk()
  {
    super.Vk();
    bOX.bVM().r(this);
    if (this.ejP.LC().j(this)) {
      if ((aIq() instanceof b)) {
        arl localarl = byv.bFN().bFO().bGv();
        if ((localarl != null) && (localarl.getId() == ((b)aIq()).a())) {
          bOX.bVM().a(this, localarl);
        }
      }
      ((aTL)WakfuClientInstance.awy().Dg()).a(bOX.bVM());
    }
  }

  public void q(int paramInt1, int paramInt2, short paramShort)
  {
    super.q(paramInt1, paramInt2, paramShort);
    bOX.bVM().p(this);
    ((aTL)WakfuClientInstance.awy().Dg()).a(bOX.bVM());
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
    if ("AnimMort".equals(paramString)) {
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