import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public class zR
{
  static final adz buL = new adz();

  public float bmK = 0.001F;
  public float buM = 2.0F;
  public float buN = 10.0F;
  private float buO = 0.0F;

  public void a(btb parambtb, int paramInt)
  {
    this.buO += paramInt;

    ArrayList localArrayList = parambtb.bBj();
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      Kn localKn = (Kn)localArrayList.get(i);
      if (localKn != null)
      {
        DisplayedScreenElement[] arrayOfDisplayedScreenElement1 = localKn.UT();
        if (arrayOfDisplayedScreenElement1 != null)
        {
          for (DisplayedScreenElement localDisplayedScreenElement : arrayOfDisplayedScreenElement1)
            if (localDisplayedScreenElement.isVisible())
            {
              int m = localDisplayedScreenElement.bpc().ddL().getId();
              if (buL.contains(m))
              {
                float f1 = localDisplayedScreenElement.fa();
                float f2 = localDisplayedScreenElement.fb();

                float f3 = (float)Math.sqrt(f1 * f1 + f2 * f2) + this.buM * this.buO / 1000.0F;
                float f4 = this.bmK * bCO.bH(6.283186F * f3 / this.buN);

                if (f4 < 0.0F)
                  f4 *= 0.2F;
                BatchTransformer localBatchTransformer = localDisplayedScreenElement.GG().dsE();
                float f5 = localBatchTransformer.aGp().Fj()[12];
                float f6 = localBatchTransformer.aGp().Fj()[13];
                localBatchTransformer.aGp().f(new float[] { 1.0F + f4, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F + f4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f5, f6, 0.0F, 1.0F });
              }
            }
        }
      }
    }
  }

  static
  {
    buL.hL(10208);
    buL.hL(11138);
    buL.hL(10036);
    buL.hL(10211);
    buL.hL(17702);

    buL.hL(17704);
    buL.hL(17712);
    buL.hL(17713);
    buL.hL(17755);
    buL.hL(17756);
  }
}