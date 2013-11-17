import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.awt.Insets;

public abstract interface axl extends cUd
{
  public abstract boolean isDirty();

  public abstract bOu getMesh();

  public abstract Entity getEntity();

  public abstract void b(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3);
}