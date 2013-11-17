import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;

public class Tt extends JComponent
{
  public static final Logger K = Logger.getLogger(Tt.class);
  private Image cwr;

  public Tt()
  {
    this(null);
  }

  public Tt(Image paramImage) {
    setBorder(new EmptyBorder(0, 0, 0, 0));
    setOpaque(true);
    setDoubleBuffered(true);
    this.cwr = paramImage;
  }

  public void setImage(Image paramImage) {
    this.cwr = paramImage;
    repaint();
  }

  protected void paintComponent(Graphics paramGraphics) {
    if (this.cwr == null)
      return;
    paramGraphics.drawImage(this.cwr, 0, 0, getWidth(), getHeight(), null);
  }

  protected void paintBorder(Graphics paramGraphics)
  {
  }
}