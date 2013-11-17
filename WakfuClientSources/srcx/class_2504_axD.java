import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Rectangle;

class axD
  implements MouseMoveListener
{
  axD(pC parampC)
  {
  }

  public void mouseMove(MouseEvent paramMouseEvent)
  {
    if (!pC.e(this.dMT)) {
      return;
    }
    pC.a(this.dMT, 2);
    if ((paramMouseEvent.x < 0) || (paramMouseEvent.y < 0) || (paramMouseEvent.x > this.dMT.getBounds().width) || (paramMouseEvent.y > this.dMT.getBounds().height))
    {
      pC.a(this.dMT, 0);
    }
    this.dMT.redraw();
  }
}