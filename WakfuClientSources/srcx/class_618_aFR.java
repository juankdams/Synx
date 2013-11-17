import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

class aFR extends rh
{
  private static final int ecU = 18;
  private static final int ecV = 18;
  private float ecW = 0.0F;

  void a(adG paramadG)
  {
    super.a(paramadG);
    this.aYY = true;
  }

  void stop()
  {
    super.stop();
    this.aYY = false;
  }

  void a(adG paramadG, float paramFloat1, float paramFloat2)
  {
    if (!this.aYY) {
      return;
    }

    float f1 = paramFloat2 * paramFloat1;

    float f2 = -0.3F * f1;
    float f3 = f2 / 2.0F;
    this.ecW += 0.1745329F * f1;

    ArrayList localArrayList = acL.apd().cMP();
    int i = 0; for (int j = localArrayList.size(); i < j; i++)
      a(f3, (azX)localArrayList.get(i));
  }

  private void a(float paramFloat, azX paramazX)
  {
    Entity localEntity = paramazX.getEntity();
    if (localEntity == null) {
      return;
    }

    BatchTransformer localBatchTransformer = localEntity.dsE();
    cxn localcxn = (cxn)localBatchTransformer.sz(0);
    Matrix44 localMatrix44 = localcxn.cuO();

    if (!cSO.c(paramazX.aLU())) {
      if (!localMatrix44.isIdentity()) {
        localMatrix44.Ls();
        localcxn.bMH();
        localBatchTransformer.bMH();
      }
      return;
    }

    float f1 = paramazX.getWorldX() * paramazX.getWorldY() * 1.0F * 0.01745329F;
    float f2 = paramFloat + paramFloat * bCO.bH(this.ecW + f1);
    localMatrix44.c(4, f2);
    localcxn.bMH();
    localBatchTransformer.bMH();
  }
}