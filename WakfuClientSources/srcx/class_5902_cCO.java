import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

public abstract class cCO extends bOu
{
  private static Logger K = Logger.getLogger(cCO.class);

  protected Insets ivy = new Insets(0, 0, 0, 0);

  public Insets getInsets()
  {
    return this.ivy;
  }

  public void setInsets(Insets paramInsets)
  {
    this.ivy.top = paramInsets.top;
    this.ivy.bottom = paramInsets.bottom;
    this.ivy.left = paramInsets.left;
    this.ivy.right = paramInsets.right;
  }

  public abstract void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3);
}