import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.GC;

class dyo
  implements DisposeListener
{
  dyo(VH paramVH)
  {
  }

  public void widgetDisposed(DisposeEvent paramDisposeEvent)
  {
    this.eOm.stop();

    if (VH.a(this.eOm) != null)
      VH.a(this.eOm).dispose();
  }
}