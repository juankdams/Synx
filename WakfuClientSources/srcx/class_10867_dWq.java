import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

public abstract class dWq
{
  private static final Logger K = Logger.getLogger(dWq.class);
  private Entity mwG;

  public final Entity getEntity()
  {
    return this.mwG;
  }

  public final void init() {
    this.mwG = Jr();
    this.mwG.mnU = this;
    Jq();
  }

  protected abstract void Jq();

  protected abstract Entity Jr();

  public void clear() {
    this.mwG.axl();
    this.mwG = null;
  }

  public void h(uz paramuz)
  {
  }

  public abstract void a(bah parambah);
}