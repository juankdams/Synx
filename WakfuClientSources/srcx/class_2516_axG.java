import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;

class axG extends MouseAdapter
{
  axG(pC parampC)
  {
  }

  public void mouseDown(MouseEvent paramMouseEvent)
  {
    pC.a(this.dMT, true);
    pC.a(this.dMT, 2);
    this.dMT.redraw();
  }

  public void mouseUp(MouseEvent paramMouseEvent)
  {
    pC.a(this.dMT, false);
    pC.a(this.dMT, 1);
    if ((paramMouseEvent.x < 0) || (paramMouseEvent.y < 0) || (paramMouseEvent.x > this.dMT.getBounds().width) || (paramMouseEvent.y > this.dMT.getBounds().height))
    {
      pC.a(this.dMT, 0);
    }
    this.dMT.redraw();
    if (pC.a(this.dMT) == 1)
      this.dMT.notifyListeners(13, new Event());
  }
}