import java.awt.Color;
import java.awt.Graphics;

public class aNu
{
  private final cEl ety;
  private final Color dWl;

  public aNu(cEl paramcEl, Color paramColor)
  {
    this.ety = paramcEl;
    this.dWl = paramColor;
  }

  public aNu(float paramFloat1, float paramFloat2, Color paramColor) {
    this.ety = new cEl(paramFloat1, paramFloat2);
    this.dWl = paramColor;
  }

  private void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(this.dWl);
    paramGraphics.drawOval(Math.round(this.ety.getX() + paramInt1 - 2.5F), Math.round(-this.ety.getY() + paramInt2 - 2.5F), 5, 5);
  }
}