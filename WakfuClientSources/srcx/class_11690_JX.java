import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.widgets.Display;

class JX
  implements ProgressListener
{
  JX(bVj parambVj)
  {
  }

  public void changed(ProgressEvent paramProgressEvent)
  {
  }

  public void completed(ProgressEvent paramProgressEvent)
  {
    Display.getCurrent().wake();
  }
}