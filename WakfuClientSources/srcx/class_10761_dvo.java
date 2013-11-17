import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class dvo extends bBx
{
  private static final Logger K = Logger.getLogger(dvo.class);

  public static final dvo lAI = new dvo();

  private final cEh lAJ = new cEh();
  private final cEh lAK = new cEh();
  private final HashMap lAL = new HashMap();

  public void reset()
  {
    super.reset();
    this.lAL.clear();
  }

  public dQp bKH()
  {
    return new sz();
  }

  protected void b(int paramInt, Entity paramEntity)
  {
    int i = this.gup.size();
    if (i - paramInt <= 0) {
      return;
    }

    bkk localbkk = Pb.aaU().aaV();
    int j = !localbkk.pZ(cmL.hRH) ? 1 : 0;
    int k;
    int i1;
    if (j == 0) {
      k = paramEntity.aEh;
      int m = paramEntity.aEi;
      int n = paramEntity.aEf;
      i1 = paramEntity.aEg;

      for (int i2 = paramInt; i2 < i; i2++) {
        Entity localEntity3 = (Entity)this.gup.get(i2);
        float[] arrayOfFloat = (float[])this.lAL.get(localEntity3);
        if (arrayOfFloat == null) {
          arrayOfFloat = new float[4];
          this.lAL.put(localEntity3, arrayOfFloat);

          arrayOfFloat[0] = n;
          arrayOfFloat[1] = k;
          arrayOfFloat[2] = i1;
          arrayOfFloat[3] = m;
        } else {
          if (n < arrayOfFloat[0]) {
            arrayOfFloat[0] = n;
          }
          if (k > arrayOfFloat[1]) {
            arrayOfFloat[1] = k;
          }
          if (i1 < arrayOfFloat[2]) {
            arrayOfFloat[2] = i1;
          }
          if (m > arrayOfFloat[3])
            arrayOfFloat[3] = m;
        }
      }
    }
    else {
      for (k = paramInt; k < i; k++) {
        Entity localEntity1 = (Entity)this.gup.get(k);
        localEntity1.a(cLG.iLe);
        localEntity1.b(bcW.fnv);
        if ((localEntity1 instanceof EntityGroup)) {
          ArrayList localArrayList = localEntity1.aSj();
          for (i1 = 0; i1 < localArrayList.size(); i1++) {
            Entity localEntity2 = (Entity)localArrayList.get(i1);
            localEntity2.a(cLG.iLe);
            localEntity2.b(bcW.fnv);
          }
        } else {
          localEntity1.a(cLG.iLe);
          localEntity1.b(bcW.fnv);
        }
      }
    }
  }

  public void a(Matrix44 paramMatrix44, cuA paramcuA)
  {
    if (this.lAL.isEmpty()) {
      return;
    }

    bkk localbkk = Pb.aaU().aaV();

    int i = paramcuA.getScreenWidth();
    int j = paramcuA.getScreenHeight();
    float f1 = paramcuA.getZoomFactor();
    float f2 = f1 / i;
    float f3 = f1 / j;

    for (Map.Entry localEntry : this.lAL.entrySet()) {
      Entity localEntity1 = (Entity)localEntry.getKey();
      float[] arrayOfFloat = (float[])localEntry.getValue();

      float f4 = arrayOfFloat[1] - arrayOfFloat[0] - 1.0F;
      if (f4 < 48.0F) {
        f4 = 48.0F;
      }
      float f5 = arrayOfFloat[3] - arrayOfFloat[2] - 1.0F;
      float f6 = f4 * f2 * bCO.gxu;
      float f7 = f5 * f3 * bCO.gxu;

      float f8 = (arrayOfFloat[0] + arrayOfFloat[1]) / 2.0F;
      float f9 = (arrayOfFloat[2] + arrayOfFloat[3]) / 2.0F;

      this.lAJ.h(f8, f9, 0.0F, 1.0F);
      paramMatrix44.b(this.lAJ, this.lAK);
      this.lAK.aOR *= 2.0F / i;
      this.lAK.aOS *= 2.0F / j;

      cgR localcgR = new cgR(cmL.hSj);
      localcgR.a("gAlphaMaskRadius", f6, f7);
      localcgR.a("gAlphaMaskPos", this.lAK.aOR, this.lAK.aOS);

      if ((localEntity1 instanceof EntityGroup)) {
        ArrayList localArrayList = localEntity1.aSj();
        for (int k = 0; k < localArrayList.size(); k++) {
          Entity localEntity2 = (Entity)localArrayList.get(k);
          localEntity2.a(localbkk, cmL.hRI, localcgR);
        }
      } else {
        localEntity1.a(localbkk, cmL.hRH, localcgR);
      }
    }
  }

  public void e(cXf paramcXf)
  {
  }
}