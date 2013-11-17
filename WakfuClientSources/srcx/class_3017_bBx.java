import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public abstract class bBx
{
  protected final ArrayList gup = new ArrayList(128);
  private static bBx guq = dvo.lAI;

  public void reset()
  {
    int i = 0; for (int j = this.gup.size(); i < j; i++) {
      Entity localEntity1 = (Entity)this.gup.get(i);
      if (localEntity1.bpu() >= 0)
      {
        if ((localEntity1 instanceof EntityGroup)) {
          ArrayList localArrayList = localEntity1.aSj();
          for (int k = 0; k < localArrayList.size(); k++) {
            Entity localEntity2 = (Entity)localArrayList.get(k);
            localEntity2.dsJ();
            localEntity1.a(FB.bMT);
            localEntity1.b(FB.bMT);
          }
        } else {
          localEntity1.dsJ();
          localEntity1.a(FB.bMT);
          localEntity1.b(FB.bMT);
        }
      }
    }
    this.gup.clear();
  }

  public void H(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      Entity localEntity1 = (Entity)paramArrayList.get(j);
      if ((localEntity1.mnT & 0x1) != 0)
      {
        int k = localEntity1.aEh;
        int m = localEntity1.aEi;
        int n = localEntity1.aEf;
        int i1 = localEntity1.aEg;
        float f1 = localEntity1.mnQ + localEntity1.mnR;
        float f2 = localEntity1.mnS + localEntity1.hYO * 0.666F;
        int i2 = this.gup.size();
        for (int i3 = j + 1; i3 < i; i3++) {
          Entity localEntity2 = (Entity)paramArrayList.get(i3);
          if ((localEntity2.mnT & 0x2) != 0)
          {
            if (localEntity2.aEf < k)
            {
              if (localEntity2.aEg < m)
              {
                if (localEntity2.aEh > n)
                {
                  if (localEntity2.aEi > i1)
                  {
                    if (localEntity2.mnS + localEntity2.hYO > f2)
                    {
                      if (localEntity2.mnQ + localEntity2.mnR > f1)
                      {
                        c(localEntity1, localEntity2);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        b(i2, localEntity1);
      }
    }
  }

  public abstract dQp bKH();

  protected abstract void b(int paramInt, Entity paramEntity);

  public void a(Matrix44 paramMatrix44, cuA paramcuA) {
  }

  public abstract void e(cXf paramcXf);

  protected void c(Entity paramEntity1, Entity paramEntity2) { this.gup.add(paramEntity2); }

  public static bBx bKI()
  {
    return guq;
  }

  public static void a(bBx parambBx) {
    guq = parambBx;
  }
}