import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class cBX extends MouseAdapter
  implements MouseMotionListener
{
  private final JFrame dXQ;
  private Component source;
  private Point dXU;
  private Point iug;
  private cws[] iuh;

  public cBX(JFrame paramJFrame, Component[] paramArrayOfComponent)
  {
    this.dXQ = paramJFrame;
    b(paramArrayOfComponent);
  }

  public void a(Component[] paramArrayOfComponent)
  {
    for (Component localComponent : paramArrayOfComponent)
      localComponent.removeMouseListener(this);
  }

  public void b(Component[] paramArrayOfComponent)
  {
    for (Component localComponent : paramArrayOfComponent)
      localComponent.addMouseListener(this);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    l(paramMouseEvent);
  }

  private void l(MouseEvent paramMouseEvent)
  {
    if (this.dXQ.getExtendedState() == 6) {
      return;
    }
    this.source = paramMouseEvent.getComponent();
    this.source.addMouseMotionListener(this);

    GraphicsDevice[] arrayOfGraphicsDevice = cRd.kDt.getScreenDevices();

    this.iuh = new cws[arrayOfGraphicsDevice.length];
    for (int i = 0; i < arrayOfGraphicsDevice.length; i++)
    {
      GraphicsDevice localGraphicsDevice = arrayOfGraphicsDevice[i];
      GraphicsConfiguration localGraphicsConfiguration = localGraphicsDevice.getDefaultConfiguration();
      Rectangle localRectangle = localGraphicsConfiguration.getBounds();
      Insets localInsets = Toolkit.getDefaultToolkit().getScreenInsets(localGraphicsConfiguration);
      cws localcws = new cws(this, null);
      localcws.left = ((int)localRectangle.getMinX());
      localcws.right = ((int)localRectangle.getMaxX());
      localcws.minY = ((int)localRectangle.getMinY() + localInsets.top);
      localcws.ihR = ((int)localRectangle.getMaxY() - localInsets.bottom);
      this.iuh[i] = localcws;
    }

    this.dXU = new Point(paramMouseEvent.getPoint());
    SwingUtilities.convertPointToScreen(this.dXU, this.source);
    this.iug = this.dXQ.getLocation();
  }

  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    if ((this.source == null) || (this.iuh == null)) {
      return;
    }
    Point localPoint = MouseInfo.getPointerInfo().getLocation();

    int i = localPoint.x - this.dXU.x;
    int j = localPoint.y - this.dXU.y;
    int k = this.iug.x + i;
    int m = this.iug.y + j;
    for (int n = 0; n < this.iuh.length; n++)
    {
      cws localcws = this.iuh[n];
      if ((localPoint.x >= localcws.left) && (localPoint.x < localcws.right))
        m = Math.max(Math.min(m, localcws.ihR), localcws.minY);
    }
    this.dXQ.setLocation(k, m);
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.source != null)
    {
      this.source.removeMouseMotionListener(this);
      this.source = null;
    }
    this.iuh = null;
  }
}