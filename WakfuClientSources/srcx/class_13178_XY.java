import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.HashSet;
import javax.media.opengl.GL;

class XY
  implements xn
{
  XY(dSz paramdSz)
  {
  }

  public void a(bSr parambSr)
  {
    GL localGL = (GL)parambSr.bZk();

    a(parambSr, localGL, dSz.d(this.cIB));

    this.cIB.o(localGL);
    this.cIB.kKn.a(parambSr);

    a(parambSr, localGL, dSz.e(this.cIB));
  }

  private void a(bSr parambSr, GL paramGL, ArrayList paramArrayList) {
    if (!dSz.f(this.cIB))
      return;
    for (int i = 0; i < paramArrayList.size(); i++) {
      aRm localaRm = (aRm)paramArrayList.get(i);
      localaRm.o(paramGL);
      localaRm.kKn.a(parambSr);
    }
  }

  public void b(Entity paramEntity)
  {
  }

  public void a(Entity paramEntity, int paramInt)
  {
  }

  public void clear()
  {
  }

  public void a(HashSet paramHashSet)
  {
  }
}