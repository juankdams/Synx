import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.sun.opengl.cg.CGpass;
import com.sun.opengl.cg.CgGL;

public class cZh extends dHr
{
  private static CGpass kMR;
  private final CGpass kMS;

  public cZh(CGpass paramCGpass)
  {
    this.kMS = paramCGpass;
  }

  public final void a(bSr parambSr, Entity paramEntity)
  {
    if (kMR != this.kMS) {
      reset();

      CgGL.cgSetPassState(this.kMS);
      kMR = this.kMS;
    }
    paramEntity.p(parambSr);
  }

  public final void reset()
  {
    if (kMR == null) {
      return;
    }
    CgGL.cgResetPassState(kMR);
    dsZ.cZe().reset();
    kMR = null;
  }
}