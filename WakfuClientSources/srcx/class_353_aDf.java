import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class aDf extends MouseAdapter
  implements MouseMotionListener
{
  private final JFrame dXQ;
  private Dimension minimumSize;
  private Component source;
  private boolean dXR = false;
  private boolean dXS = false;
  private ArrayList dXT = new ArrayList();
  private Point dXU;
  private Dimension size;
  private boolean bur;

  public aDf(JFrame paramJFrame, Component[] paramArrayOfComponent)
  {
    this.bur = true;
    this.dXQ = paramJFrame;
    for (Component localComponent : paramArrayOfComponent)
      c(localComponent);
  }

  public void setMinimumSize(Dimension paramDimension)
  {
    this.minimumSize = paramDimension;
  }

  public void a(JComponent[] paramArrayOfJComponent)
  {
    for (JComponent localJComponent : paramArrayOfJComponent)
      if (!this.dXT.contains(localJComponent))
        this.dXT.add(localJComponent);
  }

  public void a(Component[] paramArrayOfComponent)
  {
    for (Component localComponent : paramArrayOfComponent)
    {
      localComponent.removeMouseListener(this);
    }
  }

  public void setEnabled(boolean paramBoolean)
  {
    this.bur = paramBoolean;
  }

  public void c(Component paramComponent)
  {
    paramComponent.addMouseListener(this);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (!this.bur) {
      return;
    }
    a(paramMouseEvent);
  }

  private void a(MouseEvent paramMouseEvent)
  {
    if (!this.dXQ.isResizable())
      return;
    if (this.dXQ.getExtendedState() == 6) {
      return;
    }
    this.source = paramMouseEvent.getComponent();
    this.source.addMouseMotionListener(this);
    this.dXU = new Point(paramMouseEvent.getPoint());
    Point localPoint = SwingUtilities.convertPoint(this.source, this.dXU, this.dXQ);

    this.dXR = (localPoint.x >= this.dXQ.getWidth() - 10);
    this.dXS = (localPoint.y >= this.dXQ.getHeight() - 10);

    SwingUtilities.convertPointToScreen(this.dXU, this.source);
    this.size = this.dXQ.getSize();
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    if (this.source == null) {
      return;
    }
    Point localPoint = MouseInfo.getPointerInfo().getLocation();
    int i = this.size.width;
    int j = this.size.height;

    if (this.dXR)
      i += localPoint.x - this.dXU.x;
    if (this.dXS) {
      j += localPoint.y - this.dXU.y;
    }
    if (this.minimumSize != null)
    {
      if (i < this.minimumSize.width)
        i = this.minimumSize.width;
      if (j < this.minimumSize.height) {
        j = this.minimumSize.height;
      }
    }
    this.dXQ.setSize(i, j);

    this.dXQ.setVisible(true);
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.source != null)
      this.source.removeMouseMotionListener(this);
    this.source = null;
  }
}