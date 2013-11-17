import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;

class axK
  implements PaintListener
{
  axK(pC parampC)
  {
  }

  public void paintControl(PaintEvent paramPaintEvent)
  {
    switch (pC.a(this.dMT))
    {
    case 0:
      paramPaintEvent.gc.drawImage(pC.b(this.dMT), 0, 0);
      break;
    case 1:
      paramPaintEvent.gc.drawImage(pC.c(this.dMT), 0, 0);
      break;
    case 2:
      paramPaintEvent.gc.drawImage(pC.d(this.dMT), 0, 0);
    }
  }
}