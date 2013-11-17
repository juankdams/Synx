import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;

class axF extends MouseTrackAdapter
{
  axF(pC parampC)
  {
  }

  public void mouseEnter(MouseEvent paramMouseEvent)
  {
    pC.a(this.dMT, 1);
    this.dMT.redraw();
  }

  public void mouseExit(MouseEvent paramMouseEvent)
  {
    pC.a(this.dMT, 0);
    this.dMT.redraw();
  }
}