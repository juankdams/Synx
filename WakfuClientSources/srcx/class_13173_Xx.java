import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class Xx extends JPanel
{
  private Graphics cHP;
  private Image cHQ;

  public Xx(int paramInt1, int paramInt2)
  {
    Dimension localDimension = new Dimension(paramInt1, paramInt2);
    setSize(localDimension);
    setPreferredSize(localDimension);
    setMaximumSize(localDimension);
    setMinimumSize(localDimension);
    ajt();
  }

  private boolean ajt()
  {
    this.cHQ = createImage(getWidth(), getHeight());
    if (this.cHQ == null)
      return false;
    this.cHP = this.cHQ.getGraphics();
    this.cHP.clearRect(0, 0, getWidth(), getHeight());
    this.cHP.setColor(Color.GRAY);
    this.cHP.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
    return true;
  }

  public void paint(Graphics paramGraphics) {
    if (!ajt())
      super.paint(paramGraphics);
    paramGraphics.drawImage(this.cHQ, 0, 0, null);
  }

  public void update(Graphics paramGraphics) {
    paint(paramGraphics);
  }
}