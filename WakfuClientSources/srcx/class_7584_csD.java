import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.awt.Insets;

public abstract class csD extends aoe
  implements axl
{
  protected boolean aQS;

  public boolean isDirty()
  {
    return this.aQS;
  }

  public abstract bOu getMesh();

  public abstract Entity getEntity();

  public void b(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    getMesh().a(paramDimension, paramInsets1, paramInsets2, paramInsets3);
  }

  public void aJ()
  {
    super.aJ();

    this.aQS = false;
  }
}