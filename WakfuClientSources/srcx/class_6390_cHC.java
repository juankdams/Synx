import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

class cHC
  implements PaintListener
{
  cHC(bPT parambPT)
  {
  }

  public void paintControl(PaintEvent paramPaintEvent)
  {
    Rectangle localRectangle1 = this.iCF.getBounds();
    Rectangle localRectangle2 = bPT.a(this.iCF).getBounds();
    paramPaintEvent.gc.drawImage(bPT.a(this.iCF), 0, 0, localRectangle2.width, localRectangle2.height, 0, 0, localRectangle1.width, localRectangle1.height);
  }
}