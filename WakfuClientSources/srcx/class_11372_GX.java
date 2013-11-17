import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;

public abstract class GX
  implements dKW
{
  protected bNa bPm = null;

  public void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }

    this.bPm = parambNa;
  }

  public bNa getModulationColor() {
    return this.bPm;
  }

  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat);

  public abstract void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9);

  public abstract Entity getEntity();

  public abstract void aJ();

  public void bc()
  {
    this.bPm = null;
  }

  public abstract void setHorizontal(boolean paramBoolean);

  public abstract void setColor(bNa parambNa);

  public abstract bNa getColor();

  public abstract void setBorderColor(bNa parambNa);

  public abstract bNa getBorderColor();

  public abstract void setFullCirclePercentage(float paramFloat);

  public abstract float getFullCirclePercentage();

  public abstract void setDeltaAngle(float paramFloat);

  public abstract float getDeltaAngle();

  public abstract void setPosition(aFG paramaFG);

  public abstract aFG getPosition();

  public abstract void setBorder(Insets paramInsets);

  public abstract Insets getBorder();
}