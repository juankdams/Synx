import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public final class dLR extends cDg
  implements amo, awH, dhy
{
  private static final short mca = 6;
  private int aSf;
  private final cCq bUG;
  private CellParticleSystem hji;

  private dLR()
  {
    this.bUG = new aqL(this).aK((short)6).aCR();
    this.bUG.a(new wo());
  }

  public dLR(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat1, String paramString1, String paramString2, String paramString3, String paramString4, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt4, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);

    this.aSf = paramInt3;
    aqL localaqL = new aqL(this).fl(paramString3).fm(paramString4).fk(paramString2).fj(paramString1).aK((short)6);
    this.bUG = localaqL.aCR();
    this.bUG.a(new wo());
  }

  public void d(int paramInt1, int paramInt2, short paramShort) {
    super.d(paramInt1, paramInt2, paramShort);
    if (this.bUG.cyG() != null)
      this.bUG.cyG().k(paramInt1, paramInt2, paramShort);
  }

  public cjK Ub()
  {
    return new dLR();
  }

  public dLR v(agg paramagg) {
    dLR localdLR = (dLR)super.q(paramagg);
    localdLR.aSf = this.aSf;
    localdLR.bUG.b(this.bUG);
    localdLR.iwt = this.iwt;
    localdLR.initialize();
    return localdLR;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, aVc paramaVc) {
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
    if ("AnimMort".equals(paramString)) {
      return true;
    }
    if ("AnimAttaque".equals(paramString)) {
      return true;
    }
    if ("AnimHit".equals(paramString)) {
      return b(eu.ayM);
    }
    return false;
  }

  public void dd(boolean paramBoolean) {
    super.dd(paramBoolean);
    switch (czh()) {
    case 1:
      if (axG() != byv.bFN().bFO())
      {
        ckT localckT = bOX.bVM().mD();
        if (localckT == null) {
          return;
        }

        aJD localaJD = localckT.LC();
        if (localaJD == null) {
          return;
        }

        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localaJD.bbj().iterator();
        while (localIterator.hasNext()) {
          cjK localcjK = (cjK)localIterator.next();
          if (localcjK.getType() == xj.bpk.xj())
          {
            hq localhq = (hq)localcjK;
            if (localhq.axG() == axG())
              localArrayList.add(localhq);
          }
        }
        for (int i = 0; i < localArrayList.size(); i++) {
          if (paramBoolean)
            bOX.bVM().a((cjK)localArrayList.get(i), localckT);
          else {
            bOX.bVM().r((cjK)localArrayList.get(i));
          }
        }
        bOX.bVM().update();
      }break;
    }
  }

  public void brW()
  {
    super.brW();
    ary.aDT().a(getId(), this);
  }

  public void aMa() {
    super.aMa();
  }

  public void x(float paramFloat1, float paramFloat2) {
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
  }

  public float atu() {
    return 0.0F;
  }

  public boolean isVisible() {
    return true;
  }

  public String getName() {
    if (this.bUG != null) {
      return this.bUG.getName();
    }

    return "";
  }
}