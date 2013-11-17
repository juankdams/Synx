import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import org.apache.log4j.Logger;

public abstract class dQp
{
  private static final Logger K = Logger.getLogger(dQp.class);
  protected Entity3D mky;

  public Entity3D asP()
  {
    return this.mky;
  }

  public void reset() {
    if ((!bB) && (this.mky == null)) throw new AssertionError();
    this.mky.axl();
    this.mky = null;
  }

  public EntityGroup b(ahm paramahm) {
    EntityGroup localEntityGroup = (EntityGroup)EntityGroup.ecY.bQy();
    localEntityGroup.mnU = paramahm;

    if ((!bB) && (this.mky != null)) throw new AssertionError();
    this.mky = paramahm.asO();
    localEntityGroup.d(this.mky);
    return localEntityGroup;
  }

  public abstract void S(boolean paramBoolean);
}