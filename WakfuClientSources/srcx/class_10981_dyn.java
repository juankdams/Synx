import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;

class dyn
  implements PaintListener
{
  dyn(VH paramVH)
  {
  }

  public void paintControl(PaintEvent paramPaintEvent)
  {
    VH.a(this.eOm, paramPaintEvent.gc);
  }
}